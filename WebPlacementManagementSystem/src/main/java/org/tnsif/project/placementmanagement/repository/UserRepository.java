package org.tnsif.project.placementmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tnsif.project.placementmanagement.entities.User;

public interface UserRepository extends JpaRepository<User,Long>{

	User findByUsername(String username);
}
