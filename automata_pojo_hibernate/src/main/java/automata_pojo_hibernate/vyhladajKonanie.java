package automata_pojo_hibernate;

import java.lang.reflect.Method;
import java.sql.SQLException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.jms.ConnectionFactory;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.core.JmsTemplate;

import automata_pojo_hibernate.hibernate.Request;
import automata_pojo_hibernate.hibernate.RequestItems;
import automata_pojo_hibernate.hibernate.RequestParameters;
import automata_pojo_hibernate.hibernate.Response;
import automata_pojo_hibernate.hibernate.ServiceProvider;

public class vyhladajKonanie {
	private static String myServiceID;
	
	private ConnectionFactory connectionFactory;
    private JmsTemplate jmsTemplate;
    private static String return_value = "";
    
    
    private static String groupId = "id_0" ;
	private static String bootstrapServers = "192.168.80.131:9092" ;
	private static String topic = "konanie" ;
	private static String serviceId;

	private static KafkaConsumer<String, String> consumer;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sqlQuery myQuery = new sqlQuery();
		myServiceID = myQuery.getQueryResults("select distinct sp.Service_Provider_id from soapdemo.Service_Provider sp where sp.method_name = 'vyhladajKonanie'");
		
		System.out.println("mmmmm = " + myServiceID);
		serviceId = myServiceID;
		
		Properties properties = new Properties();
		properties.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,bootstrapServers );
		properties.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName() );
		properties.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName()  );
		properties.setProperty(ConsumerConfig.GROUP_ID_CONFIG, groupId);
		properties.setProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
		Logger logger = LoggerFactory.getLogger(ConsumerDemo.class.getName());
		
		
		//create consumer
		consumer = new KafkaConsumer<String, String>(properties);
				
		//subscribe to consumer
		KafkaConsumer<String, String> consumer =new KafkaConsumer<String, String>(properties);
		//consumer.subscribe(Arrays.asList(topic,"integration_start"));
		consumer.subscribe(Arrays.asList(topic));
		
		resultsProducer producerComplete = new resultsProducer(bootstrapServers, "vyhladajKonanie_Complete");
		
		
		while(true) {
			ConsumerRecords<String, String> records =  consumer.poll(Duration.ofMillis(100));
			for (ConsumerRecord<String, String> record : records) {
				
				logger.info("Key: " + record.key() + ", Value: " + record.value());
				logger.info("Partition: " + record.partition() + ", Offset: " + record.offset());
				try {
					int myId;
					myId = Integer.parseInt(serviceId);
					
					//doCallService ds = new doCallService();
					//TimeUnit.SECONDS.sleep(30);
					callSOAPvyhladajKonanie ds = new callSOAPvyhladajKonanie();
					//myQuery = new sqlQuery();
					myQuery.update("insert into soapdemo.Request set request_id  = "+ record.value() + ", request_datetime  = NOW(), CSRU_Service_id = 1, Service_Provider_id = " + myId);
					
					//System.out.println("Service returned ===== " + ds.do_callSOAPvyhladajKonanie(Integer.parseInt(record.value()),1);
					String soapResult = ds.do_callSOAPvyhladajKonanie(Integer.parseInt(record.value()),1);
					System.out.println("Service returned ===== " + soapResult);
					
					producerComplete.produceToTopic(soapResult + "|1");
					
					ds = null;
					//System.out.println("Service returned ===== " + ds.doCallStartProcessing(14));
				} catch (Exception e) {
					System.out.println(e.toString());
				} finally {
					
				//HibernateUtil.shutdown(); 
				}
				
				
	                    
			}
		}

	}
	
	
	
	
	

}
