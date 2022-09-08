package com.zipkin.ms.client1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import brave.sampler.Sampler;

@SpringBootApplication
public class MsService01ZipkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsService01ZipkinsApplication.class, args);
	}

}

@RestController
class Microservice3Controller {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

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


	@GetMapping(value = "/service3")
	public String method3() {
		LOG.info("You called Inside method3");
		String baseUrl = "http://localhost:8083/service4";
		try {
			Thread.sleep(1000);
		} catch (Exception ex) {

		}
		String response = (String) restTemplate.exchange(baseUrl, HttpMethod.GET, null, String.class).getBody();
		LOG.info("The response received by method3 is " + response);
		return response;
	}
}
