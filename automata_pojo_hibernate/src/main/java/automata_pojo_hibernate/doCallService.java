package automata_pojo_hibernate;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import automata_pojo_hibernate.hibernate.Request;
import automata_pojo_hibernate.hibernate.RequestItems;
import automata_pojo_hibernate.hibernate.RequestParameters;
import automata_pojo_hibernate.hibernate.Response;
import automata_pojo_hibernate.hibernate.ServiceProvider;
import scala.util.control.Exception.Finally;

import javax.annotation.PostConstruct;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class doCallService {
	 @Autowired
	    private ConnectionFactory connectionFactory;
	    private JmsTemplate jmsTemplate;
	    private static String return_value = "";

	    @PostConstruct
	    public void init() {
	        this.jmsTemplate = new JmsTemplate(connectionFactory);
	    }
	    public String doCallStartProcessing(String queueName) throws Exception {
			Message message = jmsTemplate.receive(queueName);
	        TextMessage textMessage = (TextMessage) message;
	        String text = "";
	        int requestId = -1;
	        
			System.out.println("doCallService?doCallStartProcessing" + textMessage.toString());
			
			try {
	            text = textMessage.getText();	            
	            requestId = Integer.parseInt(text);
	            System.out.println("requestId: " + requestId);
	            return doCallService.doCallStartProcessing(requestId);
	            
	        } catch (JMSException e) {
	            e.printStackTrace();
	            return e.getMessage();
	        }
			
		}
	    
	    public static String doCallStartProcessing(int request_id) throws SQLException, Exception {
		PojoFactory factory = PojoFactory.getInstance();
		try {
			int CSRU_Service_id = 0;
			String outDir = "d:/Arpi/eclipse/response/" + request_id;
			//String outDir = "/home/arpi/java/" + request_id;
			
			
	        //load requests by ID
			List<Request> requests = factory.getRequests(request_id);		
	        for (Request myrow : requests) {        	
				System.out.println(myrow.toString());				
				CSRU_Service_id = myrow.getCsruServiceId();
			}
	        //Load request_parameters by request_id 
	        List<RequestParameters> request_parameters = factory.getRequest_parameters(request_id);
	        for (RequestParameters myrow : request_parameters) {		
				System.out.println(myrow.toString());
			}
	
	        int max_Request_Items_id = factory.get_max_Request_Items_id(); 
	        System.out.println(max_Request_Items_id);
	        
	        List<ServiceProvider> serc_prov = new ArrayList<ServiceProvider>();
	        
	        int request_type = factory.getRequestType(request_id);
	        /*
	         * 0 - new
	         * 1 - finished
	         * 2 - failed or not done
	         */
	        System.out.println(request_type);
	        List<RequestItems> Req_Items = new ArrayList<RequestItems>();
	        // Handling only the new or not successfully finished requests        
	        if(request_type != 1) {
	        	if(request_type == 0) {
	        		for (Request myrow : requests) {		
	        				System.out.println("create request_items record from reuest: " + myrow.toString());
	        				RequestItems ri = factory.set_Request_Items(myrow);
	        				System.out.println("Created new request_items: " + ri.toString());
	        				Req_Items.add(ri);
	        		}
	        		        		
	        	}
	        	if(request_type == 2) {
	        		Req_Items = factory.getNotProcessedRequest_Items(request_id);
	        		for (RequestItems ri : Req_Items) {
	        			System.out.println("Prepared not finished request_items: " + ri.toString());
	        		}
	        	}
	
	        	System.out.println("****************************Mapping****************************\n");
	        	int callResult = 0;
	        	for (RequestItems ri : Req_Items) {
	        		
	        		
	        		System.out.println("Prepared not finished request_items: " + ri.toString());
	        		
	    			//System.out.println("Prepared not finished request_items: " + ri.toString());
	        		ServiceProvider sp = factory.getService_Provider(ri.getId().getServiceProviderId() /*Service_Provider_id()*/);
	        		serc_prov.add(sp);
	        		System.out.println("Service_provider: " + sp.toString());
	        		String sp_name = sp.getMethodName();
	        		int call_s = 3;
	        		String ResponseXml = "";
	        		String myFile = "";
	        		//declaration request object
	        		I_vyhladajKonanie o_vyhladajKonanie = null;
	        		I_getKonanieDetail o_GetKonanieDetail =null;
	        		
	        		
	        		if(sp_name.equals((String) "vyhladajKonanie")) {        			           	
	    				o_vyhladajKonanie = new I_vyhladajKonanie();    				
	    				o_vyhladajKonanie.setURL(sp.getWsdlUrl());
	        		}
	        		if(sp_name.equals((String) "getKonanieDetail")) {  
	        			o_GetKonanieDetail = new I_getKonanieDetail();
	        			o_GetKonanieDetail.setURL(sp.getWsdlUrl());
	        		}
	        		
	        		for(RequestParameters re_pa:  factory.getRequest_parameters_by_SP_ID(sp.getServiceProviderId(), request_parameters)) {
	        			System.out.println("Service_parameter = " + re_pa.toString());
	        			String met_name = "set"+re_pa.getId().getParameterName();
	        			System.out.println(met_name);
	        			String par_value = re_pa.getId().getParameterValue();
	        			System.out.println(par_value);
	        			if(sp_name.equals((String) "vyhladajKonanie")) {  
		        			Method m = I_vyhladajKonanie.class.getDeclaredMethod(met_name,String.class);
		        	        m.invoke(o_vyhladajKonanie, par_value);
	        			
		        		}        			
	        			if(sp_name.equals((String) "getKonanieDetail")) {
	        				Method m = I_getKonanieDetail.class.getDeclaredMethod(met_name,String.class);
		        	        m.invoke(o_GetKonanieDetail, par_value);	              				
	        			}
	        		}
	        		ri.getId().setMethodCallDatetime(new Date());
	        		ri.getId().setStatus(2);   /*setstatus(2);*/
	        		System.out.println("Status set for request_items: " + ri.toString());
	        		factory.session.update(ri);
	        		//factory.commit();
	        		Date myDate = new Date();
	        		int myRequest_id= ri.getId().getRequestId();
	        		if(sp_name.equals((String) "vyhladajKonanie")) {  
	        			call_s =  o_vyhladajKonanie.callService();
	        			ResponseXml = XMLUtil.toXML(o_vyhladajKonanie.getVyhladajKonanieResponse());
	        			myFile = "VyhladajKonanieResponse_" + myRequest_id + "_" +  myDate.getTime() + ".xml";
	        		}
	        		if(sp_name.equals((String) "getKonanieDetail")) {
	        			call_s =  o_GetKonanieDetail.callService();
	        			ResponseXml = XMLUtil.toXML(o_GetKonanieDetail.getGetKonanieDetailResponse());
	        			myFile = "GetKonanieDetailResponse_" + myRequest_id + "_" +  myDate.getTime() + ".xml";
	        		}
	        		
	        		if( call_s== 0) {
	        			ri.getId().setStatus(0);
	        			System.out.println("request_items finished: " + ri.toString());
	        			System.out.println("request_items update: " + ri.toSave());
	        			//factory.execute_update(ri.toSave());
	        			factory.session.update(ri);
	        			//factory.commit();
	        			//factory.setRequest_ResponseTime(ri.getId().getRequestId(),ri.getId().getServiceProviderId());
	        			Write_Xml write = new Write_Xml();
	        			//System.out.println(myFile);
	        			write.whenWriteStringUsingBufferedWritter_thenCorrect(outDir,myFile, ResponseXml);
	        			//System.out.println(ResponseXml);
	        		} else {
	        			ri.getId().setStatus(1);
	        			
	        			factory.session.update(ri);
	        		}
	        		callResult = callResult + call_s;
	        		//factory.commit();
	    			
	    		}
	        	
	        	System.out.println("****************************Handle response****************************\n");
	        	System.out.println(callResult);
	        	Date respDate = new Date();
	        	if(callResult == 0) {
	        		Response resp = new Response();
	        		resp.setRequestId(request_id);
	        		resp.setCsruServiceId(CSRU_Service_id);
	        		resp.setResponseDate(respDate);
	        		resp.setOutputDir(outDir);
	        		factory.session.save(resp);    
	        		return_value = "OK|0|" + request_id + "|";
	        	} else {
	        		//factory.close();
	        		return_value =  "ERROR|2|" + request_id + "|";
	        	}
	        	
	        	
	        	
	        	
	        }
		} catch (Exception e) {
			return_value =   e.getMessage() + "|3|"  + request_id + "|";
			
		} finally {
			//factory.close();
			factory.commit();
			
		}
         
		return return_value;
		
	}
	

}
