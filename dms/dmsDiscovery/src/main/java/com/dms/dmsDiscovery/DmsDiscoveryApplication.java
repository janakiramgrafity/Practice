package com.dms.dmsDiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DmsDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DmsDiscoveryApplication.class, args);
	}

}
