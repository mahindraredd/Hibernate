package com.comp;

public class Department {
	private String course;
	private String classes;
	private String hod;
	@Override
	public String toString() {
		return "Department [course=" + course + ", classes=" + classes + ", hod=" + hod + "]";
	}
	public Department(String course, String classes, String hod) {
		super();
		this.course = course;
		this.classes = classes;
		this.hod = hod;
		System.out.println("this is Department class");
	}
}
