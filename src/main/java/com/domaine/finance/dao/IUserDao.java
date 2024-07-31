package com.domaine.finance.dao;

import java.util.Optional;

import com.domaine.finance.entity.UserEntity;

public interface IUserDao extends Repository<UserEntity>{

	public Optional<UserEntity> login(String email, String password) ;
}
