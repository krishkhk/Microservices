package com.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaServiceClient02Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceClient02Application.class, args);
	}

}
