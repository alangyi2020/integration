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

public class StartMessage {
	private static AnnotationConfigApplicationContext context;

	@Bean
    public ConnectionFactory connectionFactory() {
        ConnectionFactory connectionFactory =
                new ActiveMQConnectionFactory("vm://localhost");
        return connectionFactory;
    }

	public static void main(String[] args) throws Exception {
	   context = new AnnotationConfigApplicationContext(StartMessage.class);

        String queueName = "start.queue";
        MyMessageSender ms = context.getBean(MyMessageSender.class);
        ms.sendMessage(queueName, "test message");

        createRoute mr = context.getBean(createRoute.class);
       // mr.receiveMessage(queueName);
        String mymm = mr.getreceiveMessage(queueName);
        System.out.println(mymm);

	}

}
