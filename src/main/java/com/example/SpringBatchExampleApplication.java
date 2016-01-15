package com.example;


import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class SpringBatchExampleApplication {

	@Autowired
	BatchService service;
	
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBatchExampleApplication.class, args);
		
	}
}