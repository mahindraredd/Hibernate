package com.uni.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.uni.document.Customer;

public interface ICustomerRepo extends MongoRepository<Customer, String> {
	public List<Customer> findByAgeBetween(Integer start,Integer end);
}
