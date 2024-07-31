package com.domaine.finance.service;

import java.util.List;
import java.util.Optional;

import com.domaine.finance.dao.IUserDao;
import com.domaine.finance.dao.UserDao;
import com.domaine.finance.dto.UserDto;
import com.domaine.finance.entity.UserEntity;
import com.domaine.finance.mapper.UserMapper;

public class UserService implements IUserService{

	private IUserDao userDao = new UserDao() ;
	@Override
	public List<UserDto> getAll() {
		
		return UserMapper.listUserEntityToUserDto(userDao.list(new UserEntity()));
	}
	
	@Override
	public boolean save(UserDto user) {
		
		return userDao.save(UserMapper.toUserEntity(user));
	}

	@Override
	public Optional<UserDto> login(String email, String password) {
		Optional<UserEntity> userEntity = userDao.login(email, password) ;
		if (userEntity.isPresent()) {
			UserEntity user = userEntity.get() ;
			return Optional.of(UserMapper.toUserDto(user)) ;
		} else {
			return Optional.empty();
		}
		
	}

}
