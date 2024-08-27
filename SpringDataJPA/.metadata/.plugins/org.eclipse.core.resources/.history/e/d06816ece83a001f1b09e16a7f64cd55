package com.uni.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.uni.bo.CaronaVaccine;
import com.uni.types.ResultView;

public interface CaronoVaccineRepo extends JpaRepository<CaronaVaccine, Long> { 
	public Iterable<CaronaVaccine> findByCompanyName(String company);
	public Iterable<CaronaVaccine> findByCompanyNameEquals(String company);
	public Iterable<CaronaVaccine> findByCompanyNameIs(String company);
	public List<ResultView> findByPriceGreaterThanEqualOrderByPrice(Integer price);

}
