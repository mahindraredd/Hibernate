package com.uni.service;

import java.util.List;

import com.uni.customerDTO.CustomerDTO;
import com.uni.document.Customer;

public interface ICustomerService {
	public String registerCutomer(CustomerDTO dto);
	public Iterable<Customer> findCustomer();
	public String updateCustomer(CustomerDTO dto);
	public List<Customer> getMinorDetails(Integer start,Integer end);

}
