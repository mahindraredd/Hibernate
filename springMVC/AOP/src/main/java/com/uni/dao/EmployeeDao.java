package com.uni.dao;

import org.springframework.stereotype.Component;

import com.uni.annoatations.myTransaction;

@Component
public class EmployeeDao {
	@myTransaction
	public Integer saveEmployee() {
		System.out.println("Employee saved ");
		return 10;
	}
	

}
