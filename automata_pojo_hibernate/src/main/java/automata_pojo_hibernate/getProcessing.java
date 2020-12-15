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
public class getProcessing {
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
        
		System.out.println("getProcessing?getID" + textMessage.toString());
		return "Arpi";
	}
	

	

}
