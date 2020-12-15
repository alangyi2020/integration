package automata_pojo_hibernate;

import java.util.List;
import java.util.Properties;
import java.util.concurrent.ExecutionException;

import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.serialization.StringSerializer;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Producer_Portal {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		final Logger logger = LoggerFactory.getLogger(ProducerDemoKeys.class);
		String bootstrapServers = "192.168.80.131:9092";
		// TODO Auto-generated method stub
		System.out.println("Portal producer");
		
		//create properties
		Properties properties = new Properties();
		properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers );
		properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName() );
		properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName()  );
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();

        
		//SQLQuery query = session.createSQLQuery("SELECT request_id,request_datetime, response_datetime,CSRU_Service_id,Service_Provider_id FROM soapdemo.Request");
        SQLQuery query = session.createSQLQuery("select max(coalesce(request_id, 0)) + 10 as request_id FROM soapdemo.Response");
		
		@SuppressWarnings("unchecked")
		List<Integer[]> rows =  query.list();
		String rv = "";
		for (int i = 0; i < rows.size(); i++) {					
		    rv  = rv + String.valueOf(rows.get(i)) + "|";
		    System.out.println("rv =" + rv );


			
		}
		rv = rv.substring(0,rv.length() - 1);			
		session.close();
		
		String[] values = rv.split("\\|");
		for(int c1 = 0;c1<values.length ;c1++) {
			System.out.println("values[0] = "+ values[c1]);
		}
		
		//create the producer
		
		
		  KafkaProducer<String, String> producer = new KafkaProducer<String, String>(properties);
		//create a producer record
		for(int c1=0; c1 < 1; c1++) {
			
			String topic = "konanie";
			//String value = Integer.toString(c1);
			String value = values[0];
			String key = "id_" + Integer.toString(c1);
			System.out.println(topic + "," +  key + "," + value);
			
			ProducerRecord<String,String> record = new ProducerRecord<String,String>(topic, key, value);
			logger.info("Key: " + key);
			
			//send data asynch
			producer.send(record, new Callback() {  
			    public void onCompletion(RecordMetadata recordMetadata, Exception e) {  
			        if (e== null) {  
			            logger.info("Successfully received the details as: \n" +  
			                    "Topic: " + recordMetadata.topic() + "\n" +  
			                    "Partition: " + recordMetadata.partition() + "\n" +  
			                    "Offset " + recordMetadata.offset() + "\n" +  
			                    "Timestamp " + recordMetadata.timestamp());  
			                      }  
			  
			         else {  
			            logger.error("Can't produce,getting error",e);  
			  
			        }  
			    }  
			}).get(); 
		}
		//flush data
		producer.flush();
		
		//flush and close
		producer.close();

	}

}
