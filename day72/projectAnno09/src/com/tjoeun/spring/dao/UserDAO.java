package com.tjoeun.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tjoeun.spring.mapper.UserMapper;

@Repository
public class UserDAO {
  
	@Autowired
	private UserMapper userMapper;
	
	public String checkID(String user_id) {
		String checking_id = userMapper.checkID(user_id);
		return checking_id;
	}
	
	
}






