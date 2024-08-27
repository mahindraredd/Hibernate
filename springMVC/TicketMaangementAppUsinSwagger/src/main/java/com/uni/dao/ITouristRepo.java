package com.uni.dao;

import org.springframework.data.repository.CrudRepository;

import com.uni.models.Tourist;

public interface ITouristRepo extends CrudRepository<Tourist, Integer> {

}
