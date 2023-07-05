package org.tnsif.project.placementmanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.project.placementmanagement.entities.Admin;
import org.tnsif.project.placementmanagement.repository.AdminRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class AdminService {
	
		//to inject the dependency automatically
		@Autowired
		private AdminRepository repo;
		
		//create
		public void create(Admin admin) {
			repo.save(admin);
		}
		//retrieve with specific ID
		public Admin retrieve(Integer id)
		{
			return repo.findById(id).get();
		}
		//retrieve all records
		public List<Admin> retriveAll()
		{
			return repo.findAll();
		}
		//delete with specific record
		public void delete(Integer id)
		{
			repo.deleteById(id);
		}

	}


