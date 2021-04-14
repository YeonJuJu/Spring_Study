package com.tjoeun.spring.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
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
	
	public List<ContentDTO> getContentList(int board_info_idx, RowBounds rowBounds){
		List<ContentDTO> contentList
		  = sqlSessionTemplate.selectList("board.getContentList", board_info_idx, rowBounds);
		return contentList;
	}
	public ContentDTO getContentInfo(int content_idx){
		ContentDTO readContentDTO
		  = sqlSessionTemplate.selectOne("board.getContentInfo", content_idx);
		return readContentDTO;
	}
	
	public void modifyContentInfo(ContentDTO modifyContentDTO) {
		sqlSessionTemplate.update("board.modifyContentInfo", modifyContentDTO);
	}
	
	public int getContentCnt(int content_board_idx) {
		int contentCnt = sqlSessionTemplate.selectOne("board.getContentCnt", content_board_idx);
		return contentCnt;
	}
}








