package com.tjoeun.spring.controller;

import java.util.List;

import javax.annotation.Resource;
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
import com.tjoeun.spring.dto.UserDTO;
import com.tjoeun.spring.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@Resource(name = "loginUserDTO")
	private UserDTO loginUserDTO;
	
	
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
	public String read
	(@RequestParam("board_info_idx") int board_info_idx,
	 @RequestParam("content_idx") int content_idx, Model model) {
		
		model.addAttribute("board_info_idx", board_info_idx);
		
		// 글번호(content_idx)를 Request 객체에 저장함
		// 수정하기나 삭제하기 버튼을 눌렀을 때
		// 어떤 글을 수정, 삭제할지 알기 위함
		model.addAttribute("content_idx", content_idx);
		
		model.addAttribute("loginUserDTO", loginUserDTO);
		
		ContentDTO readContentDTO
		  = boardService.getContentInfo(content_idx);
		model.addAttribute("readContentDTO", readContentDTO);
		
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
		
		// parameter로 주입받은 writeContentDTO를 mapper까지 전달하고
		// mapper에서 해당 글의 index(content_idx)를 주입 받았으므로
		// 아랫 줄의 writeContentDTO에는 새로 작성한 글의 index(content_idx)가 들어있음
		// content_board_idx(게시판 index번호는 write.jsp에서 hidden으로 넘겨서 여기서 받음)
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
	
	@GetMapping("/not_writer")
	public String notWriter() {
		return "/board/not_writer";
	}
	
	
}








