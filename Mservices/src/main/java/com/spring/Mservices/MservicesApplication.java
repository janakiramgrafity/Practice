package com.spring.Mservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MservicesApplication.class, args);
	}

}
