package com.tjoeun.spring.service;

import org.springframework.stereotype.Service;

import com.tjoeun.spring.dto.ContentDTO;

@Service
public class BoardService {
  // parameter로 전달되어오는 data 확인하기
	public void addContentInfo(ContentDTO writeContentDTO) {
		System.out.println(writeContentDTO.getContent_subject());
		System.out.println(writeContentDTO.getContent_text());
		System.out.println(writeContentDTO.getUpload_file());
		System.out.println(writeContentDTO.getUpload_file().getSize());
		
	}
	
}
