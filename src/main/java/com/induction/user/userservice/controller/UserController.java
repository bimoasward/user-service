package com.induction.user.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.induction.user.userservice.dto.UserDTO;
import com.induction.user.userservice.service.UserService;

@RestController
@RequestMapping("/get")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping(value = "/getById/{id}")
	public UserDTO getUserById(@PathVariable(value = "id") Integer id) {
		return userService.getById(id);
	}
	
	@GetMapping(value = "/getByName/{name}")
	public UserDTO getUserByName(@PathVariable(value = "name") String name) {
		return userService.getByName(name);
	}
}
