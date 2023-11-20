package com.myVideo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyVideoApplication {

	
    private static Logger logger = LoggerFactory.getLogger(MyVideoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(MyVideoApplication.class, args);
		logger.info("Application Running...");
	}

}
