package com.tjoeun.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
  /*
	@Resource(name="loginUserDTO")
	private UserDTO userDTO;
	*/
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home(HttpServletRequest request) {
		// System.out.println(userDTO);
		// 업로드 폴더 실제 경로
	  System.out.println(request.getServletContext().getRealPath("/"));
		return "redirect:/main";
	}
	
	
}






