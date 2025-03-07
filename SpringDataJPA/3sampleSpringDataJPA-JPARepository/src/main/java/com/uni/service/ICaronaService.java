package com.uni.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;

import com.uni.bo.CaronaVaccine;
import com.uni.types.ResultView;

public interface ICaronaService  {
	public List<CaronaVaccine> findVaccinesByCompany(Integer dose);
	public List<Object[]> fetchvaccinesByPriceRange(Integer min,Integer max);
	public int modifyprice(int newprice, Long id );
}
