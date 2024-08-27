package com.comp;

import java.util.Date;
import java.util.List;

public class Student {
	@Override
	public String toString() {
		return "Student [names=" + names + ", dob=" + dob + "]";
	}
	private List<String> names;
	private List<Date> dob;
	public void setNames(List<String> names) {
		this.names = names;
	}
	public void setDob(List<Date> dob) {
		this.dob = dob;
	}
	
}
