package com.cloud.pay.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloud.pay.dao.UserMapper;
import com.cloud.pay.domain.User;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper ;
	
	@Override
	public User query(Integer id){
		User user = userMapper.selectByPrimaryKey(id);
		return user ;
	}
}
