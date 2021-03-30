package com.tjoeun.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	
	@GetMapping("/test1")
	public String test1() {
		return "test1";
	}
	
	@GetMapping("/test2")
	public String test2(HttpServletRequest request) {
		request.setAttribute("data1", 333);
		request.setAttribute("data2", 555);
		
		return "test2";
	}
	
	@GetMapping("/test3")
	public String test3(Model model) {
		model.addAttribute("data1", 111);
		model.addAttribute("data2", 222);
		
		return "test3";
	}
	
	@GetMapping("/test4")
	public ModelAndView test4(ModelAndView mv) {
		mv.addObject("data1", 1234);
		mv.addObject("data2", 5678);
		mv.setViewName("test4");
		return mv;
	}
}
