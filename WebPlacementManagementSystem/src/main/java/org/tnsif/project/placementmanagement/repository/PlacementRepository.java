package org.tnsif.project.placementmanagement.repository;
import org.springframework.data.jpa.repository.JpaRepository;


import org.tnsif.project.placementmanagement.entities.*;


//JPA contains all the CURD operations which is required for the Spring boot
public interface PlacementRepository extends JpaRepository<Placement, Integer>{

}
