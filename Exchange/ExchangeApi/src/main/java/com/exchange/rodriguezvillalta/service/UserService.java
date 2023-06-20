package com.exchange.rodriguezvillalta.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.exchange.rodriguezvillalta.model.entities.User;
import com.exchange.rodriguezvillalta.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
	
	public User getUserById(Integer idUser) {
		return userRepository.findById(idUser).orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND,"User not found with id :" + idUser));
	}
	
	public User createUser(User user) {
		return userRepository.save(user);
	}
	
	public User updateUser(User user) {
		userRepository.findById(user.getId()).orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND,"User not found with id :" + user.getId()));
		return userRepository.save(user);
	}
	
	public void deleteAppUser(Integer idUser) {
		userRepository.deleteById(idUser);
	}

}
