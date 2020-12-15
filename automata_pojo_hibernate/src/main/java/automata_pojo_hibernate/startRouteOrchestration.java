package automata_pojo_hibernate;

import org.apache.activemq.camel.component.ActiveMQComponent;
import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.util.jndi.JndiContext;


public class startRouteOrchestration {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		JndiContext jndiContext = new JndiContext();
		jndiContext.bind("getNewRequestsBean", new getNewRequestsBean());
			
		jndiContext.bind("myBean", new MyBean());
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

	}

}
