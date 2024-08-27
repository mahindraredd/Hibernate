package com.uni.dao;

import org.springframework.data.repository.CrudRepository;

import com.uni.models.CustomerData;

public interface ICustomerDAO extends CrudRepository<CustomerData, Integer> {

}
