package com.uni.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uni.customerDTO.CustomerDTO;
import com.uni.document.Customer;
import com.uni.generator.IDgenerator;
import com.uni.repository.ICustomerRepo;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

@Service
public class CustomerServiceImpl implements ICustomerService {
	@Autowired
	private ICustomerRepo repo;
	@Override
	public String registerCutomer(CustomerDTO dto) {
		System.out.println("proxy class is "+repo.getClass().getName());
		Customer customer=new Customer();
		BeanUtils.copyProperties(dto, customer);
		customer=repo.insert(customer);
		return "Document saved and id is "+customer.getId();
	}
	@Override
	public Iterable<Customer> findCustomer() {
		List<Customer> customer=repo.findAll();
		
		return customer;
	}
	@Override
	public String updateCustomer(CustomerDTO dto) {
		Customer c=new Customer();
		//288e212eab
		dto.setId("288e212eab");
		System.out.println("Id is"+dto.getId());
		BeanUtils.copyProperties(dto, c);
		c=repo.save(c);
		return "Saved Details are with id "+c.getId();
	}
	@Override
	public List<Customer> getMinorDetails(Integer start, Integer end) {
		repo.findByAgeBetween(0, 16);
		return repo.findByAgeBetween(0, 16);
	}

}
