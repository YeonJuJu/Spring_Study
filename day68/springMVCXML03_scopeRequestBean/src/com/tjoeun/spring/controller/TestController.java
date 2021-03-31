package com.tjoeun.spring.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tjoeun.spring.bean.DataDTO1;
import com.tjoeun.spring.bean.DataDTO2;
import com.tjoeun.spring.bean.DataDTO3;
import com.tjoeun.spring.bean.DataDTO4;

@Controller
public class TestController {
	
//	@Bean을 정의할 때, Scope를 request로 설정하면 Xml 방식에서는 요청이 들어오지 않았어도 자동 주입을 하려고 시도하기에 오류가 발생 
//	따라서 @Lazy annotation을 설정하면 요청이 들어올 때에 자동주입을 시도하므로 오류가 발생하지 않는다.	
	@Autowired
	@Lazy
	DataDTO1 requestDto1;
	
	@Resource(name="requestDTO2")
	@Lazy
	DataDTO2 requestDTO2;
	
	@Autowired
	@Lazy
	DataDTO3 requestDto3;
	
	@Resource(name="requestDTO4")
	@Lazy
	DataDTO4 requestDTO4;
	
	@GetMapping("/test1")
	public String test1() {
		
		requestDto1.setName("이순신");
		requestDto1.setAlias("거북선");
		
		requestDTO2.setAddr("Seoul");
		requestDTO2.setPhone("02");
		
		requestDto3.setJob("개발자");
		requestDto3.setHobby("운동");
		
		requestDTO4.setPsn("000000");
		requestDTO4.setDl("555555");
		
		
		
		return "forward:/result1";
	}

	@GetMapping("result1")
	public String result1(Model model) {
		
		String name = requestDto1.getName();
		String alias = requestDto1.getAlias();
		
		String addr = requestDTO2.getAddr();
		String phone = requestDTO2.getPhone();
		
		String job = requestDto3.getJob();
		String hobby = requestDto3.getHobby();
		
		String psn = requestDTO4.getPsn();
		String dl = requestDTO4.getDl();
		
		System.out.println("name : " + name);
		System.out.println("alias : " + alias);
		
		System.out.println("addr : " + addr);
		System.out.println("phone : " + phone);
		
		System.out.println("job : " + job);
		System.out.println("hobby : " + hobby);
		
		System.out.println("psn : " + psn);
		System.out.println("dl : " + dl);
		
		model.addAttribute("requestDto1", requestDto1);
		model.addAttribute("requestDto2", requestDTO2);
		model.addAttribute("requestDto3", requestDto3);
		model.addAttribute("requestDto4", requestDTO4);
		
		return "result1";
	}
}
