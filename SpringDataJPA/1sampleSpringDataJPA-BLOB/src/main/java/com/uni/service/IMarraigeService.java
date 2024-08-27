package com.uni.service;

import java.util.Optional;

import com.uni.bo.MarriageSeeker;

public interface IMarraigeService {
		public String registerMarriageService(MarriageSeeker seeker);
		public Optional<MarriageSeeker> searchSeeker(Long id);
	
}
