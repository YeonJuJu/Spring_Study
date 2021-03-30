package com.tjoeun.spring.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tjoeun.spring.bean.DataDTO;
import com.tjoeun.spring.bean.DataDTO2;
import com.tjoeun.spring.bean.InfoDTO;

@Controller
public class TestController {
	
	@GetMapping("/test1")
	public String test1(InfoDTO dto) {
		dto.setName("김남준");
		dto.setId("bts04");
		dto.setPw("0912");
		dto.setContent("안녕하세염");
		return "test1";
	}

	@GetMapping("/test2")
	public String test2(DataDTO dto) {
		dto.setStr1("민윤기");
	
		return "test2";
	}
	
	@GetMapping("/test3")
	public String test3(DataDTO dto, Model model) {
		dto.setStr1("민윤기");
		dto.setStr2("민윤기");
		
		String[] list_str = {"김석진", "민윤기", "정호석"};
		
		model.addAttribute("list_str", list_str);

		return "test3";
	}
	
	@GetMapping("/test4")
	public String test4(DataDTO dto, Model model) {
		
		dto.setStr3("김남준");
		
		ArrayList<String> list_str = new ArrayList<>();
		list_str.add("전정국");
		list_str.add("김태형");
		list_str.add("박지민");
		list_str.add("김남준");
		model.addAttribute("list_str", list_str);
		
		return "test4";
	}
	
	@GetMapping("/test5")
	public String test5(DataDTO dto, Model model) {
		
		dto.setStr1("str1");
		dto.setStr2("str2");
		dto.setStr3("str3");
		dto.setStr4("이름3");
		
		DataDTO2 dto2_1 = new DataDTO2();
		DataDTO2 dto2_2 = new DataDTO2();
		DataDTO2 dto2_3 = new DataDTO2();
		
		dto2_1.setKey("이름1");
		dto2_1.setValue("김석진");
		
		dto2_2.setKey("이름2");
		dto2_2.setValue("민윤기");
		
		dto2_3.setKey("이름3");
		dto2_3.setValue("정호석");
		
		ArrayList<DataDTO2> list_data = new ArrayList<>();
		
		list_data.add(dto2_1);
		list_data.add(dto2_2);
		list_data.add(dto2_3);
		
		model.addAttribute("list_data", list_data);
		
		return "test5";
	}
	
	@GetMapping("/test6")
	public String test6(DataDTO dto, Model model) {
		
		String[] list_check= {"전정국", "김태형"};
		dto.setStr5(list_check);
		
		return "test6";
	}
	
	@GetMapping("/test7")
	public String test7(DataDTO dto, Model model) {
		
		String[] list_check= {"김남준", "민윤기"};
		dto.setStr6(list_check);
		
		String[] list_data = {"김남준", "김석진", "민윤기"};

		model.addAttribute("list_data", list_data);
		
		return "test7";
	}
	
	@GetMapping("/test8")
	public String test8(DataDTO dto, Model model) {

		
		return "test8";
	}
}
