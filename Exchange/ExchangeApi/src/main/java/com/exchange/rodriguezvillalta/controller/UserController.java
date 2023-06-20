package com.exchange.rodriguezvillalta.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.exchange.rodriguezvillalta.model.entities.User;
import com.exchange.rodriguezvillalta.model.entities.response.UserResponse;
import com.exchange.rodriguezvillalta.model.entities.response.UserResponseData;
import com.exchange.rodriguezvillalta.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping()
	public UserResponse getUsers(){
		UserResponse userResponse = new UserResponse();
		UserResponseData urd = new UserResponseData();
		urd.setResults(userService.getAllUsers());
		userResponse.setData(urd);
		return userResponse;
	}
	
	@GetMapping("/{id}")
	public User getUser(@PathVariable Integer id) {
		User user = userService.getUserById(id);
		return user;
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	
	@PutMapping()
	public User updateUsers(@RequestBody User user) {
		return userService.updateUser(user);
	}
	
	@DeleteMapping(value="/{id}")
	public void deleteUser(@PathVariable("id") Integer id) {
		userService.deleteAppUser(id);
	}
	
}
