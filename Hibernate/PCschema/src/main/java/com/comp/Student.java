package com.comp;

import org.springframework.beans.factory.annotation.Required;

public class Student {
	private String name;
	private String branch;
	private Integer id;
	public void setName(String name) {
		this.name = name;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Required
	public void setId(Integer id) {
		this.id = id;
	}
}
