package com.example.contentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContentserviceApplication {

	public static void main(String[] args) {
		java.security.Security.setProperty("networkaddress.cache.ttl" , "10");
		SpringApplication.run(ContentserviceApplication.class, args);
	}

}
