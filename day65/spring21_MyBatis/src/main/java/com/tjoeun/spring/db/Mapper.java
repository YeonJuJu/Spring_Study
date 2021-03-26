package com.tjoeun.spring.db;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.tjoeun.spring.bean.JDBCDTO;

@Component
public class Mapper implements RowMapper<JDBCDTO>{

	public JDBCDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		JDBCDTO dto = new JDBCDTO();
		dto.setInt_data(rs.getInt("int_data"));
		dto.setStr_data(rs.getString("str_data"));
		
		return dto;
	}
	
}
