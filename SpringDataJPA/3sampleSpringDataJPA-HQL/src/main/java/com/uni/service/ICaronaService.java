package com.uni.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;

import com.uni.bo.CaronaVaccine;
import com.uni.types.ResultView;

public interface ICaronaService  {
	public Iterable<CaronaVaccine> fetchDetails(boolean order, String...props);
	public Iterable<CaronaVaccine> fetchAll(int pageNo,int pageSize,boolean order,String...props);
	public Iterable<CaronaVaccine> findAllbyObjects(CaronaVaccine v,boolean order, String...props);
	public String removeByIds(Iterable<Long> ids);
	public Iterable<CaronaVaccine> fetchDetails(String company);
	public Iterable<CaronaVaccine> fetchByCompanyNameEquals(String company);
	public Iterable<CaronaVaccine> fetchByCompanyNameIs(String company);
	public List<ResultView> fetchByPriceGreaterThanEqualOrderByPrice(Integer price);
}
