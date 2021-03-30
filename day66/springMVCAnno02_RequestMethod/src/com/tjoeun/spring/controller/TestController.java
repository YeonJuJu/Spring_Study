package com.tjoeun.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	@GetMapping("/test1")
	public String test1() {
		return "test1";
	}
	
	@PostMapping("/test2")
	public String test2() {
		return "test2";
	}
	
	@GetMapping("/test3")
	public String test3_get() {
		return "test3";
	}
	
	@PostMapping("/test3")
	public String test3_post() {
		return "test3";
	}
	
	@RequestMapping
	(value="test4", 
	 method= {RequestMethod.GET, RequestMethod.POST} )
	public String test4_gp() {
		return "test4";
	}
	
	@GetMapping("/test5")
	public String test5_get() {
		return test5_post();
	}
	
	@PostMapping("/test5")
	public String test5_post() {
		return "test5";
	}
	
	
}
