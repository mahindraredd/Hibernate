package com.uni.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uni.bo.MarriageSeeker;
import com.uni.dao.IMarriageRepo;
@Service
public class MarriageSeekerImpl implements IMarraigeService {
	@Autowired
	private IMarriageRepo repo;
	@Override
	public String registerMarriageService(MarriageSeeker seeker) {
		
		return "registered succesfully"+repo.save(seeker).getId();
	}

	@Override
	public Optional<MarriageSeeker> searchSeeker(Long id) {
		// TODO Auto-generated method stub
		Optional<MarriageSeeker> data=repo.findById(id);
		if(data!=null)
			return data;
		else
			return Optional.empty();
	}

}
