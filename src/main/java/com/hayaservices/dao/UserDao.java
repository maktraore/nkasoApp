package com.hayaservices.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hayaservices.model.User;

public interface UserDao extends JpaRepository<User, Long>{
	Optional<User> findByEmail(String email);
	Boolean existsByEmail(String email);
}
