package com.tjoeun.spring.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	//Message Source 주입받기
	@Autowired
	ReloadableResourceBundleMessageSource res;
	
	@GetMapping("test1")
	public String test1(Model model, Locale locale) {
		
		System.out.println("locale : " + locale);
		
		String str1 = res.getMessage("tjoeun1.t1", null, null);
		String str2 = res.getMessage("tjoeun2.t2", null, null);
		
		//{} 부분에 사용할 값을 배열로 준비
		Object[] argument = {25, "Jungkook"};
		String str1_2 = res.getMessage("tjoeun1.t2", argument, null);
		
		String str3 = res.getMessage("tjoeun3.t3", argument, locale);
		
		System.out.println("tjoeun1.t1 : " + str1);
		System.out.println("tjoeun2.t2 : " + str2);
		System.out.println("tjoeun1.t2 : " + str1_2);
		System.out.println("tjoeun3.t3 : " + str3);
		
		model.addAttribute("arrObj", argument);
		
		return "test1";
	}
	
}
