package com.tjoeun.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {
	@GetMapping("/test1")
	public String test1_get(HttpServletRequest request) {
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		String num3[] = request.getParameterValues("num3");
		
		return "result";
	}
	
	@PostMapping("/test2")
	public String test2(HttpServletRequest request) {
		String name=request.getParameter("name");
		String id=request.getParameter("id");
		String[] hobbies=request.getParameterValues("hobby");
		
		return "result";
	}
	
	@GetMapping("/test3")
	public String test3(HttpServletRequest request) {
		
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		String[] num3 = request.getParameterValues("num3");

		return "result";	
	}
	
	@GetMapping("/test4/{num1}/{num2}/{num3}")
	public String test4(@PathVariable String num1, @PathVariable String num2, @PathVariable String num3) {
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		
		return "result";
	}
	
	@GetMapping("/test5/{num1}/{num2}/{num3}")
	public String test5(@PathVariable int num1, @PathVariable int num2, @PathVariable int num3) {
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		
		System.out.println("num1 + num2 + num3 = " + (num1+num2+num3));
		
		return "result";
	}
	
	@GetMapping("/test6")
	public String test6(@RequestParam int num1, @RequestParam int num2, @RequestParam int[] num3) {
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		for(int var : num3) {
			System.out.println("num3 : " + var);
		}
		return "result";
	}
	
	@GetMapping("/test7")
	public String test7(@RequestParam(value="num1") int n1, @RequestParam(value="num2") int n2, @RequestParam(value="num3") int[] n3) {
		System.out.println("num1 : " + n1);
		System.out.println("num2 : " + n2);
		
		for(int var : n3) {
			System.out.println("num3 : " + var);
		}
		return "result";
	}
	
	@GetMapping("/test8")
	public String test8(@RequestParam int num1, @RequestParam(required = false) String str2, @RequestParam(defaultValue = "0") int num3) {
		System.out.println("num1 : " + num1);
		System.out.println("str2 : " + str2);
		System.out.println("number : " + num3);
		
		return "result";
	}
	
	
}
