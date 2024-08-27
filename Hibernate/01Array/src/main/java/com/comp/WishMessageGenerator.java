package com.comp;

import java.util.Arrays;
import java.util.Date;

public class WishMessageGenerator {
	static {
		System.out.println("WishMessageGenerator.class file is loading");
	}
	private int[] marks;
	@Override
	public String toString() {
		return "WishMessageGenerator [marks=" + Arrays.toString(marks) + "]";
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	

}
