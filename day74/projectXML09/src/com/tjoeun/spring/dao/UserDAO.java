package com.tjoeun.spring.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tjoeun.spring.dto.UserDTO;

@Repository
public class UserDAO {
  
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public String checkID(String user_id) {
		String ckecking_id 
		  = sqlSessionTemplate.selectOne("user.checkID", user_id);
		return ckecking_id;
	}
	public void addUserInfo(UserDTO joinUserDTO){
		sqlSessionTemplate.insert("user.addUserInfo", joinUserDTO);
	}
	public UserDTO getLoginUserDTO(UserDTO tmpLoginUserDTO) {
		UserDTO fromDBUserDTO 
		  = sqlSessionTemplate.selectOne("user.getLoginUser", tmpLoginUserDTO);
		return fromDBUserDTO;
	}
	
  public UserDTO getModifyUserDTO(int user_idx) {
  	UserDTO fromDBModifyUserDTO 
  	  = sqlSessionTemplate.selectOne("user.getModifyUserDTO", user_idx);
		return fromDBModifyUserDTO;
  	
  } 
	
	public void modifyUserInfo(UserDTO modifyUserDTO){
		sqlSessionTemplate.update("user.modifyUserInfo", modifyUserDTO);
		
	}
		
}



