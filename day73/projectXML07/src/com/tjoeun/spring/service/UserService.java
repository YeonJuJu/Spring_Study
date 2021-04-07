package com.tjoeun.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tjoeun.spring.dao.UserDAO;
import com.tjoeun.spring.dto.UserDTO;

@Service
public class UserService {
	
	@Autowired
  private UserDAO userDAO;
  
  // UserDAO에 있는 String checkID(String user_id)를 실행해서
  // 돌려받은 return 값으로 유효한 아이디인지 아닌지 알아봄
  
  public boolean checkID(String user_id) {
  	String checking_id = userDAO.checkID(user_id);
  	
  	if(checking_id == null) {
  		return true;
  	}else {
  		return false;
  	}
  	
  }
  
  public void addUserInfo(UserDTO joinUserDTO) {
		userDAO.addUserInfo(joinUserDTO);
	}
  
  
  
}
