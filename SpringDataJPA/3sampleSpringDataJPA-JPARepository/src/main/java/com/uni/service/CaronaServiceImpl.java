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
import org.springframework.transaction.annotation.Transactional;

import com.uni.bo.CaronaVaccine;
import com.uni.dao.CaronoVaccineRepo;
import com.uni.types.ResultView;
@Service
public class CaronaServiceImpl implements ICaronaService {
	
	@Autowired
	private CaronoVaccineRepo repo;

	public List<CaronaVaccine> findVaccinesByCompany(Integer dose){
		return repo.fetchVaccinesByCompany(dose);
	}

	@Override
	public List<Object[]> fetchvaccinesByPriceRange(Integer min, Integer max) {
		// TODO Auto-generated method stub
		return repo.fetchvaccinesByPriceRange(min, max);
	}

	@Override
	@Transactional
	public int modifyprice(int newprice, Long id) {
		// TODO Auto-generated method stub
		return repo.updateprice(newprice, id);
	}

	

	
}
