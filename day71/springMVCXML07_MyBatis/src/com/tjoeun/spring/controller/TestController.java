package com.tjoeun.spring.controller;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tjoeun.spring.bean.DataDTO1;

@Controller
public class TestController {

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	@GetMapping("/input_data")
	public String inputData() {
		return "input_data";
	}
	
	@PostMapping("input_proc")
	public String inputProc(DataDTO1 dto) {
		
		sqlSessionTemplate.insert("test_database.insert_data", dto);
		
		return "read_data";
	}
	
	@GetMapping("/read_data")
	public String readData(Model model) {
		
		List<DataDTO1> list = sqlSessionTemplate.selectList("test_database.select_data");
		
		model.addAttribute("list", list);
		
		return "read_data";
	}
}
