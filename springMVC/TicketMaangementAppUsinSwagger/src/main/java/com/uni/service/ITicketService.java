package com.uni.service;

import java.util.List;

import com.uni.models.Tourist;

public interface ITicketService {
	public String registerTourist(Tourist tourist);
	public List<Tourist> getAll();
	public Tourist fetechById(Integer id);
	public String updateTouristByDetails(Tourist tourist);
	public String updateToursitBudget(Integer id, float budget);

}
