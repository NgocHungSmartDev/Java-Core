package com.ngochung.java8.service;

import java.util.Optional;

import com.ngochung.java8.exception.ResourceNotFoundException;
import com.ngochung.java8.model.Role;
import com.ngochung.java8.model.User;
import com.ngochung.java8.model.UserDTO;

public class UserService {
	public static void main(String[] args) {
//		System.out.println(getRoleId());
//		Optional<Role> role = Optional.of(Role.builder().id(1).name("Admin").build());
//		role.ifPresentOrElse(null, null);
		UserDTO dto = UserDTO.builder()
				.name(getUserNonOptional().getName())
				.roleId(getUserNonOptional().getRole()
						.orElseThrow(ResourceNotFoundException :: roleNotFound).getId())
				.build();
		
		System.out.println(dto);
	}

	private static User getUserNonOptional() {
//		Role role = null;
		Role role = Role.builder().id(1).name("Admin").build();
		User user = User.builder().id(1).name("User 1").age("28").address("Da Nang")
				.role(Optional.ofNullable(role))
				.build();
		return user;
	}
	
	private static Optional<User> getUser() {
//		Role role = Role.builder().id(1).name("Admin").build();
		Role role = null;
		User user = User.builder().id(1).name("User 1").age("28").address("Da Nang")
				.role(Optional.ofNullable(role))
//				.role(role)
				.build();
		return Optional.ofNullable(user);
	}

	public static int getRoleId() {
		
		return getUser()
				.map(User :: getRole)
				.orElseThrow(ResourceNotFoundException :: roleNotFound)
				.map(Role :: getId)
				.orElseThrow(ResourceNotFoundException :: userNotFound);
	}

}
