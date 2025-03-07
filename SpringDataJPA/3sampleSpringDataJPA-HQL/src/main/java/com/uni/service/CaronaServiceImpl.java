package com.uni.service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.slf4j.helpers.Reporter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.ScrollPosition.Direction;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.uni.bo.CaronaVaccine;
import com.uni.dao.CaronoVaccineRepo;
import com.uni.types.ResultView;
@Service
public class CaronaServiceImpl implements ICaronaService {
	
	@Autowired
	private CaronoVaccineRepo repo;

	@Override
	public Iterable<CaronaVaccine> fetchDetails(boolean order, String...props) {
		Sort sort=Sort.by(order ? org.springframework.data.domain.Sort.Direction.ASC:org.springframework.data.domain.Sort.Direction.DESC,props);
		
		return repo.findAll(sort);
	}

	@Override
	public Iterable<CaronaVaccine> fetchAll(int pageNo, int pageSize, boolean order, String... props) {
		
		Pageable pageable=PageRequest.of(pageNo, pageSize, order? org.springframework.data.domain.Sort.Direction.ASC:org.springframework.data.domain.Sort.Direction.DESC, props);
		
		Page<CaronaVaccine> items = repo.findAll(pageable);
		
		return items.getContent();
	}

	@Override
	public Iterable<CaronaVaccine> findAllbyObjects(CaronaVaccine v, boolean order, String...props) {
		// TODO Auto-generated method stub
		Example<CaronaVaccine> example=Example.of(v);
		Sort sort=Sort.by(order? org.springframework.data.domain.Sort.Direction.ASC:org.springframework.data.domain.Sort.Direction.DESC, props);
		List<CaronaVaccine>items=repo.findAll(example,sort);
		return items;
	}

	@Override
	public String removeByIds(Iterable<Long> ids) {
		List<CaronaVaccine> items= repo.findAllById(ids);
		if(items!=null) {
		repo.deleteAllByIdInBatch(ids);
		 return "Deletion succesfully";
		}
		return "record not availble";
	}

	@Override
	public Iterable<CaronaVaccine> fetchDetails(String company) {
		System.out.println(repo.getClass().getDeclaredMethods());
		Iterable<CaronaVaccine> details = repo.findByCompanyName(company);
		return  details;
	}

	@Override
	public Iterable<CaronaVaccine> fetchByCompanyNameEquals(String company) {
		Iterable<CaronaVaccine> details = repo.findByCompanyNameEquals(company);
		return  details;	}

	@Override
	public Iterable<CaronaVaccine> fetchByCompanyNameIs(String company) {
		Iterable<CaronaVaccine> details = repo.findByCompanyNameIs(company);
		return  details;
	}

	@Override
	public List<ResultView> fetchByPriceGreaterThanEqualOrderByPrice(Integer price) {
		System.out.print(repo.getClass().getName());
		return repo.findByPriceGreaterThanEqualOrderByPrice(price);
	}

	
}
