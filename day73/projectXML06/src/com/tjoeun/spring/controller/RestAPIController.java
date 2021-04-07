package com.tjoeun.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tjoeun.spring.service.UserService;

@RestController
public class RestAPIController {
  
	@Autowired
	private UserService userService;
	
	// @PathVariable : URL의 일부를 parameter 로 전달할 수 있음
	@GetMapping("/user/checkID/{user_id}")
	public String checkID(@PathVariable String user_id) {
		boolean chck = userService.checkID(user_id);
		return chck+"";
		
	}
	
	
}




