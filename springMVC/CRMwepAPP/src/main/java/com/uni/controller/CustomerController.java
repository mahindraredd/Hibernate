package com.uni.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uni.models.CustomerData;
import com.uni.service.ICustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
@Autowired	
private ICustomerService service;

	@RequestMapping("/list")
	public String showList(Map<String,Object> model) {
		System.out.print(model.getClass().getName());
		System.out.println(service.getAllCustomer());
		List<CustomerData> customer = service.getAllCustomer();
		model.put("customer", customer);
		return "list";
	}

}
