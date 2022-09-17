package com.apiServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ApiFbsDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiFbsDiscoveryServerApplication.class, args);
	}

}
