package com.tjoeun.spring.mapper;

import org.apache.ibatis.annotations.Insert;

import com.tjoeun.spring.dto.ContentDTO;

public interface BoardMapper {
  
	@Insert("INSERT INTO CONTENT_TABLE "
			  + "VALUES(CONTENT_SEQ.NEXTVAL, #{content_subject}, "
			  + "#{content_text}, #{content_file, jdbcType=VARCHAR}, #{content_writer_idx}, "
			  + "#{content_board_idx}, SYSDATE)")
	void addContentInfo(ContentDTO writeContentDTO);
	
	
}
