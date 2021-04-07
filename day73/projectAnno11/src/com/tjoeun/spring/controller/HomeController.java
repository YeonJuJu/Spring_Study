package com.tjoeun.spring.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tjoeun.spring.dto.UserDTO;

@Controller
public class HomeController {
  
	@Resource(name="loginUserDTO")
	private UserDTO userDTO;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home() {
		System.out.println(userDTO);
		return "redirect:/main";
	}
}







