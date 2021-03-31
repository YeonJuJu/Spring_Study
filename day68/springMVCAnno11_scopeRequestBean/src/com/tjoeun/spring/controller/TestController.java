package com.tjoeun.spring.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tjoeun.spring.bean.DataDTO1;
import com.tjoeun.spring.bean.DataDTO2;
import com.tjoeun.spring.bean.DataDTO3;
import com.tjoeun.spring.bean.DataDTO4;

@Controller
public class TestController {
	
	@Autowired
	DataDTO1 requestDto1;
	
	//RootAppContext파일에서 이름을 정해줬기 때문에 @Resource에 설정을 다음과 같이 해야함
	@Resource(name = "requestDto2")
	DataDTO2 requestDto2;
	
	@Autowired
	DataDTO3 requestDto3;
	@Resource(name = "requestDTO4")
	DataDTO4 requestDto4;
	
	@GetMapping("/test1")
	public String test1(Model model) {
		
		requestDto1.setName("이순신");
		requestDto1.setAlias("거북선");
		
		requestDto2.setAddr("Seoul");
		requestDto2.setPhone("02");
		
		requestDto3.setJob("개발자");
		requestDto3.setHobby("운동");
		
		requestDto4.setPsn("000000");
		requestDto4.setDl("555555");
		
		model.addAttribute("requestDto1", requestDto1);
		model.addAttribute("requestDto2", requestDto2);
		model.addAttribute("requestDto3", requestDto3);
		model.addAttribute("requestDto4", requestDto4);
		
		return "forward:/result1";
	}

	@GetMapping("/result1")
	public String result1() {
		
		String name = requestDto1.getName();
		String alias = requestDto1.getAlias();
		
		String addr = requestDto2.getAddr();
		String phone = requestDto2.getPhone();
		
		String job = requestDto3.getJob();
		String hobby = requestDto3.getHobby();
		
		String psn = requestDto4.getPsn();
		String dl = requestDto4.getDl();
		
		System.out.println("name : " + name);
		System.out.println("alias : " + alias);
		
		System.out.println("addr : " + addr);
		System.out.println("phone : " + phone);
		
		System.out.println("job : " + job);
		System.out.println("hobby : " + hobby);
		
		System.out.println("psn : " + psn);
		System.out.println("dl : " + dl);
		
		return "result1";
	}
}
