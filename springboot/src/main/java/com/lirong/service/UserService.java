package com.lirong.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lirong.dao.UserMapper;
import com.lirong.pojo.Users;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;
	
	public List<Users> getUserList(){
		return userMapper.getUserList();
	}

	
	
	
}
