package com.domaine.finance.service;

import java.util.List;
import java.util.Optional;

import com.domaine.finance.dto.UserDto;

public interface IUserService {

	public List<UserDto> getAll() ;
	public boolean save(UserDto user) ;
	public Optional<UserDto> login(String email, String password) ;
}
