package automata_pojo_hibernate;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.errors.WakeupException;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;
import java.util.concurrent.CountDownLatch;

public class kafkaThreadConsumer {

	public static void main(String[] args) {
		System.out.println("Hello");

        new kafkaThreadConsumer().run();

	}
	private kafkaThreadConsumer(){

    }
	 private void run() {
	        String bootstrapServer = "192.168.80.131:9092";
	        String groupId = "my-sixth-application";
	        String topic = "first_topic";
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

	            consumer.subscribe(Arrays.asList(topic));
	        }
	        public void run() {
	        	
	            try {
	                while (true) {
	                    ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(100));
	                    for (ConsumerRecord<String, String> record : records) {
	                        logger.info("Key = " + record.key() + ", Value = " + record.value());
	                        int myId;
	    					myId = 1;
	    					
	    					//doCallService ds = new doCallService();
	    					//TimeUnit.SECONDS.sleep(30);
	    					callSOAPvyhladajKonanie ds = new callSOAPvyhladajKonanie();
	    					sqlQuery myQuery = new sqlQuery();
	    					//myQuery.update("insert into soapdemo.Request set request_id  = "+ record.value() + ", request_datetime  = NOW(), CSRU_Service_id = 1, Service_Provider_id = " + myId);
	    					myQuery.update("insert into soapdemo.Request set request_id  = "+ record.value() + ", request_datetime  = NOW(), CSRU_Service_id = 1, Service_Provider_id = " + myId);
	    					
	    					//System.out.println("Service returned ===== " + ds.do_callSOAPvyhladajKonanie(Integer.parseInt(record.value()),1);
	    					try {
	    					String soapResult = ds.do_callSOAPvyhladajKonanie(Integer.parseInt(record.value()),1);
	    					System.out.println("Service returned ===== " + soapResult);
	    					
	    					String bootstrapServers= "192.168.80.131:9092";;
							resultsProducer producerComplete = new resultsProducer(bootstrapServers, "vyhladajKonanie_Complete");
							producerComplete.produceToTopic(soapResult + "|1");
	    					} catch (Exception e) {
	    						logger.info(e.toString());
	    					} finally {
		    					myQuery = null;
		    					ds = null;

	    					}
	                        
	                        
	                    }
	                }
	            } catch(WakeupException e) {
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
