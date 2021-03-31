package com.tjoeun.spring.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.tjoeun.spring.bean.DataDTO1;


@Controller
public class TestController {
	
	@Autowired
	ServletContext application;
	
	@GetMapping("/test2")
	public String test2() {
		
		application.setAttribute("fruit2", "banana");
		
		DataDTO1 dto1 = new DataDTO1();
		dto1.setName("이순신");
		dto1.setAlias("성웅이순신");
		
		application.setAttribute("dto1", dto1);
		
		return "test2";
	}
	
	@GetMapping("/result2")
	public String result2() {
		
		String fruit2 = (String)application.getAttribute("fruit2");
		System.out.printf("fruit2 : %s%n", fruit2);
		
		DataDTO1 dto1 = (DataDTO1) application.getAttribute("dto1");
		System.out.println("dto1.name :" + dto1.getName());
		System.out.println("dto1.alias :" + dto1.getAlias());
		
		return "result2";
	}
	
	@GetMapping("/test1")
	public String test1(HttpServletRequest request) {	
		// application : ServletContext
		ServletContext application = request.getServletContext();
		
		application.setAttribute("fruit1", "사과");
		
		return "test1";
	}

	@GetMapping("/result1")
	public String result1(HttpServletRequest request) {	
		// application : ServletContext
		ServletContext application = request.getServletContext();
		String fruit1 = (String)application.getAttribute("fruit1");
		System.out.printf("fruit1 : %s%n", fruit1);	
				
		return "result1";
	}
	
}
