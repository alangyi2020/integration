package automata_pojo_hibernate;

import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;
import java.util.concurrent.CountDownLatch;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.errors.WakeupException;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import automata_pojo_hibernate.getKonanieDetail_Thread.ConsumerRunnable;

public class getResult_Thread {

	public static void main(String[] args) {
		System.out.println("getKonanieDetail_Thread");

        new getResult_Thread().run();
	}
	
	private getResult_Thread(){

    }
	private void run() {
        String bootstrapServer = "192.168.80.131:9092";
        String groupId = "thread";
        String topic = "konanie";
        final Logger logger = LoggerFactory.getLogger(kafkaThreadConsumer.class.getName());

        logger.info("creating thread");

        CountDownLatch latch = new CountDownLatch(1);
        final Runnable myConsumerRunnable;
        myConsumerRunnable = new ConsumerRunnable(bootstrapServer,
                groupId,
                topic,
                latch);
        Thread myThread = new Thread(myConsumerRunnable);
        myThread.start();
        Runtime.getRuntime().addShutdownHook( new Thread( new Runnable() {
			public void run() {
			    logger.info("caugh shutdown hook");
			    ((ConsumerRunnable) myConsumerRunnable).shutdown();
			        }
		})

        );

        try {
            latch.await();
        } catch (InterruptedException e) {
            logger.error("application was interrupted", e);
        } finally {
            logger.info("application  is closing");
        }
    }
	
	public class ConsumerRunnable implements Runnable {
        private CountDownLatch latch;
        private KafkaConsumer<String, String> consumer;
        private Logger logger = LoggerFactory.getLogger(ConsumerRunnable.class.getName());

        public ConsumerRunnable(String bootstrapServer,
                                String groupId,
                                String topic,
                                CountDownLatch latch) {
            this.latch = latch;

            Properties properties = new Properties();
            properties.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,bootstrapServer);
            properties.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
            properties.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,StringDeserializer.class.getName());
            properties.setProperty(ConsumerConfig.GROUP_ID_CONFIG,groupId);
            properties.setProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG,"earliest");

            consumer = new KafkaConsumer<String, String>(properties);

            //subscribe consumer to topic

            consumer.subscribe(Arrays.asList("getKonanieDetail_Complete","vyhladajKonanie_Complete"));
        }
        public void run() {
        	
            try {
                while (true) {
                    ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(100));
                    for (ConsumerRecord<String, String> record : records) {
                        logger.info("Key = " + record.key() + ", Value = " + record.value());
                        try {
                        
	                        Properties propertiesprod = new Properties();
	                		String bootstrapServers ="192.168.80.131:9092";
							propertiesprod.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers  );
	                		propertiesprod.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName() );
	                		propertiesprod.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName()  );
	                		
	                		KafkaProducer<String, String> producer = new KafkaProducer<String, String>(propertiesprod);
	                		String[] arrSplit = record.value().split("\\|");
	                		
	                		sqlQuery myQuery = new sqlQuery();
	    					myQuery.update("commit");
	    					String myResultCount = myQuery.getQueryResults("select count(*) FROM soapdemo.Response b  where b.request_id = "+ arrSplit[2] );
	    					System.out.println("myResultCount ===== " + myResultCount);
	    					
	    					String myServiceP = myQuery.getQueryResults("select count(*) from soapdemo.Service_Provider");
	    					System.out.println("myServiceP ===== " + myServiceP);
	    					resultsProducer producerComplete = new resultsProducer(bootstrapServers, "konanie_Complete");
	    							
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
	                    
	                        
	    					} catch (Exception e) {
	    						System.out.println(e.toString());
	    					} finally {
	    						
	    					//HibernateUtil.shutdown(); 
	    					} 
                        
                        
                    }
                
            } } catch(WakeupException e) {
                logger.info("Received shutdown signal");
            } finally {
                consumer.close();
                latch.countDown();
            }

        }

        public void shutdown() {
            consumer.wakeup();

        }
    }

}
