package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.clients.FirstClient;

@RestController
public class SecondController {

	
		@Autowired
		FirstClient firstClient;
	
		@GetMapping("/second")
		public String second()
		{
			return "second service hai ->" +firstClient.first();
		}
		
	}

	

