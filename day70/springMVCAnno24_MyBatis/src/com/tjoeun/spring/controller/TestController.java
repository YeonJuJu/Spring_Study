package com.tjoeun.spring.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	@GetMapping("test1")
	public String test1(Model model) {	
		
		int[] arrNum = {11, 22, 33};
		
//		model.addAttribute("arrNum", arrNum[0]);
//		model.addAttribute("arrNum", arrNum[3]);
		
		ArrayList<String> list = null;
		list.add("Spring");		
		
		return "test1";
	}
	
//	@ExceptionHandler(ArrayIndexOutOfBoundsException.class)
//	public String exception1() {
//		return "error_1";
//	}
}
 