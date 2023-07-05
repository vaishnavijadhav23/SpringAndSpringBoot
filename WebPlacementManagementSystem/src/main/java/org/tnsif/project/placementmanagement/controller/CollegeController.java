package org.tnsif.project.placementmanagement.controller;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
/*Program to demonstrate on RESTful API's and it contains
 * business logic of an application*/
import org.springframework.web.bind.annotation.RestController;
import org.tnsif.project.placementmanagement.entities.College;
import org.tnsif.project.placementmanagement.services.CollegeService;
/*it is used to create controllers for REST API's which can
 * return JSON*/
@RestController
public class CollegeController {
	
	@Autowired
	private CollegeService service;
	
	//RESTful API's method
	@PostMapping("/college")
	public void insert(@RequestBody College college)
	{
		service.create(college);
	}
	
	@DeleteMapping("/college/{id}")
	public void remove(@PathVariable Integer id)
	{
		service.delete(id);
	}
	
	@GetMapping("/college")
	public List<College>retriveA()
	{
		return service.retriveAll();
	}
	
	@GetMapping("/college/{id}")
	public ResponseEntity<College> retreive(@PathVariable Integer id)
	{
		try {
			College college=service.retrieve(id);
			return new ResponseEntity<College>(college,HttpStatus.OK);

		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<College>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping("/college/{id}")
	public ResponseEntity<College>update (@RequestBody College college,@PathVariable Integer id)
	{
		try {
		College c=service.retrieve(id);
		service.create(college);
		return new ResponseEntity<College>(HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<College>(HttpStatus.NOT_FOUND);
		}
	}
	
	
	
	

}