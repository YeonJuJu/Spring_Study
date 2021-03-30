package com.tjoeun.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@Controller, @Servie, @Repository,
//@Component, @RestController, @~~Advice
//ㄴ servlet-context.xml 에 
//   component-scan에 지정한 package를 scan해서
//   위의 Annotation 이 붙어있는 클래스를 찾아서
//   Bean 객체를 생성해 줌
@Controller
public class HomeController {

	@RequestMapping(value="/", method = RequestMethod.GET)
	public String home() {
		// /WEB-INF/views/"index".jps
		//  /WEB-INF/views/index.jps
		return "index";
	}
	
	
}
