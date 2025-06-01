package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
public class HelloController {
    private static final Logger logger = LogManager.getLogger(HelloController.class);

    @GetMapping("/")
    public String hello() {
        logger.info("Received request for hello endpoint");
        return "Hello World!";
    }
} 