package com.eureka.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class Payment_service {
	
	@GetMapping("/pay/{price}")
	public String payNow(@PathVariable int price) {
		return "payment with " + price + " is successfull";
	}
	
}
