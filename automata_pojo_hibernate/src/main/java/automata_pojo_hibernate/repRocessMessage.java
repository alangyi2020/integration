package automata_pojo_hibernate;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.jms.ConnectionFactory;
import javax.jms.JMSException;

@Configuration
@ComponentScan
public class repRocessMessage {
	private static AnnotationConfigApplicationContext context;

	@Bean
    public ConnectionFactory connectionFactory() {
        ConnectionFactory connectionFactory =
                new ActiveMQConnectionFactory("vm://localhost");
        return connectionFactory;
    }
	
	public String doReporcess( String msg) throws Exception {
		context = new AnnotationConfigApplicationContext(StartMessage.class);
	
	    String queueName = "reprocess.queue";
	    MyMessageSender ms = context.getBean(MyMessageSender.class);
	    ms.sendMessage(queueName, "test message");
	
	    createRoute mr = context.getBean(createRoute.class);
	   // mr.receiveMessage(queueName);
	    String mmm = mr.getreceiveMessage(queueName);
	    return mmm;
	}

}
