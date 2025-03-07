package com.uni.service;

import java.util.Iterator;
import java.util.Optional;

import org.slf4j.helpers.Reporter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.ScrollPosition.Direction;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.uni.bo.CaronaVaccine;
import com.uni.dao.CaronoVaccineRepo;
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

	
}
