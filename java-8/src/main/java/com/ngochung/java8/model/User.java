package com.ngochung.java8.model;

import java.util.Optional;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
	private Integer id;
	private String name;
	private String age;
	private String address;
	private Optional<Role> role;
	
//	private Role role;
}
