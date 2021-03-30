package com.tjoeun.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.tjoeun.spring.bean.MemberDTO;

@Controller
public class TestController {
	
	@GetMapping("/test1")
	//request 객체에 자동으로 저장됨
	public String test1(@ModelAttribute MemberDTO dto) {
		dto.setName("이순신");
		dto.setId("lee");
		dto.setPw("1111");
		dto.setPostcode("12345");
		dto.setAddr1("seoul");
		dto.setAddr2("마포");
		return "test1";
	}

	@GetMapping("/test2")
	public String test2(MemberDTO dto) {
		dto.setName("안중근");
		dto.setId("ahn");
		dto.setPw("1111");
		dto.setPostcode("6789");
		dto.setAddr1("seoul");
		dto.setAddr2("강남");
		return "test2";
	}
	
	@GetMapping("/test3")
	//자동 주입
	public String test3(@ModelAttribute("test3DTO") MemberDTO dto) {
		dto.setName("유관순");
		dto.setId("yoo");
		dto.setPw("1111");
		dto.setPostcode("6789");
		dto.setAddr1("seoul");
		dto.setAddr2("신도림");
		return "test3";
	}
	
	@GetMapping("/test4")
	public String test4(Model model) {
		MemberDTO dto = new MemberDTO();
		dto.setName("을지문덕");
		dto.setId("moon");
		dto.setPw("1111");
		dto.setPostcode("6789");
		dto.setAddr1("seoul");
		dto.setAddr2("신도림");
		
		model.addAttribute("test4DTO", dto);
		return "test4";
	}
}
