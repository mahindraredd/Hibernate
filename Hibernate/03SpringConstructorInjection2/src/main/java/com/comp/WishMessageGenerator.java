package com.comp;

import java.util.Date;

public class WishMessageGenerator {
	static {
		System.out.println("WishMessageGenerator.class file is loading");
	}
	private Integer id;
	private String name;
	private String addr;
	public WishMessageGenerator(Integer id, String name, String addr) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
		System.out.println(id+name+addr);
		System.out.println("all 3 para,eter");
	}
	
	
	
	

}
