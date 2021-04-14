package com.tjoeun.spring.service;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tjoeun.spring.dao.BoardDAO;
import com.tjoeun.spring.dto.ContentDTO;

@Service
public class MainService {
  
	@Autowired
	private BoardDAO boardDAO;
	
	public List<ContentDTO> getMainList
	(int board_info_idx){
		RowBounds rowBounds = new RowBounds(0, 5);
		List<ContentDTO> mainList
		  = boardDAO.getContentList(board_info_idx, rowBounds);
		return mainList;
	}
	
}






