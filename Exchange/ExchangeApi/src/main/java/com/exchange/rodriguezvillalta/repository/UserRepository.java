package com.exchange.rodriguezvillalta.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.exchange.rodriguezvillalta.model.entities.User;


public interface UserRepository extends JpaRepository<User, Integer> {
	Optional<User> findByName(String name);
	}