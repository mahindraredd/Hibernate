package com.comp;

import java.util.Arrays;
import java.util.Date;
import java.util.Set;

public class WishMessageGenerator {
	static {
		System.out.println("WishMessageGenerator.class file is loading");
	}
	private Set<String> courses;
	@Override
	public String toString() {
		return "WishMessageGenerator [courses=" + courses + "]";
	}
	public WishMessageGenerator(Set<String> courses) {
		super();
		this.courses = courses;
	}

}
