package automata_pojo_hibernate;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

import javax.jms.ConnectionFactory;

	@Configuration
	@ComponentScan

public class MyBean2 {
		
		private static AnnotationConfigApplicationContext context;
		@Bean
	    public ConnectionFactory connectionFactory() {
	        ConnectionFactory connectionFactory =
	                new ActiveMQConnectionFactory("vm://localhost");
	        return connectionFactory;
	    }
		
		
	public String appendMessage(String msg) throws Exception {
		
		context = new AnnotationConfigApplicationContext(MyBean2.class);
		String ret_val = "";
        String queueName = "example.queue";
        MyMessageSender ms = context.getBean(MyMessageSender.class);
        ms.sendMessage(queueName, "Get not processed IDs");

         getNewRequestsBean mr = context.getBean(getNewRequestsBean.class);
       // mr.receiveMessage(queueName);
        String notProcessed = mr.getID(queueName);
        System.out.println("notProcessed = "+ notProcessed);
       
       String[] values = notProcessed.split("\\|");
        System.out.println("values[0] = "+ values[0]);
        
        if(!values[0].equals("OK")) {
        	System.out.println(notProcessed);
        	System.out.println(values[0]);
        	System.out.println("aaa +" + Arrays.toString(values));
        	
        	        
        	return "ERROR";
        } else {
        	ret_val = "";
        	//doCallService dc ;
        	for(int c1 = 1;c1<values.length ;c1++) {
            	System.out.println(values[c1]);
            	queueName = values[c1];
                ms.sendMessage(queueName,  values[c1]);
                doCallService dc =  context.getBean(doCallService.class);
                //System.out.println(dc.doCallStartProcessing(queueName));
            	
            	ret_val = ret_val + dc.doCallStartProcessing(queueName);
            }
        	
        	System.out.println("ret_val = " + ret_val);
        	return ret_val;        	
        	
        }
       // return "OK";
        	
	}

}
