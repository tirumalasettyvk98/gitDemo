package com.example.demo.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="first-service")
public interface FirstClient {

	@GetMapping("/first")
	public String first();
	
}
