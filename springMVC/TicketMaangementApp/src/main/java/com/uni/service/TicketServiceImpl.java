package com.uni.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uni.dao.ITouristRepo;
import com.uni.exception.TouristNotFoundException;
import com.uni.models.Tourist;

@Service
public class TicketServiceImpl implements ITicketService {
	
	@Autowired
	private ITouristRepo repo;
	
	@Override
	public String registerTourist(Tourist tourist) {
		// TODO Auto-generated method stub
		Tourist msg=repo.save(tourist);
		return  ""+msg.getId();
	}

	@Override
	public List<Tourist> getAll() {
	 List<Tourist> list = (List<Tourist>) repo.findAll();
	 list.sort((t1,t2)->t1.getBudget().compareTo(t2.getBudget()));
	 
		return list;
	}

	@Override
	public Tourist fetechById(Integer id) {
		// TODO Auto-generated method stub
		Optional<Tourist> option=repo.findById(id);
		
		
		return repo.findById(id)
				.orElseThrow(()->new TouristNotFoundException("tourist not found with id "+ id));
	}

	@Override
	public String updateTouristByDetails(Tourist tourist) {
		Optional<Tourist> optional = repo.findById(tourist.getId());
		System.out.print(optional.get());
		if(optional!=null) {
			
			return "details with "+ repo.save(tourist)+"was updated with new values"+tourist;
		}
		else
			throw new TouristNotFoundException("Toursit not found with id "+ tourist.getId());
	}

	@Override
	public String updateToursitBudget(Integer id, float budget) {
		Optional<Tourist> optional = repo.findById(id);
		System.out.print(optional.get());
		if(optional!=null) {
			Tourist tourist=optional.get();
			tourist.setBudget(tourist.getBudget()+tourist.getBudget()*(budget/100));
			repo.save(tourist);
			return "budget is update for  "+ tourist.getId();
		}
		else
			throw new TouristNotFoundException("Toursit not found with id "+ id);
	}

}
