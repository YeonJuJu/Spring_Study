package com.tjoeun.spring.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@PropertySource("/WEB-INF/properties/data1.properties")
//@PropertySource("/WEB-INF/properties/data2.properties")
//@PropertySource(
//		value= {"/WEB-INF/properties/data1.properties", 
//		        "/WEB-INF/properties/data2.properties"})
@PropertySources(
		{@PropertySource("/WEB-INF/properties/data1.properties"),
		 @PropertySource("/WEB-INF/properties/data2.properties")
		}
)
public class TestController {
	
	@Value("${tjoeun1.t1}")
	private int t1;
	
	@Value("${tjoeun1.t2}")
	private String t2;
	
	@Value("${tjoeun2.t3}")
	private int t3;
	
	@Value("${tjoeun2.t4}")
	private String t4;
	
	@Value("${tjoeun3.t5}")
	private int t5;
	
	@Value("${tjoeun3.t6}")
	private String t6;
	
	@Value("${tjoeun4.t7}")
	private int t7;
	
	@Value("${tjoeun4.t8}")
	private String t8;
	
	@GetMapping("/test1")
	public String test1() {
		
		System.out.println("tjoeun1.t1 : " + t1);
		System.out.println("tjoeun1.t2 : " + t2);
		System.out.println("tjoeun2.t3 : " + t3);
		System.out.println("tjoeun2.t4 : " + t4);
		
		System.out.println("tjoeun3.t5 : " + t5);
		System.out.println("tjoeun3.t6 : " + t6);
		System.out.println("tjoeun4.t7 : " + t7);
		System.out.println("tjoeun4.t8 : " + t8);
		
		return "test1";
	}
	
	
}
