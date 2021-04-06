package com.tjoeun.spring.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tjoeun.spring.bean.DataDTO1;
import com.tjoeun.spring.bean.DataDTO2;
import com.tjoeun.spring.bean.DataDTO3;
import com.tjoeun.spring.bean.DataDTO4;

@Controller
public class TestController {

	// session  영역에서 생성되는 Bean의 주입시기
	// browser(client)가 server에 최초로 접속할 때     
	@Autowired
	@Lazy
	private DataDTO1 sessionDTO1;
	
	@Resource(name="sessionDTO2")
	@Lazy
	private DataDTO2 sessionDTO2;
	
	@Autowired
	@Lazy
	private DataDTO3 sessionDTO3;
	
	@Resource(name="sessionDTO4")
	@Lazy
	private DataDTO4 sessionDTO4;
	
	
	@GetMapping("/test1")
	public String test1() {
		
		sessionDTO1.setName("이순신");
		sessionDTO1.setAlias("성웅이순신");
		
		sessionDTO2.setAddr("서울");
		sessionDTO2.setPhone("1234");
		
		sessionDTO3.setJob("기획자");
		sessionDTO3.setHobby("코딩");
		
		sessionDTO4.setPsn("31654");
		sessionDTO4.setDl("987654");
		
		return "test1";
	}
	
	@GetMapping("/result1")
	public String result1(Model model) {
		
		System.out.printf
		("sessionDTO1.name : %s%n", sessionDTO1.getName());
		System.out.printf
		("sessionDTO1.alias : %s%n", sessionDTO1.getAlias());
		
		System.out.printf
		("sessionDTO2.addrr : %s%n", sessionDTO2.getAddr());
		System.out.printf
		("sessionDTO2.phone : %s%n", sessionDTO2.getPhone());
		
		System.out.printf
		("sessionDTO3.job : %s%n", sessionDTO3.getJob());
		System.out.printf
		("sessionDTO3.hobby : %s%n", sessionDTO3.getHobby());
		
		System.out.printf
		("sessionDTO4.psn : %s%n", sessionDTO4.getPsn());
		System.out.printf
		("sessionDTO4.dl : %s%n", sessionDTO4.getDl());
		
		
		model.addAttribute("sessionDTO1", sessionDTO1);
		model.addAttribute("sessionDTO2", sessionDTO2);
		model.addAttribute("sessionDTO3", sessionDTO3);
		model.addAttribute("sessionDTO4", sessionDTO4);
		
		
		return "result1";
	}
}










