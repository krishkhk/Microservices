package com.srpincloud.gateway.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produce")
public class Emp {
	
	@GetMapping("/msg")
	public String test() {
		return "This is Client-01 Service";
		
		
		
	}

}
