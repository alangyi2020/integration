package automata_pojo_hibernate;

import automata_pojo_hibernate.doCallService;

public class MyBean {
	/*public String appendCamel(String msg) {
		System.out.println("arpi");
		return msg + " Camel";
	}*/
	public String appendMessage(String msg) throws Exception {
		System.out.println("MyBean2");
		String[] values = msg.split("\\|");
		String ret_val = "";
    	//doCallService dc ;
    	for(int c1 = 1;c1<values.length ;c1++) {
        	System.out.println(values[c1]);
        	//queueName = values[c1];  //Preparation for the paralell processing

            doCallService dc =  new doCallService();
            //System.out.println(dc.doCallStartProcessing(queueName));
        	
        	ret_val = ret_val + dc.doCallStartProcessing(Integer.parseInt(values[c1]));
        }
		
		return ret_val;
	}
}
