package com.tjoeun.spring.dto;

import lombok.Data;

@Data
public class ContentDTO {
	private int content_idx;
	private String content_subject;
	private String content_text;
	private String content_file;
	private int content_writer_idx;
	private int content_board_idx;
	private String content_date;
}
