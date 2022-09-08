package com.zipkin.ms.client1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import brave.sampler.Sampler;

import org.slf4j.Logger;


@RestController
public class Microservice1 {
	
	private final Logger Log=org.slf4j.LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	RestTemplate restTemplate;

	
	@Bean
	public RestTemplate getRestTemplate() {
		
		return new RestTemplate();
	}
	
	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}
	
	@GetMapping("/service1")
	public String method1() {
		Log.info("Inside Method");
		
		String baseUrl="http://localhost:8081/service2";
		
		String response=restTemplate.exchange(baseUrl,HttpMethod.GET,null,String.class).getBody();
		Log.info("The response received by method1 is "+response);
		
		return response;
		
		
		
	}
}
