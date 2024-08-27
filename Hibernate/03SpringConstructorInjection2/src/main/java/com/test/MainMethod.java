package com.test;

import com.comp.WishMessageGenerator;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Date d=new java.util.Date();
		WishMessageGenerator msg=new WishMessageGenerator(d);
		
		
		String res=msg.generateMessage("Mahindra");
		System.out.println(res);

	}

}
