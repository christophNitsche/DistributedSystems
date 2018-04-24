package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SynchronousSpringApplication {

	public String callService()
	{
		RestTemplate template = new RestTemplate();
		String url = "http://localhost:8080/demo/all";
		
		ResponseEntity<String> response = template.getForEntity(url, String.class);
		
		return response.getBody();
	}	
	
	public static void main(String[] args) {
		SpringApplication.run(SynchronousSpringApplication.class, args);
		SynchronousSpringApplication sSpringApp = new SynchronousSpringApplication();
		
		System.out.println(sSpringApp.callService());
	}
}
