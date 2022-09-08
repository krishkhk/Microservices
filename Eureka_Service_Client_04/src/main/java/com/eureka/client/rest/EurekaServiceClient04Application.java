package com.eureka.client.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient
@SpringBootApplication
public class EurekaServiceClient04Application {
	
	@LoadBalanced
	@Bean
	
	 RestTemplate restTemplate() {
		
		return new RestTemplate();
		
	}

	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceClient04Application.class, args);
	}

}
