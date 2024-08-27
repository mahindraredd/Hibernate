package com.uni.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/actor")
public class WishApp {
	
	@GetMapping("/greet")
	public ResponseEntity<String> display(){
		return new ResponseEntity<String>("good day",HttpStatus.OK);
	}
}
