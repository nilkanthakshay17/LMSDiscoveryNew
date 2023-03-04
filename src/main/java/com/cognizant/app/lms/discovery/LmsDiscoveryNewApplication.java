package com.cognizant.app.lms.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LmsDiscoveryNewApplication {

	public static void main(String[] args) {
		SpringApplication.run(LmsDiscoveryNewApplication.class, args);
		System.out.println("LMS Discovery Service Started");
	}

}
