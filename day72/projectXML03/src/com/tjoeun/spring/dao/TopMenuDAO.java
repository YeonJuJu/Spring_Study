package com.tjoeun.spring.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tjoeun.spring.dto.BoardInfoDTO;


@Repository
public class TopMenuDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public List<BoardInfoDTO> getTopMenuList(){
		List<BoardInfoDTO> topMenuList
		  = sqlSessionTemplate.selectList("topmenu.get_topmenu_list");
		return topMenuList;
	}
	
}


