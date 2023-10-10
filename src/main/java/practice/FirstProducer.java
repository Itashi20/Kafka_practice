package practice;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;

public class FirstProducer {
    public static void main(String[] args) {
 //String bservers="win10.localdomain:9092";
        String bservers="192.168.56.2:9092";

        //1.Create configuration
        Properties properties=new Properties();
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,bservers);
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        //2. create producer
        KafkaProducer<String,String>producer=new KafkaProducer<>(properties);

        //3. create producer record
        ProducerRecord<String,String>record=new ProducerRecord<>("my-topic","my first message");

        //4. send the record

        producer.send(record);
        //flus,close
        producer.flush();
        producer.close();




    }
}
