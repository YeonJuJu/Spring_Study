package com.tjoeun.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tjoeun.spring.dto.ContentDTO;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@GetMapping("/main")
	public String main
	(@RequestParam("board_info_idx") int board_info_idx,
		Model model) {
		
		model.addAttribute("board_info_idx",board_info_idx);
		
		return "board/main";
	}
	
	@GetMapping("/read")
	public String read() {
		return "board/read";
	}
	
	@GetMapping("/write")
	public String write
	(@ModelAttribute("writeContentDTO") ContentDTO writeContentDTO) 
	{
	
		return "board/write";
	}
	
	@GetMapping("/modify")
	public String modify() {
		return "board/modify";
	}
	
	@GetMapping("/delete")
	public String delete() {
		return "board/delete";
	}
	
}








