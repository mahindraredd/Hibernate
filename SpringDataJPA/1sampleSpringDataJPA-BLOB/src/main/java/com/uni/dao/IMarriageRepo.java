package com.uni.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.uni.bo.MarriageSeeker;

public interface IMarriageRepo extends JpaRepository<MarriageSeeker, Long> {

}
