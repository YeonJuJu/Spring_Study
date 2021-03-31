package com.tjoeun.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.tjoeun.spring.bean.DataDTO1;
import com.tjoeun.spring.bean.DataDTO2;

@Controller
//다음을 지정하지 않으면 기본은 request
//다음과 같이 설정하면 아래에 test6에 @ModelAttribute("sessionDTO1") 이렇게 저장되는
//객체는 request영역이 아닌 @Session 영역에 저장됨
@SessionAttributes({"sessionDTO1", "sessionDTO2"})
public class TestController {
	
	//Session 영역에 저장되도록 실제로 설정하는 부분으로 이 부분이 생략되어있으면 오류 발생
	@ModelAttribute("sessionDTO1")
	public DataDTO1 sessionDTO1() {
		return new DataDTO1();
	}
	//->새로운 요청이 발생하게 되면 sessionDTO1 이라는 이름으로 동록된 메소드가 자동으로 호출되고 
	//  sessionDTO1()메소드가 return 해주는 객체의 주소를 sessionDTO1이라는 이름으로 session 영역에 저장함
	@ModelAttribute("sessionDTO2")
	public DataDTO1 sessionDTO2() {
		return new DataDTO1();
	}
	
	@GetMapping("/test1")
//	public String test1(HttpServletRequest request) {0
	public String test1(HttpSession session) {
		//HttpSession session = request.getSession();
		session.setAttribute("name1", "이순신 (Session 영역에 저장)");
		
		return "test1";
	}
	
	@GetMapping("/test2")
	public String test2(HttpSession session) {
		
		session.setAttribute("name1", "유관순 (Session 영역에 저장)");
		
		return "redirect:/result1";
	}
	
	@GetMapping("/test3")
	public String test3(HttpSession session) {
		
		session.setAttribute("name1", "윤봉길 (Session 영역에 저장)");
		
		return "forward:/result1";
	}
	
	@GetMapping("/result1")
//	public String result1(HttpServletRequest request) {
	public String result1(HttpSession session) {
		//HttpSession session = request.getSession();
		
		String name1 = (String) session.getAttribute("name1");
		System.out.println("name1 : " + name1);
		
		return "result1";
	}
	
	@GetMapping("/test4")
	public String test4(HttpSession session) {
		
		DataDTO1 dto1 = new DataDTO1();
		dto1.setName("정약용");
		dto1.setAlias("다산");
		
		session.setAttribute("dto1", dto1);
		
		return "test4";
	}
	
	@GetMapping("/result4")
	public String result4(HttpSession session) {
		
		DataDTO1 dataDTO1 = (DataDTO1) session.getAttribute("dto1");
		System.out.println("dataDTO1.name : " + dataDTO1.getName());
		System.out.println("dataDTO1.alias : " + dataDTO1.getAlias());
		
		return "result4";
	}
	
	@GetMapping("/result5")
	public String result5(@SessionAttribute("dto1") DataDTO1 dto1) {
		
		//DataDTO1 dto = (DataDTO1) session.getAttribute("dto1");
		
		System.out.println("dto1.name : " + dto1.getName());
		System.out.println("dto1.alias : " + dto1.getAlias());
		
		return "result5";
	}
	
	
	// @ModelAttribute : request영역에 sessionDTO1이라는 이름으로 저장됨
	@GetMapping("/test6")
	public String test6(@ModelAttribute("sessionDTO1") DataDTO1 sessionDTO1, @ModelAttribute("sessionDTO2") DataDTO1 sessionDTO2) {
		
		sessionDTO1.setName("이순신");
		sessionDTO1.setAlias("거북선");
	
		sessionDTO2.setName("jimin");;
		sessionDTO2.setAlias("bird");
		//이미 session 영역에 보관되어 있는 데이터(객체)이므로 데이터만 담아주면 됨
		
		return "test6";
	}
	
	@GetMapping("/result6")
	public String result6(@ModelAttribute("sessionDTO1") DataDTO1 sessionDTO1, @ModelAttribute("sessionDTO2") DataDTO1 sessionDTO2) {
		
		System.out.println("sessionDTO1.name : " + sessionDTO1.getName());
		System.out.println("sessionDTO1.alias : " + sessionDTO1.getAlias());
		System.out.println("sessionDTO2.name : " + sessionDTO2.getName());
		System.out.println("sessionDTO2.alias : " + sessionDTO2.getAlias());
		
		return "result6";
	}
}
