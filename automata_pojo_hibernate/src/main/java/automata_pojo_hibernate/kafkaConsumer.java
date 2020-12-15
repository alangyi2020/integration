package automata_pojo_hibernate;

import java.time.Duration;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class kafkaConsumer {
	
	/*private String groupId = "my-fourth-application";
	private String bootstrapServers = "192.168.80.131:9092";
	private String topic = "integration_start";*/
	
	private String groupId;
	private String bootstrapServers;
	private String topic;
	private String serviceId;
	private Properties properties;
	private KafkaConsumer<String, String> consumer;
	private Logger logger;
	private Class myClass;
	
	
	kafkaConsumer(String groupId, String bootstrapServers, String topic, String serviceId, Class myClass) {
		this.groupId = groupId;
		this.bootstrapServers = bootstrapServers;
		this.topic = topic;
		this.serviceId = serviceId;
		this.myClass = myClass;
		
		
		this.properties = new Properties();
		properties.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,bootstrapServers );
		properties.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName() );
		properties.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName()  );
		properties.setProperty(ConsumerConfig.GROUP_ID_CONFIG, groupId);
		properties.setProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
		this.logger = LoggerFactory.getLogger(ConsumerDemo.class.getName());
		
		
		//create consumer
		this.consumer = new KafkaConsumer<String, String>(properties);
				
		//subscribe to consumer
		this.consumer.subscribe(Arrays.asList(this.topic));
		
		
	}
	
	public void consumerListenen() {
		while(true) {
			ConsumerRecords<String, String> records =  consumer.poll(Duration.ofMillis(100));
			for (ConsumerRecord<String, String> record : records) {
				
				logger.info("Key: " + record.key() + ", Value: " + record.value());
				logger.info("Partition: " + record.partition() + ", Offset: " + record.offset());
				try {
					int myId;
					myId = Integer.parseInt(this.serviceId);
					doCallService ds = new doCallService();
					
					sqlQuery myQuery = new sqlQuery();
					myQuery.update("insert into soapdemo.Request set request_id  = "+ record.value() + ", request_datetime  = NOW(), CSRU_Service_id = 1, Service_Provider_id = " + myId);
					
					//System.out.println("Service returned ===== " + myClass.do_callSOAPvyhladajKonanie(14,1));
					//System.out.println("Service returned ===== " + ds.doCallStartProcessing(myId));
				} catch (Exception e) {
					System.out.println(e.toString());
				} finally {
				//HibernateUtil.shutdown(); 
				}
				
				
	                    
			}
		}
	}
	
	
	
	

}
