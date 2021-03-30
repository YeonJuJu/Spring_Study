package com.tjoeun.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tjoeun.spring.bean.InfoDTO;
import com.tjoeun.spring.bean.MemberDTO;

@Controller
public class TestController {
	
	@PostMapping("/test1")
	public String test1(@ModelAttribute MemberDTO dto) {
		dto.setName("이순신");
		dto.setId("lee");
		dto.setPw("1111");
		dto.setPostcode("12345");
		dto.setAddr1("seoul");
		dto.setAddr2("마포");
		return "test1";
	}

}
