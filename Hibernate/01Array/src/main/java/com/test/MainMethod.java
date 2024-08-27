package com.test;

import com.comp.WishMessageGenerator;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WishMessageGenerator msg=new WishMessageGenerator();
		java.util.Date d=new java.util.Date();
		msg.setDate(d);
		String res=msg.generateMessage("Mahindra");
		System.out.println(res);

	}

}
