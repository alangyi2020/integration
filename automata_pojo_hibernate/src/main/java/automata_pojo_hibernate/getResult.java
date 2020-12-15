package automata_pojo_hibernate;

import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;

import javax.jms.ConnectionFactory;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.core.JmsTemplate;

public class getResult {
	
	private static String myServiceID;
	
	private ConnectionFactory connectionFactory;
    private JmsTemplate jmsTemplate;
    private static String return_value = "";
    
    
    private static String groupId = "id_1" ;
	private static String bootstrapServers = "192.168.80.131:9092" ;
	//private static String topic = "konanie" ;
	private static String serviceId;

	private static KafkaConsumer<String, String> consumer;

	public static void main(String[] args) {
		
		
		sqlQuery myQuery = new sqlQuery();
		
		
		
		
		Properties properties = new Properties();
		properties.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,bootstrapServers );
		properties.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName() );
		properties.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName()  );
		properties.setProperty(ConsumerConfig.GROUP_ID_CONFIG, groupId);
		properties.setProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
		Logger logger = LoggerFactory.getLogger(ConsumerDemo.class.getName());
		
		
		Properties propertiesprod = new Properties();
		propertiesprod.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers );
		propertiesprod.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName() );
		propertiesprod.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName()  );
		
		KafkaProducer<String, String> producer = new KafkaProducer<String, String>(propertiesprod);
		
		
		//KafkaProducer<String, String> producer = new KafkaProducer<String, String>(properties);
		
		//create consumer
		consumer = new KafkaConsumer<String, String>(properties);
				
		//subscribe to consumer
		KafkaConsumer<String, String> consumer =new KafkaConsumer<String, String>(properties);
		consumer.subscribe(Arrays.asList("getKonanieDetail_Complete","vyhladajKonanie_Complete"));
		//consumer.subscribe(Arrays.asList(topic));
		
		resultsProducer producerComplete = new resultsProducer(bootstrapServers, "konanie_Complete");
		
		
		while(true) {
			ConsumerRecords<String, String> records =  consumer.poll(Duration.ofMillis(100));
			for (ConsumerRecord<String, String> record : records) {
				
				logger.info("Key: " + record.key() + ", Value: " + record.value());
				logger.info("Partition: " + record.partition() + ", Offset: " + record.offset());
				try {
					
					
					String[] arrSplit = record.value().split("\\|");
					
					myQuery.update("commit");
					String myResultCount = myQuery.getQueryResults("select count(*) FROM soapdemo.Response b  where b.request_id = "+ arrSplit[2] );
					System.out.println("myResultCount ===== " + myResultCount);
					
					String myServiceP = myQuery.getQueryResults("select count(*) from soapdemo.Service_Provider");
					System.out.println("myServiceP ===== " + myServiceP);
							
					//System.out.println("Service returned ===== " + soapResult);
					if(myServiceP.equals(myResultCount)) {
						System.out.println(record.value() + " finished...");
						producerComplete.produceToTopic(record.value() + " finished...");
						producer.flush();					
						
						//flush and close
						//producer.close();

					} else {
						System.out.println(record.value() + " not complete...");
						producerComplete.produceToTopic(record.value() + " not complete..." + myResultCount + ", " + myServiceP + ", " + arrSplit[2]);
						producer.flush();
					}
					//producerComplete.produceToTopic(record.value() + " finished...");
					;
				} catch (Exception e) {
					System.out.println(e.toString());
				} finally {
					
				//HibernateUtil.shutdown(); 
				}
				
				
	                    
			}
		}

	}

}
