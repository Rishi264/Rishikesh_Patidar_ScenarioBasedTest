package com.example.fiseurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FiseurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(FiseurekaserverApplication.class, args);
	}

}
