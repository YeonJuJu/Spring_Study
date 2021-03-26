package com.tjoeun.spring.db;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.tjoeun.spring.bean.JDBCDTO;

@Component
public class JDBCDAO {
	
	// JDBC 관리 객체를 주입 받음
	@Autowired
	private JdbcTemplate db;

	@Autowired
	private Mapper mapper;
	
	// DB(table)에 data 저장하기 : insert
	public void insert_data(JDBCDTO dto) {
		String sql = "insert into jdbc_test values(?, ?)";
		db.update(sql, dto.getInt_data(), dto.getStr_data());
	}
	
	// DB(table)에 저장된 data 조회하기 : select
	public List<JDBCDTO> select_data(){
		List<JDBCDTO> list = new ArrayList<JDBCDTO>();
		
		String sql = "select * from jdbc_test";
		
		list = db.query(sql, mapper);
		
		return list;
	}
	
	// DB(table)에 저장된 data 수정하기 : update
	public void update_data(JDBCDTO dto) {
		String sql = "update jdbc_test set str_data=? where int_data=?";
		
		db.update(sql, dto.getStr_data(), dto.getInt_data());
	}
	
	// DB(table)에 저장된 data 수정하기 : update
	public void delete_data(int int_data) {
		String sql = "delete from jdbc_test where int_data=?";
			
		db.update(sql, int_data);
	}
}
