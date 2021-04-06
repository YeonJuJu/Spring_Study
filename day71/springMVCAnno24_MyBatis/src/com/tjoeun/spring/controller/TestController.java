package com.tjoeun.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tjoeun.spring.bean.DataDTO1;
import com.tjoeun.spring.mapper.MapperInterface;

@Controller
public class TestController {

	@Autowired 
	private MapperInterface mapper1;
	
	@GetMapping("/input_data")
	public String inputData() {
		return "input_data";
	}
	
	@PostMapping("/input_proc")
	                      //@ModelAttribute DataDTO1 dto1
	public String inputProc(DataDTO1 dto1) {
		mapper1.insertData(dto1);
		return "input_proc";
	}
	
	@GetMapping("/read_data")
	public String readData(Model model) {
		
		List<DataDTO1> list = mapper1.selectdata();
		model.addAttribute("list", list);
		
		return "read_data";
	}
}
 