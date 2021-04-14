package com.tjoeun.spring.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tjoeun.spring.dto.ContentDTO;
import com.tjoeun.spring.dto.PageDTO;
import com.tjoeun.spring.dto.UserDTO;
import com.tjoeun.spring.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@Resource(name="loginUserDTO")
	@Lazy
	private UserDTO loginUserDTO;
	
	@GetMapping("/main")
	public String main
	(@RequestParam("board_info_idx") int board_info_idx,
	 @RequestParam(value="page", defaultValue="1") int page,
	 Model model) {
		
		model.addAttribute("board_info_idx",board_info_idx);

		String board_info_name
		  = boardService.getBoardInfoName(board_info_idx);
		model.addAttribute("board_info_name", board_info_name);
		
		List<ContentDTO> contentList
	    = boardService.getContentList(board_info_idx, page);
		model.addAttribute("contentList", contentList);
		
		PageDTO pageDTO
    = boardService.getContentCnt(board_info_idx, page); 
		/*= boardService.getContentCnt(content_board_idx, currentPage);*/
		model.addAttribute("pageDTO", pageDTO);
		
		
	  // 로그인한 사람과 글 쓴 사람의 회원번호가
	  // 같은지 비교하기 위함
	  // (in read.jsp)
	  // <c:if test="${loginUserDTO.user_idx == readContentDTO.content_writer_idx }">		
		
		
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
		
		boardService.addContentInfo(writeContentDTO);
		
		return "board/write_success";
	}
	
	
	// 주소표시줄에 나온 URL 중
	// http://localhost:8090/board/modify?board_info_idx=1&content_idx=7
	// ?board_info_idx=1&content_idx=7 <-- get방식으로 전달받음 (from read.jsp)
	
	@GetMapping("/modify")
	public String modify
	(@RequestParam("board_info_idx") int board_info_idx,
	 @RequestParam("content_idx") int content_idx, 
	 @ModelAttribute("modifyContentDTO") ContentDTO modifyContentDTO,
	 Model model) {
		
		model.addAttribute("board_info_idx", board_info_idx);
		model.addAttribute("content_idx", content_idx);
		
		// content_idx에 해당하는 게시글 내용(ContentDTO)을 불러와서
		// ㄴ DB에 저장된 게시글의 내용들을 Select 하여
		//    ContentDTO에 담아서 가져옴
		// modifyContentDTO 의 멤버변수들에 다 저장하고
		// 이 modifyContentDTO 를 modify.jsp에서
		// spring custom tag 의 modelAttribute 속성에 지정하여
		// 이곳에서 값이 setting된 멤버변수들의 값들이
		// modify.jsp 화면에 출력되도록 함
		
		ContentDTO fromDBContentDTO
		  = boardService.getContentInfo(content_idx);
		
		modifyContentDTO.setContent_writer_name
		(fromDBContentDTO.getContent_writer_name());
		modifyContentDTO.setContent_date
		(fromDBContentDTO.getContent_date());
		modifyContentDTO.setContent_subject
		(fromDBContentDTO.getContent_subject());
		modifyContentDTO.setContent_text
		(fromDBContentDTO.getContent_text());
		modifyContentDTO.setContent_file
		(fromDBContentDTO.getContent_file());
		modifyContentDTO.setContent_writer_idx
		(fromDBContentDTO.getContent_writer_idx());
		modifyContentDTO.setContent_board_idx(board_info_idx);
		modifyContentDTO.setContent_idx(content_idx);
		
		return "board/modify";
	}
	

	@PostMapping("/modify_proc")
	public String modifyProc
	(@Valid @ModelAttribute("modifyContentDTO") ContentDTO modifyContentDTO,
	 BindingResult result) {
		if(result.hasErrors()) {
			return "board/modify";
		}
		boardService.modifyContentInfo(modifyContentDTO);
		return "board/modify_success";
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








