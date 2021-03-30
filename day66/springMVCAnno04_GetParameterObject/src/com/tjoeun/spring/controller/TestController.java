package com.tjoeun.spring.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.tjoeun.spring.beans.DataDTO;
import com.tjoeun.spring.beans.DataDTO2;

@Controller
public class TestController {
  
	@GetMapping("/test1")
	public String test1
	  (@RequestParam Map<String, String> map,
	   @RequestParam List<String> data3) {
		
		String data1  = map.get("data1");
		String data2  = map.get("data2");
		String data3_1 = map.get("data3");
		
		System.out.printf("data1 : %s%n", data1);
		System.out.printf("data2 : %s%n", data2);
		System.out.printf("data3_1 : %s%n", data3_1);
		
		for(String str : data3) {
			System.out.printf("data3 : %s%n", str);
		}
		System.out.println();
		
		return "result";
	}
	@GetMapping("/test2")
	public String test2
	(@ModelAttribute DataDTO bean1,
	 @ModelAttribute DataDTO2 bean2	) {
		
		System.out.printf("bean1.data1 : %d%n", bean1.getData1());
		System.out.printf("bean1.data2 : %d%n", bean1.getData2());
		
		for(int num : bean1.getData3()) {
			System.out.printf("%d ", num);
		}
		System.out.println();
		
		System.out.printf("bean2.data1 : %d%n", bean2.getData1());
		System.out.printf("bean2.data2 : %d%n", bean2.getData2());
		
		for(int num : bean2.getData3()) {
			System.out.printf("%d ", num);
		}
		System.out.println();
		
		return "result";
	}
	
}








