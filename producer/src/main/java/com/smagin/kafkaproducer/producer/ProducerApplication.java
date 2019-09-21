package com.smagin.kafkaproducer.producer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.smagin.skolteckint.skolteckint.model.Statement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

import java.io.IOException;


@SpringBootConfiguration
public class ProducerApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ProducerApplication.class, args);

        MessageProducer producer = context.getBean(MessageProducer.class);

        producer.sendMessage("Hello world!");

    }

    @Bean
    public MessageProducer messageProducer(){
        return new MessageProducer();
    }

    public static class MessageProducer{
        @Autowired
        private KafkaTemplate<String, String> kafkaTemplate;

        @Autowired
        private KafkaTemplate<String, Statement> statementKafkaTemplate;

        @Value(value = "${message.topic.name}")
        private String topicName;

        @Value(value = "${partitioned.topic.name}")
        private String partionedTopicName;

        @Value(value = "${filtered.topic.name}")
        private String filteredTopicName;

        @Value(value = "${greeting.topic.name}")
        private String greetingTopicName;

        public void sendMessage(String message) {
            ListenableFuture<SendResult<String, String>> future = kafkaTemplate.send(topicName, message);

            future.addCallback(new ListenableFutureCallback<SendResult<String, String>>() {
                @Override
                public void onFailure(Throwable ex) {
                    System.out.println("Unable to send message=[" + message + "] due to : " + ex.getMessage());
                }

                @Override
                public void onSuccess(SendResult<String, String> result) {
                    System.out.println("Sent message=[" + message + "] with offset=[" + result.getRecordMetadata().offset() + "]");
                }
            });
            }

            public void sendMessageToPartion(String message, int partition) {
                kafkaTemplate.send(partionedTopicName, partition, null, message);
            }

            public void sendMessageToFiltered(String message) {
                kafkaTemplate.send(filteredTopicName, message);
            }

            public void sendGreetingMessage(Statement statement) {
                statementKafkaTemplate.send(greetingTopicName, statement);
            }
            }



}
