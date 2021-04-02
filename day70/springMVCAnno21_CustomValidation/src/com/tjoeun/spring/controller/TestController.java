package com.tjoeun.spring.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;

import com.tjoeun.spring.bean.DataDTO1;
import com.tjoeun.spring.validator.DataDTO1Validator;

@Controller
public class TestController {
	
	@GetMapping("/input_data")
	public String inputData(DataDTO1 dto1) {

		return "input_data";
	}
	
	@PostMapping("input_Proc")
	public String inputProc(@Valid DataDTO1 dto1, BindingResult result) {
		
		if(result.hasErrors()) {
			return "input_data";
		}
		return "input_result";
	}
	
	//Validator 등록하기
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		DataDTO1Validator validator1 = new DataDTO1Validator();
		
		binder.setValidator(validator1);
	}
}
 