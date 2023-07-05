package org.tnsif.project.placementmanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.project.placementmanagement.entities.Student;
import org.tnsif.project.placementmanagement.repository.StudentRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class StudentService {
	/*
	 * to inject the dependencies automatically
	 */
	@Autowired
	private StudentRepository repo;

	// create, update
	public void create(Student student) {
		repo.save(student);
	}

	// retrieve with specific ID
	public Student retrieve(Integer id) {
		return repo.findById(id).get();
	}

	// retrieve all records
	public List<Student> retriveAll() {
		return repo.findAll();
	}
	
	//delete with specific record
	public void delete(Integer id) {
		 repo.deleteById(id);
	}
}
