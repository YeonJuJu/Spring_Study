package com.tjoeun.spring.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tjoeun.spring.bean.DataDTO1;
import com.tjoeun.spring.bean.DataDTO2;
import com.tjoeun.spring.bean.DataDTO3;
import com.tjoeun.spring.bean.DataDTO4;


@Controller
public class TestController {

	/*
	 * 	session 영역에서 생성되는  Bean의 주입 시기
	 *  browser(client)가 server에 최초로 접속할 때
	 */
	@Autowired
	private DataDTO1 sessionDTO1;
	@Resource(name="sessionDTO2")
	private DataDTO2 sessionDTO2;
	@Autowired
	private DataDTO3 sessionDTO3;
	@Resource(name="sessionDTO4")
	private DataDTO4 sessionDTO4;
	
	@GetMapping("/test1")
	public String test1() {	
		
		sessionDTO1.setName("James");
		sessionDTO1.setAlias("pizza");
		
		sessionDTO2.setAddr("Seoul");
		sessionDTO2.setPhone("02");
		
		sessionDTO3.setJob("cooker");
		sessionDTO3.setHobby("sing");
		
		sessionDTO4.setPsn("951230");
		sessionDTO4.setDl("123456");
		
		return "test1";
	}

	@GetMapping("/result1")
	public String result1(Model model) {	
		
		System.out.println("name : " + sessionDTO1.getName());
		System.out.println("alias : " + sessionDTO1.getAlias());
		
		System.out.println("addr : " + sessionDTO2.getAddr());
		System.out.println("phone : " + sessionDTO2.getPhone());
		
		System.out.println("job : " + sessionDTO3.getJob());
		System.out.println("hobby : " + sessionDTO3.getHobby());

		System.out.println("psn : " + sessionDTO4.getPsn());
		System.out.println("dl : " + sessionDTO4.getDl());
		
		model.addAttribute("sessionDTO1", sessionDTO1);
		model.addAttribute("sessionDTO2", sessionDTO2);
		model.addAttribute("sessionDTO3", sessionDTO3);
		model.addAttribute("sessionDTO4", sessionDTO4);
		
		return "result1";
	}
	
}
