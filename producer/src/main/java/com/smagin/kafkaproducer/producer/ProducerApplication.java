package com.smagin.kafkaproducer.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;


@SpringBootConfiguration
public class ProducerApplication {
    public static void main(String[] args) {
       SpringApplication.run(ProducerApplication.class, args);
    }
}
