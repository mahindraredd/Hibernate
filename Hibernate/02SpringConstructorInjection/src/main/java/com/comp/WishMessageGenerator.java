package com.comp;

import java.util.Date;

public class WishMessageGenerator {
	static {
		System.out.println("WishMessageGenerator.class file is loading");
	}
	private Date date;
	
	
	
	public WishMessageGenerator(Date date) {
		
		this.date = date;
		System.out.print("One parameter Constructor injection");
	}



	public String generateMessage(String userName) {
		int hour=date.getHours();
		if(hour<12) {
			return "good morning "+userName;
		}
		else if(hour<16) {
			return "good afternoon"+ userName;
		}
		else {
			return "good Night"+userName;
		}
	}
	

}
