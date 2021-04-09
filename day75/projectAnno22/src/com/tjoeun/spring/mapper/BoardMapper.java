package com.tjoeun.spring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.tjoeun.spring.dto.ContentDTO;

public interface BoardMapper {
  
	@Insert("INSERT INTO CONTENT_TABLE "
			  + "VALUES(CONTENT_SEQ.NEXTVAL, #{content_subject}, "
			  + "#{content_text}, #{content_file, jdbcType=VARCHAR}, #{content_writer_idx}, "
			  + "#{content_board_idx}, SYSDATE)")
	void addContentInfo(ContentDTO writeContentDTO);
	
	@Select("SELECT BOARD_INFO_NAME FROM BOARD_INFO_TABLE WHERE BOARD_INFO_IDX=#{board_info_idx}")
	String getBoardInfoName(int board_info_idx);
	
	@Select("SELECT C.CONTENT_IDX, C.CONTENT_SUBJECT, U.USER_NAME CONTENT_WRITER_NAME, "
        + "       TO_CHAR(C.CONTENT_DATE, 'YYYY-MM-DD HH24:MI:SS') CONTENT_DATE "
        + "  FROM CONTENT_TABLE C, USER_TABLE U "
        + " WHERE C.CONTENT_WRITER_IDX = U.USER_IDX "
        + "   AND C.CONTENT_BOARD_IDX = #{board_info_idx} "
        + " ORDER BY C.CONTENT_IDX DESC")
	List<ContentDTO> getContentList(int board_info_idx);
	
}




