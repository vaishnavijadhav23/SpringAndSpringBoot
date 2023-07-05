package org.tnsif.project.placementmanagement.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.tnsif.project.placementmanagement.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}