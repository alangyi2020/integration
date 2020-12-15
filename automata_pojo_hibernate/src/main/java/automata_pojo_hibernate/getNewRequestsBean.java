package automata_pojo_hibernate;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;

@Component
public class getNewRequestsBean {
	 @Autowired
	    private ConnectionFactory connectionFactory;
	    private JmsTemplate jmsTemplate;

	    @PostConstruct
	    public void init() {
	        this.jmsTemplate = new JmsTemplate(connectionFactory);
	    }
	public String getID(String queueName) {
		Message message = jmsTemplate.receive(queueName);
        TextMessage textMessage = (TextMessage) message;
        
		System.out.println("getNewRequestsBean?getID" + textMessage.toString());
		return getNewRequestsBean.callDB();
	}
	
	
	public String getRouteID(String queueName) {
		System.out.println("getNewRequestsBean?getRouteID" + queueName);
		return getNewRequestsBean.callDB();
	}
	
	private static String callDB() {
		String rv = "OK|";
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();

	        
			//SQLQuery query = session.createSQLQuery("SELECT request_id,request_datetime, response_datetime,CSRU_Service_id,Service_Provider_id FROM soapdemo.Request");
	        SQLQuery query = session.createSQLQuery("select distinct a.request_id FROM soapdemo.Request a left join soapdemo.Response b on a.request_id = b.request_id where b.request_id is null");
			
			@SuppressWarnings("unchecked")
			List<Integer[]> rows =  query.list();
			for (int i = 0; i < rows.size(); i++) {					
			    rv = rv + String.valueOf(rows.get(i)) + "|";
			    System.out.println("rv =" + rv );


				
			}
			rv = rv.substring(0,rv.length() - 1);			
			session.close();
		   // HibernateUtil.shutdown();  
		} catch (Exception e) {
			System.out.println("**************ERROR******************************");
			rv = e.toString();
		}
		//System.out.println(rv);
		 
		return rv;
	}
	

	

}
