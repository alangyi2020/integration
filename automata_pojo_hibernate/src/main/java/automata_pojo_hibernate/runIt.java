package automata_pojo_hibernate;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import org.hibernate.SQLQuery;


import org.hibernate.Session;
import org.hibernate.Transaction;

import automata_pojo_hibernate.HibernateUtil;

import automata_pojo_hibernate.hibernate.Request;
import automata_pojo_hibernate.hibernate.RequestId;
//import automata_pojo_hibernate.CallProcessingBean;


public class runIt {
	
	/*protected static Session session;
	protected static Transaction tx;
	public Request req;*/

	public static void main(String[] args) throws Exception {
		
		
		doCallService ds = new doCallService();
		System.out.println("AAAArpi = " + ds.doCallStartProcessing(1));
		HibernateUtil.shutdown(); 
		
		//String a = CallProcessingBean.runJob("2");
		//System.out.println(a);
		
		/*// TODO Auto-generated method stub
		session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
		
		runIt.getRequests(1);
		runIt.commit();
		session.close();
	    HibernateUtil.shutdown();   

	}
	
	public static void getRequests(int id) throws SQLException {
        List<Request> requests = new ArrayList<Request>();
        
		//SQLQuery query = session.createSQLQuery("SELECT request_id,request_datetime, response_datetime,CSRU_Service_id,Service_Provider_id FROM soapdemo.Request");
        SQLQuery query = session.createSQLQuery("select distinct a.request_id FROM soapdemo.Request a left join soapdemo.Response b on a.request_id = b.request_id where b.request_id is null");
		
		@SuppressWarnings("unchecked")
		List<Object[]> rows =  query.list();
				
		for(Object[] row : rows){		
			requests.add(getRequest(row));		
		}
		
		for(Request req :requests) {
			//System.out.println(req.toString());
			session.merge(req);
			
		}
		

        
    }
	
	public static Request getRequest(Object[] row) {
    	Request request = new Request();
    	
    	request.setId(new RequestId((Integer) row[0], (Integer) row[4]));    	
    	request.setRequestDatetime((Date) row[1]);
    	request.setResponseDatetime(new Date());
    	request.setCsruServiceId((Integer)row[3]);
    	return request;
    }
	
	     

public static void commit() throws SQLException {
	tx.commit();
	tx = session.beginTransaction();*/
}
   

}
