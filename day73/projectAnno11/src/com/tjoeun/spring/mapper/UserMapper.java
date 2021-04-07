package com.tjoeun.spring.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.tjoeun.spring.dto.UserDTO;

public interface UserMapper {

	@Select("SELECT USER_NAME FROM USER_TABLE WHERE USER_ID = #{user_id}")
	String checkID(String user_id);
	
	@Insert("insert into user_table values(user_seq.nextval, #{user_name}, #{user_id}, #{user_pw})")
	void addUserInfo(UserDTO joinUserDTO);
}
