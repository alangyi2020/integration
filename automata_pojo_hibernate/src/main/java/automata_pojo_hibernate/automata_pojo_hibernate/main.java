package automata_pojo_hibernate.automata_pojo_hibernate;

import automata_pojo_hibernate.getNewRequestsBean;

import java.sql.SQLException;

import automata_pojo_hibernate.HibernateUtil;
import automata_pojo_hibernate.doCallService;

public class main {

	public static void main(String[] args) throws NumberFormatException, SQLException, Exception {
		// TODO Auto-generated method stub
		String myNHRequests = "";
		System.out.println("Satrt processing");
		getNewRequestsBean gnrb = new getNewRequestsBean();
		myNHRequests = gnrb.getRouteID("Test");
		System.out.println(myNHRequests);
		
		String[] values = myNHRequests.split("\\|");
		String ret_val = "";
    	//doCallService dc ;
    	for(int c1 = 1;c1<values.length ;c1++) {
        	System.out.println(values[c1]);
        	//queueName = values[c1];  //Preparation for the paralell processing

            doCallService dc =  new doCallService();
            //System.out.println(dc.doCallStartProcessing(queueName));
        	
        	ret_val = ret_val + dc.doCallStartProcessing(Integer.parseInt(values[c1]));
        }
    	System.out.println(ret_val);
    	
  
		HibernateUtil.shutdown(); 
		
		
	}

}
