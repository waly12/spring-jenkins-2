package com.axsa.learn.g.cicd.jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenkins2Application {
	
	static Logger logger = LoggerFactory.getLogger(SpringJenkins2Application.class);
	
	@PostConstruct
	public void init() {
		logger.info("Application started ...");
	}

	public static void main(String[] args) {
		logger.info("Application executed ...");
		SpringApplication.run(SpringJenkins2Application.class, args);
	}

}
