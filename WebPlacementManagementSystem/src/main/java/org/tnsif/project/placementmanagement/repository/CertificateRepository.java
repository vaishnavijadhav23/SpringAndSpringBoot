package org.tnsif.project.placementmanagement.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.tnsif.project.placementmanagement.entities.Certificate;
	
	/*Jpa repository is an interface which contains all the 
	 * crud operations which is required for SpringBoot*/

	public interface CertificateRepository extends JpaRepository<Certificate, Integer> {
		
		

	}


