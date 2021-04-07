package com.tjoeun.spring.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {
  
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public String checkID(String user_id) {
		String ckecking_id 
		  = sqlSessionTemplate.selectOne("user.checkID", user_id);
		return ckecking_id;
	}
	
}



