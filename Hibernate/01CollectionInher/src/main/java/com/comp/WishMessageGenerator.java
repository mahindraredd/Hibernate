package com.comp;

import java.util.Arrays;
import java.util.Date;

public class WishMessageGenerator {
	static {
		System.out.println("WishMessageGenerator.class file is loading");
	}
	private String name;
	private String mothername;
	private String fathername;
	private String school;
	private String college;
	private String masterCollege;
	private String job1;
	private String job2;
	private String job3;
	@Override
	public String toString() {
		return "WishMessageGenerator [name=" + name + ", mothername=" + mothername + ", fathername=" + fathername
				+ ", school=" + school + ", college=" + college + ", masterCollege=" + masterCollege + ", job1=" + job1
				+ ", job2=" + job2 + ", job3=" + job3 + "]";
	}
	public WishMessageGenerator(String name, String mothername, String fathername, String school, String college,
			String masterCollege, String job1, String job2, String job3) {
		super();
		this.name = name;
		this.mothername = mothername;
		this.fathername = fathername;
		this.school = school;
		this.college = college;
		this.masterCollege = masterCollege;
		this.job1 = job1;
		this.job2 = job2;
		this.job3 = job3;
	}
	

}
