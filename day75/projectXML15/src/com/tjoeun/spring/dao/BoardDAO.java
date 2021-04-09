package com.tjoeun.spring.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tjoeun.spring.dto.ContentDTO;

@Repository
public class BoardDAO {
  
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public void addContentInfo(ContentDTO writeContentDTO) {
		sqlSessionTemplate.insert("board.addContentInfo", writeContentDTO);
	}
	
	public String getBoardInfoName(int board_info_idx) {
		String board_info_name
		  = sqlSessionTemplate.selectOne("board.getBoardInfoName", board_info_idx);
	  return board_info_name; 	
	}
	
	
}






