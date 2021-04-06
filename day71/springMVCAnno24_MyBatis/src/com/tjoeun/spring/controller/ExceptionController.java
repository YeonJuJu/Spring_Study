package com.tjoeun.spring.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExceptionController {
	@GetMapping("/test2")
	public String test2() {
		
		ArrayList<String> list = null;
		list.add("hello");
		
		return "test2";
	}
	
//	@ExceptionHandler(NullPointerException.class)
//	public String exception2() {
//		
//		return "error_2";
//	}
}
