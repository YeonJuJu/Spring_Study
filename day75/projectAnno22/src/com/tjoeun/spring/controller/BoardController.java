package com.tjoeun.spring.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tjoeun.spring.dto.ContentDTO;
import com.tjoeun.spring.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/main")
	public String main
	(@RequestParam("board_info_idx") int board_info_idx,
		Model model) {
		
		model.addAttribute("board_info_idx",board_info_idx);

		String board_info_name
		  = boardService.getBoardInfoName(board_info_idx);
		model.addAttribute("board_info_name", board_info_name);
		
		List<ContentDTO> contentList
	    = boardService.getContentList(board_info_idx);
		model.addAttribute("contentList", contentList);
		
		return "board/main";
	}
	
	@GetMapping("/read")
	public String read() {
		return "board/read";
	}
	
	@GetMapping("/write")
	public String write
	// parameter로 들어오는 board_info_idx 값을
	// writeContentDTO 에 넣어줌
	(@ModelAttribute("writeContentDTO") ContentDTO writeContentDTO,
	 @RequestParam("board_info_idx") int board_info_idx) 
	{
		writeContentDTO.setContent_board_idx(board_info_idx);
		return "board/write";
	}
	
	@PostMapping("/write_proc")
	public String writeProc
	(@Valid @ModelAttribute("writeContentDTO") ContentDTO writeContentDTO,
	 BindingResult result) {
		if(result.hasErrors()) {
			return "board/write";
		}
		
		boardService.addContentInfo(writeContentDTO);
		
		return "board/write_success";
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








