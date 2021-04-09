package com.tjoeun.spring.controller;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tjoeun.spring.dto.UserDTO;
import com.tjoeun.spring.service.UserService;
import com.tjoeun.spring.validator.UserValidator;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Resource(name = "loginUserDTO")
	@Lazy
	private UserDTO loginUserDTO;

	@GetMapping("/login")
	public String login
	(@ModelAttribute("tmpLoginUserDTO") UserDTO loginUserDTO) {
		return "user/login";
	}
	
	@PostMapping("/login_proc")
	public String login_pro(@Valid @ModelAttribute("tmpLoginUserDTO") UserDTO tmpLoginUserDTO, BindingResult result) {
		
		if(result.hasErrors()) {
			return "user/login";
		}
		
		userService.getLoginUserDTO(tmpLoginUserDTO);
		
		if(loginUserDTO.isUserLogin() == true) {
			return "user/login_success";
		} else {
			return "user/login_fail";
		}
	}
	
	@GetMapping("/logout")
	public String logout() {
		return "user/logout";
	}
	
	@GetMapping("/join")
	public String join
	(@ModelAttribute("joinUserDTO") UserDTO joinUserDTO) {
		
		return "user/join";
	}
	
  @PostMapping("/join_proc")
  public String joinProc
  (@Valid @ModelAttribute("joinUserDTO") UserDTO joinUserDTO, 
   BindingResult result) {
  	if(result.hasErrors()) {
  		return "user/join";
  	}
  	userService.addUserInfo(joinUserDTO);
  	
  	return "user/join_success";
  }

  
	@GetMapping("/modify")
	public String modify(@ModelAttribute("modifyUserDTO") UserDTO modifyUserDTO) {
		
		
		return "user/modify";
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








