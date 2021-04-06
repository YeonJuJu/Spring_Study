package com.tjoeun.spring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.tjoeun.spring.dto.BoardInfoDTO;

public interface TopMenuMapper {

	@Select("SELECT * FROM BOARD_INFO_TABLE")
	List<BoardInfoDTO> getTopMenuList();
	
}
