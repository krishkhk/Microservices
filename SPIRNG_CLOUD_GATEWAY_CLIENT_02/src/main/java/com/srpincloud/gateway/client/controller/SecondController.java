package com.srpincloud.gateway.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class SecondController {
	
	@GetMapping("/show")
	public String test() {
		
		return "This is Client-02 service";
		
	}
	
	

}
