package com.tjoeun.spring.service;

import java.io.File;
import java.io.IOException;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.tjoeun.spring.dao.BoardDAO;
import com.tjoeun.spring.dto.ContentDTO;
import com.tjoeun.spring.dto.UserDTO;

@Service
@PropertySource("/WEB-INF/properties/option.properties")
public class BoardService {
	
	@Value("${path.load}")
	private String path_load;
	
	@Autowired
	private BoardDAO boardDAO;
	
	@Resource(name="loginUserDTO")
	private UserDTO loginUserDTO;
	
	private String saveUploadFile(MultipartFile upload_file) {
		String file_name 
		  = System.currentTimeMillis() + "_" + upload_file.getOriginalFilename();
		
		try {
			upload_file.transferTo(new File(path_load + "/" + file_name));
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return file_name;
	}
	
  // parameter로 전달되어오는 data 확인하기
	public void addContentInfo(ContentDTO writeContentDTO) {
		/*
		System.out.println(writeContentDTO.getContent_subject());
		System.out.println(writeContentDTO.getContent_text());
		System.out.println(writeContentDTO.getUpload_file());
		System.out.println(writeContentDTO.getUpload_file().getSize());
		*/
		
		MultipartFile upload_file 
		  = writeContentDTO.getUpload_file();
		
		if(upload_file.getSize() > 0) {
			String file_name = saveUploadFile(upload_file);
			// System.out.println("파일 : " + file_name);
			writeContentDTO.setContent_file(file_name);
		}
		
		writeContentDTO.setContent_writer_idx(loginUserDTO.getUser_idx());
		
		boardDAO.addContentInfo(writeContentDTO);
		
	}
	
	public String getBoardInfoName(int board_info_idx) {
		String board_info_name
		  = boardDAO.getBoardInfoName(board_info_idx);
	  return board_info_name;
	}
	
	
	
}


