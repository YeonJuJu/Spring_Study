package com.tjoeun.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/main")
	public String main(HttpServletRequest request, Model model) {
		System.out.println(request.getServletContext().getRealPath("/"));
		
		return "main";
	}
}












