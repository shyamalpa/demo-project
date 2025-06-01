package com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SpringBootApplication
public class HelloWorldApplication {
    private static final Logger logger = LogManager.getLogger(HelloWorldApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
        logger.info("Hello World from Log4j!");
    }
} 