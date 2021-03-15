package com.induction.user.userservice.dto;

import lombok.Data;

@Data
public class UserDTO {

	private String id;
	private String name;
	private String age;
	private String companyCode;
	
	public UserDTO(String id, String name, String age, String companyCode) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.companyCode = companyCode;
	}
	
}
