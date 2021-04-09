package com.tjoeun.spring.dto;

import javax.validation.constraints.NotBlank;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class ContentDTO {
	
	
	private int content_idx;
	
	@NotBlank
	private String content_subject;
	
	@NotBlank
	private String content_text;
	
	private MultipartFile upload_file;
	// browser가 보내는 file data를 저장하는 변수
	
	private String content_file;
	// 데이터베이스에 저장되어있는 파일이름을 저장하는 변수
	
	private int content_writer_idx;
	
	private int content_board_idx;
	
	private String content_date;
}



