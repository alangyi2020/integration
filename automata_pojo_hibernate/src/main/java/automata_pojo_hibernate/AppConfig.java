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
public class AppConfig {
	
	private static AnnotationConfigApplicationContext context;

	@Bean
    public ConnectionFactory connectionFactory() {
        ConnectionFactory connectionFactory =
                new ActiveMQConnectionFactory("vm://localhost");
        return connectionFactory;
    }

	public static void main(String[] args) throws InterruptedException, JMSException {
        context = new AnnotationConfigApplicationContext(AppConfig.class);

        String queueName = "example.queue";
        MyMessageSender ms = context.getBean(MyMessageSender.class);
        ms.sendMessage(queueName, "test message");

        MyMessageReceiver mr = context.getBean(MyMessageReceiver.class);
       // mr.receiveMessage(queueName);
        String palinka = mr.getreceiveMessage(queueName);
        System.out.println("palinka");
        System.out.println(palinka);

	}

}
