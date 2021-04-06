package com.tjoeun.spring.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tjoeun.spring.dto.UserDTO;
import com.tjoeun.spring.validator.UserValidator;

@Controller
@RequestMapping("/user")
public class UserController {

	@GetMapping("/login")
	public String login() {
		return "user/login";
	}
	
	@GetMapping("/join")
	public String join
	(@ModelAttribute("joinUserDTO") UserDTO joinUserDTO) {
		
		return "user/join";
	}
	
	@GetMapping("/modify")
	public String modify() {
		return "user/modify";
	}
	
	@GetMapping("/logout")
	public String logout() {
		return "user/logout";
	}
	
  @PostMapping("/join_proc")
  public String joinProc
  (@Valid @ModelAttribute("joinUserDTO") UserDTO joinUserDTO, 
   BindingResult result) {
  	if(result.hasErrors()) {
  		return "user/join";
  	}
  	return "user/join_proc";
  }
  
  // @InitBinder
  // @Valid 로 유효성 검사를 하는 객체(Bean)를
  // 주입하기 전에 수행할 내용을 지정함
  // Controller 로 들어오는 
  // 모든 요청 전에 @InitBinder로 선언한 메소드가 실행됨
  @InitBinder
  public void initBinder(WebDataBinder binder) {
  	UserValidator validator1 = new UserValidator();
  	binder.addValidators(validator1);
  }
}








