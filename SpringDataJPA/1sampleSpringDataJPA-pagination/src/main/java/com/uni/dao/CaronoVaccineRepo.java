package com.uni.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.uni.bo.CaronaVaccine;

public interface CaronoVaccineRepo extends PagingAndSortingRepository<CaronaVaccine, Long> {

}
