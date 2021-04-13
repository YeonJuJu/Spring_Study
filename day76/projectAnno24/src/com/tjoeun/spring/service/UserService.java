package com.tjoeun.spring.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tjoeun.spring.dao.UserDAO;
import com.tjoeun.spring.dto.UserDTO;

@Service
public class UserService {
	
	@Autowired
  private UserDAO userDAO;
	
	@Resource(name = "loginUserDTO")
	private UserDTO loginUserDTO;
	
  
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
  
	public void getLoginUserDTO(UserDTO tmpLoginUserDTO) {
		UserDTO fromDBUserDTO = userDAO.getLoginUserDTO(tmpLoginUserDTO);
		
		if(fromDBUserDTO != null) {
			loginUserDTO.setUser_idx(fromDBUserDTO.getUser_idx());
			loginUserDTO.setUser_name(fromDBUserDTO.getUser_name());
			loginUserDTO.setUserLogin(true);
		}
	}
	
	
  public void getModifyUserDTO(UserDTO modifyUserDTO) {
  	UserDTO fromDBModifyUserDTO 
  	  = userDAO.getModifyUserDTO(loginUserDTO.getUser_idx());
  	
  	modifyUserDTO.setUser_id(fromDBModifyUserDTO.getUser_id());
  	modifyUserDTO.setUser_name(fromDBModifyUserDTO.getUser_name());
  	modifyUserDTO.setUser_idx(loginUserDTO.getUser_idx());
  } 	
  // 로그인한 회원의 정보는 
  // session scope 에 생성된 loginUserDTO 객체에 저장되어 있음
  // 로그인한 회원의 회원번호를
  // 수정하려는 회원의 정보를 담고 있는
  // modifyUserDTO의 회원번호에 할당해줌
  public void modifyUserInfo(UserDTO modifyUserDTO) {
  	modifyUserDTO.setUser_idx(loginUserDTO.getUser_idx());
  	userDAO.modifyUserInfo(modifyUserDTO);
  }
  
  
}


