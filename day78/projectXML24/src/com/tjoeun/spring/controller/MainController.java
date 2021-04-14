package com.tjoeun.spring.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tjoeun.spring.dao.TopMenuDAO;
import com.tjoeun.spring.dto.BoardInfoDTO;
import com.tjoeun.spring.dto.ContentDTO;
import com.tjoeun.spring.service.MainService;

@Controller
public class MainController {
	
	@Autowired
	private MainService mainService;
	
	@Autowired
	private TopMenuDAO topMenuDAO;
	
	@GetMapping("/main")
	public String main(HttpServletRequest request, Model model) {
		System.out.println(request.getServletContext().getRealPath("/"));
		
		// List<ContentDTO>
		// : 게시판 하나에 해당하는 리스트
		// List<List<ContentDTO>> listAll
		// : 게시판 4 개를 담는 리스트
		
		List<List<ContentDTO>> listAll 
		  = new ArrayList<List<ContentDTO>>();
		
		for(int i = 1 ; i <= 4; i++ ) {
  		List<ContentDTO> mainList 
  		  = mainService.getMainList(i);
  		listAll.add(mainList);
		}
		model.addAttribute("listAll", listAll);
		
		List<BoardInfoDTO> boardNameList
		  = topMenuDAO.getTopMenuList();
		model.addAttribute("boardNameList", boardNameList);
		
		
		return "main";
	}
}












