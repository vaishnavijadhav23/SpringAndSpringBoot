package org.tnsif.project.placementmanagement.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.project.placementmanagement.entities.College;
import org.tnsif.project.placementmanagement.entities.Placement;
import org.tnsif.project.placementmanagement.repository.PlacementRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PlacementService {
	
	//to inject the dependency automatically
	@Autowired
	private PlacementRepository repo;
	
	//create
	public void create(Placement placement)
	{
		repo.save(placement);
	}
	
	//Retrieve with Specific ID
	public Placement retrieve(Integer id)
	{
		return repo.findById(id).get();
	}

	public List<Placement> retrieveAll()
	{
		return repo.findAll();
	}
	
	//delete with specific record
	public void delete(Integer id)
	{
		repo.deleteById(id);
	}
}
