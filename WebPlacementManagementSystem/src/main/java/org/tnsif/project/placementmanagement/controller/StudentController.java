package org.tnsif.project.placementmanagement.controller;
/*
 * program to demonstrate on restful API"s and
 * it contains business logic of application
 */
import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.tnsif.project.placementmanagement.entities.Student;
import org.tnsif.project.placementmanagement.services.StudentService;

/* it is used to create controllers for
 * rest api's which can return JSON
 */
import org.springframework.web.bind.annotation.RestController;
@RestController
public class StudentController {

	@Autowired
	private StudentService service;

	// RESTful API's method
	@PostMapping("/student")
	public void insert(@RequestBody Student student) {
		service.create(student);
	}

	// delete
	@DeleteMapping("/student/{id}")
	public void remove(@PathVariable Integer id) {
		service.delete(id);
	}

	@GetMapping("/student")
	public List<Student> retriveALL() {
		return service.retriveAll();
	}

	@GetMapping("/student/{id}")
	public ResponseEntity<Student> retrive(@PathVariable Integer id) {
		try {
			Student student = service.retrieve(id);
			return new ResponseEntity<Student>(student, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}
	}

	@PutMapping("/student/{id}")
	public ResponseEntity<Student> update(@RequestBody Student student, @PathVariable Integer id) {
		try {
			Student s = service.retrieve(id);
			service.create(student);
			return new ResponseEntity<Student>(student, HttpStatus.OK);

		} catch (NoSuchElementException e) {
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}
	}
}
