package com.uni.run;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.uni.dao.EmployeeDao;
@Component
@Order(1)
public class RunClass implements CommandLineRunner {
	@Value("${spring.application.name}")
	private String name;
	@Autowired
	private EmployeeDao dao;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Run method");
		System.out.println("Run method args are"+args[0]);
		dao.saveEmployee();
		System.out.println("access the propertiees file  using Command line"+name);
		
		

	}

}
