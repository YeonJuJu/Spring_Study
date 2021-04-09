package com.tjoeun.spring.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.tjoeun.spring.dto.UserDTO;

public interface UserMapper {

	@Select("SELECT USER_NAME FROM USER_TABLE WHERE USER_ID = #{user_id}")
	String checkID(String user_id);
	
	@Insert("INSERT INTO USER_TABLE VALUES(USER_SEQ.NEXTVAL, #{user_name}, #{user_id}, #{user_pw})")
	void addUserInfo(UserDTO joinUserDTO);
	
	@Select("SELECT USER_IDX, USER_NAME FROM USER_TABLE " +  
          "WHERE USER_ID=#{user_id} AND USER_PW=#{user_pw}")
	UserDTO getLoginUser(UserDTO tmpLoginUserDTO);
	
	@Select("SELECT USER_ID, USER_NAME " +
    			"FROM USER_TABLE " +
    			"WHERE USER_IDX = #{user_idx}")
	UserDTO getModifyUserDTO(int user_idx);
	
}

















