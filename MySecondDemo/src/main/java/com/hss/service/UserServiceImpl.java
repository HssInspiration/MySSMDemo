package com.hss.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hss.entity.User;
import com.hss.mapper.UserMapper;

@Service
@Transactional
public class UserServiceImpl implements IUserService{

	@Autowired
	public UserMapper userMapper;
	
	public User queryUser(String userName) {
		return userMapper.queryUser(userName);
	}

}
