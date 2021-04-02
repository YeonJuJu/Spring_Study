package com.tjoeun.spring.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tjoeun.spring.bean.DataDTO1;

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
}
