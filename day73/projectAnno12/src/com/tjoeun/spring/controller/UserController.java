package com.tjoeun.spring.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
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

	@GetMapping("/login")
	public String login(@ModelAttribute("tmpLoginUserDTO") UserDTO loginUserDTO) {
		return "user/login";
	}
	
	@PostMapping("/login_proc")
	public String loginProc
	(@Valid @ModelAttribute("tmpLoginUserDTO") UserDTO loginUserDTO,
	 BindingResult result) {
		if(result.hasErrors()) {
			return "user/login";
		}
		
		return "user/login_success";
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
  	userService.addUserInfo(joinUserDTO);
  	
  	return "user/join_success";
  }
 
  @InitBinder
  public void initBinder(WebDataBinder binder) {
  	UserValidator validator1 = new UserValidator();
  	binder.addValidators(validator1);
  }
}








