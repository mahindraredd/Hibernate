package com.uni.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/wish")
public class WishController {
	@GetMapping("/greet")
	public ResponseEntity<String> generateWishMessage(){
		LocalDateTime ldt=LocalDateTime.now();
		int hour=ldt.getHour();
		String body=null;
		if(hour<12)
			body="GoodMoring";
		else if(hour>12&hour<16)
			body="good afternoon";
		else
			body="goodNight";
		ResponseEntity<String> response=new ResponseEntity<String>(body,HttpStatus.OK);
		return response;
	}

}
