package automata_pojo_hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;


import org.apache.activemq.camel.component.ActiveMQComponent;
import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.util.jndi.JndiContext;
@Component
public class createRoute {

    @Autowired
    private ConnectionFactory connectionFactory;
    private JmsTemplate jmsTemplate;

    @PostConstruct
    public void init() {
        this.jmsTemplate = new JmsTemplate(connectionFactory);
    }

   /* public void receiveMessage(String queueName) {
        Message message = jmsTemplate.receive(queueName);
        TextMessage textMessage = (TextMessage) message;
        try {
            String text = textMessage.getText();
            System.out.println("received: " + text);
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }*/
    
    public String getreceiveMessage(String queueName) throws Exception {
        Message message = jmsTemplate.receive(queueName);
        TextMessage textMessage = (TextMessage) message;
        try {
            String text = textMessage.getText();
            System.out.println("received: " + text);
        } catch (JMSException e) {
            e.printStackTrace();
        }
        
        
        JndiContext jndiContext = new JndiContext();
		jndiContext.bind("getNewRequestsBean", new getNewRequestsBean());
			
		jndiContext.bind("myBean", new MyBean());
		jndiContext.bind("repRocessMessage", new repRocessMessage());
		//jndiContext.bind("myBean2", new MyBean2());
		//
		
		//jndiContext.bind("OrchestratorBean", new OrchestratorBean());
		
		CamelContext camelContext = new DefaultCamelContext(jndiContext);
		camelContext.addComponent("activemq", ActiveMQComponent.activeMQComponent("vm://localhost?broker.persistent=false"));
		try {
			camelContext.addRoutes(new RouteBuilder() {
				public void configure() {
					
									
				/*	from("activemq:queue:start")
					.to("bean:OrchestratorBean?method=appendMessage")												
					.to("stream:out");*/
					
					
					/*from("activemq:queue:start")
					.to("bean:myBean2?method=appendMessage")												
					.to("stream:out");*/
					from("activemq:queue:start")
							.to("bean:getNewRequestsBean?method=getRouteID")
							.choice()
								.when(body().contains("OK|"))
									.to("bean:myBean?method=appendMessage")								
							.end()							
							.choice()
								.when(body().contains("ERROR"))
									.to("bean:repRocessMessage?method=doReporcess")								
							.end()
							.to("stream:out");
					
				}
			});
			ProducerTemplate template = camelContext.createProducerTemplate();
			camelContext.start();			
			template.sendBody("activemq:queue:start", "new");
			
			Thread.sleep(1000);
		} finally {
			camelContext.stop();
			HibernateUtil.shutdown(); 
		}
        
        
        return "Finished";
    }
}
