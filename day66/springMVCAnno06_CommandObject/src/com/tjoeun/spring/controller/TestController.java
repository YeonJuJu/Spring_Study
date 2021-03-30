package com.tjoeun.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tjoeun.spring.bean.InfoDTO;

@Controller
public class TestController {
	
	@PostMapping("/test1")
	//@ModelAttribute InfoDTO dto 여기선 @ModelAttribute annotation 생략 가능
	//annotation 생략된 경우 @ModelAttribute annotation이 적용됨 그러니까 디폴트란 소리~
	public String test1(@ModelAttribute InfoDTO dto) {
		System.out.println("name : " + dto.getName());
		System.out.println("id   : " + dto.getId());
		return "test1";
	}
	
	@PostMapping("/test2")
	public String test2(@ModelAttribute("test_data") InfoDTO dto) {
		
		return "test2";
	}
}
