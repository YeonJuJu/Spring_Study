package com.tjoeun.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.tjoeun.spring.bean.DataDTO;


@Controller
public class TestController {
	
	@GetMapping("/test1")
	public String test1(HttpServletRequest request) {
		
		request.setAttribute("str1", "string1");
		request.setAttribute("str2", "string2");
		
		return "forward:/result1";
	}

	@GetMapping("/result1")
	public String result1(HttpServletRequest request) {
		
//		String str1 = (String) request.getAttribute("str1");
//		String str2 = (String) request.getAttribute("str2");
		
//		System.out.println("str1 : " + str1);
//		System.out.println("str2 : " + str2);
		
		return "result1";
	}
	
	@GetMapping("/test2")
	public String test2(Model model) {
		// Model객체에 저장되지 않고 Request 객체에 저장됨
		model.addAttribute("name2", "유관순");
		
		return "forward:/result2";
	}
	
	@GetMapping("/result2")
	public String result2(Model model) {
		
		// 다음은 널이 출력
//		String name2 = (String) model.getAttribute("name2");
//		System.out.println("name2 : " + name2);

		return "result2";
	}
	
	@GetMapping("/test3")
	public ModelAndView test3(ModelAndView mv) {
		mv.addObject("name3", "양만춘");
		mv.setViewName("forward:/result3");
		
		return mv;
	}
	
	@GetMapping("/result3")
	public String result3(HttpServletRequest request) {
		
		String name3 =(String) request.getAttribute("name3");
		
		System.out.println("name3 : " + name3);
		
		return "result3";
	}
	
	@GetMapping("/test4")
	public String test4(Model model) {
		
		DataDTO dto = new DataDTO();
		
		dto.setName("James");
		dto.setAlias("pizza");
		
		model.addAttribute("dto", dto);
		
		return "forward:/result4";
	}
	
	@GetMapping("/result4")
	public String result4(HttpServletRequest request) {
		
		DataDTO dto = (DataDTO) request.getAttribute("dto");
		System.out.println("dto.name : " + dto.getName());
		System.out.println("dto.alias : " + dto.getAlias());
		
		return "result4";
	}
	
	@GetMapping("/test5")
	public String test5(@ModelAttribute("person") DataDTO dto) {
		
		dto.setName("유관순");
		dto.setAlias("3.1절");

		return "result5";
	}
	
	@GetMapping("/test6")
	public String test6(@ModelAttribute("person2") DataDTO dto) {
		
		dto.setName("신사임당");
		dto.setAlias("율곡어머니");

		return "forward:/result6";
	}
	
	@GetMapping("/result6")
	public String result6(HttpServletRequest request) {
		
		DataDTO dto = (DataDTO) request.getAttribute("person2");
		
		System.out.println("dto.name : " + dto.getName());
		System.out.println("dto.alias : " + dto.getAlias());
		
		return "result6";
	}
}
