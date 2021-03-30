package com.tjoeun.spring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SubController {

	@RequestMapping(value="sub1/test3", method=RequestMethod.GET)
	public String sub1Test3(){
		return "sub1/test3";
	}
	@GetMapping("sub1/test4")
	public String sub1Test4() {
		return "sub1/test4";
	}
}
