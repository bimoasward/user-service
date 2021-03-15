package com.induction.user.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.induction.user.userservice.dto.UserDTO;
import com.induction.user.userservice.entity.User;
import com.induction.user.userservice.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public UserDTO getUserDTO(User user) {
		return new UserDTO(user.getId().toString(), user.getName(), user.getAge().toString(), user.getCompanyCode());
	}
	
	public UserDTO getById(Integer id) {
		return getUserDTO(userRepository.getById(id));
	}
	
	public UserDTO getByName(String name) {
		return getUserDTO(userRepository.getByName(name));
	}
}
