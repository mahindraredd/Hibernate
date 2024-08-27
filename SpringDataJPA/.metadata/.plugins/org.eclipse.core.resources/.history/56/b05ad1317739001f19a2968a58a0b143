package com.uni.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uni.bo.CaronaVaccine;
import com.uni.dao.CaronoVaccineRepo;
@Service
public class CaronaServiceImpl implements ICaronaService {
	
	@Autowired
	private CaronoVaccineRepo repo;
	
	@Override
	public String registerVaccine(CaronaVaccine v) {
		System.out.println("In memory proxy class is "+repo.getClass().getName());
		CaronaVaccine saveVaccine=null;
		if(v!=null) {
		saveVaccine=repo.save(v);
		}
		return saveVaccine!=null ? "Vaccine Registered Successfully"+saveVaccine.getRegNo()
		:"vaccine Registration failed";
	}

	@Override
	public Iterable<CaronaVaccine> registerGroup(Iterable<CaronaVaccine> vaccines) {
		// TODO Auto-generated method stub
		return repo.saveAll(vaccines);
	}

	@Override
	public CaronaVaccine findingById(Long id) {
		System.out.println(repo.findById(id));
		return null;
	}

	@Override
	public boolean checkAvailability(Long regNo) {
		// TODO Auto-generated method stub
		return repo.existsById(regNo);
	}

	@Override
	public Iterable<CaronaVaccine> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void deleteByID(Long id) {
		repo.deleteById(id);
		
	}

	@Override
	public String deleteByObject(CaronaVaccine v) {
		Optional<CaronaVaccine> vaccine=repo.findById(v.getRegNo());
		if(vaccine.isPresent()) {
			repo.delete(v);
			return "deleted succesfully";
		}
		return "deletetion is not succesfully because there is no record";
		
	}

}
