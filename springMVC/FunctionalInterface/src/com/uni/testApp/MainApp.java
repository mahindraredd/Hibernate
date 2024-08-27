package com.uni.testApp;

import com.uni.functional.GreetService;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreetService greet= msg->
			System.out.println("hi how the fuck are you"+msg);
		greet.sayMessage("Mahi");

	}

}
