package com.tjoeun.spring.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tjoeun.spring.bean.DataDTO1;
import com.tjoeun.spring.bean.DataDTO2;

@Controller
public class TestController {
	
	@GetMapping("input_data")
	public String inputData(DataDTO1 dto1) {
		return "input_data";
	}
	
	@PostMapping("inputProc") // @ModelAttribute 생략됨 (기본값)
	public String inputData(@Valid DataDTO1 dto1, BindingResult result) {
		
		System.out.println("dto1.data1 : " + dto1.getData1());
		System.out.println("dto1.data2 : " + dto1.getData2());

		System.out.println("BindingResult : " + result);

		if(result.hasErrors()) {//유효성 검사 결과에 오류가 있다면
			for(ObjectError obj : result.getAllErrors()) {
				System.out.println("Error Message : " + obj.getDefaultMessage());
				System.out.println("Code : " + obj.getCode());
				System.out.println("Object Name : " + obj.getObjectName());

				String[] codes = obj.getCodes();
				for(String code1 : codes) {
					System.out.println(code1);
				}
				
				if(codes[0].equals("Size.dataDTO1.data1"))
					System.out.println("data1의 길이는 2~10 이어야 합니다.");
				else if(codes[0].equals("Max.dataDTO1.data2"))
					System.out.println("data2의 100이하의 값이어야 합니다.");
			}
			
			return "input_data";
		}
		
		
		return "input_result";
	}
	
	@GetMapping("input_data2")
	public String inputData2(){
		
		return "input_data2";
	}
	
	@PostMapping("input2Proc")
	public String input2Proc(@Valid DataDTO2 dto2, BindingResult result){
		
		if(result.hasErrors()) {
			
			return "input_data2";
		}
		
		return "input_result2";
	}
	
	@GetMapping("input_data3")
	public String inputData3(DataDTO2 dto2){
		
		return "input_data3";
	}
	
	@PostMapping("input3Proc")
	public String input3Proc(@Valid DataDTO2 dto2, BindingResult result){
		
		if(result.hasErrors()) {
			
			return "input_data3";
		}
		
		return "input_result3";
	}
}
