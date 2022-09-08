package com.emp.produce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EmployeProducerMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeProducerMicroserviceApplication.class, args);
	}

}
