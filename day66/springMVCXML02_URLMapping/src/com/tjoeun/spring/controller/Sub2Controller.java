package com.tjoeun.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sub2")
public class Sub2Controller {
	@GetMapping("/test5")
	public String sub2Test5() {
		return "sub2/test5";
		
	}
	
	@GetMapping("/test6")
	public String sub2Test6() {
		return "sub2/test6";
	}
}
