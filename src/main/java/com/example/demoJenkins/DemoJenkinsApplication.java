package com.example.demoJenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@SpringBootApplication
@RestController
public class DemoJenkinsApplication {

	public  static  Logger logger = LoggerFactory.getLogger(DemoJenkinsApplication.class);

	@PostConstruct
	public void init(){
		logger.info("Application started");
	}
	public static void main(String[] args) {
		logger.info("Application Executed");
		SpringApplication.run(DemoJenkinsApplication.class, args);
	}

}
