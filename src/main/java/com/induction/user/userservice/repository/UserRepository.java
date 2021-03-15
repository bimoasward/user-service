package com.induction.user.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.induction.user.userservice.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	@Query(nativeQuery = true, value = "SELECT * FROM user_login WHERE id = :id")
    User getById(Integer id);
	
	@Query(nativeQuery = true, value = "SELECT * FROM user_login WHERE name = :name")
    User getByName(String name);
}
