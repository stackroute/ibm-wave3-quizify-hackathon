package com.stackroute.quizify.questionmanager.producer;

import com.google.gson.Gson;
import com.stackroute.quizify.questionmanager.domain.Question;
import org.apache.kafka.clients.producer.*;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

public final class QuestionProducer {
    public static Question produce(Question question, String bootstrapServer, String topicName) {
        Logger logger = LoggerFactory.getLogger(QuestionProducer.class);
        Gson gson = new Gson();

        /* Step 1. Create Producer Properties */
        Properties properties = new Properties();

        properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServer);
        properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

        /* Step 2. Create The Producer */
        KafkaProducer<String, String> producer = new KafkaProducer<>(properties);

        /* Step 3. Create Producer Record */
        String key = question.getId();
        String value = gson.toJson(question);

        ProducerRecord<String, String> record = new ProducerRecord<>(topicName, key, value);

        logger.info("------------------------------------------------------------------------------------------------");
        logger.info("Key : " + key);
        logger.info("Value : " + value);
        logger.info("------------------------------------------------------------------------------------------------");

        /* Step 4. Send Data -async */
        producer.send(record, new Callback() {
            @Override
            public void onCompletion(RecordMetadata recordMetadata, Exception e) {
                if (e == null) {
                    logger.info(
                            "Recieved MetdaData : \n" +
                            "Topic : " + recordMetadata.topic() + "\n" +
                            "Partition : " + recordMetadata.partition() + "\n" +
                            "Offset : " + recordMetadata.offset() + "\n" +
                            "Timestamp : " + recordMetadata.timestamp()
                        );
                    } else {
                        logger.error("Error While Producing : " + e);
                    }
                }
            });

        /* FLush Data */
        producer.flush();

        /* Flush and Close */
        producer.close();

        return question;
    }
}
