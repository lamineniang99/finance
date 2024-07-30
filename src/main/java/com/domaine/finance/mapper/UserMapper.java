package com.domaine.finance.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.domaine.finance.dto.UserDto;
import com.domaine.finance.entity.UserEntity;

public class UserMapper {

	public static List<UserDto> listUserEntityToUserDto(List<UserEntity> users) {
		return users.stream()
				.map(user -> toUserDto(user))
				.collect(Collectors.toList()) ;
	}
	
	
	public static UserEntity toUserEntity(UserDto user) {
		return new UserEntity(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail(), user.getPassword());
	}
	
	
	public static UserDto toUserDto(UserEntity user) {
		return new UserDto(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail(), user.getPassword());
	}
}
