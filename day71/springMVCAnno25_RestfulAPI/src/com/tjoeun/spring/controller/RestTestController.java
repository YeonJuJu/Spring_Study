package com.tjoeun.spring.controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tjoeun.spring.bean.DataDTO1;

@RestController
public class RestTestController {
	@GetMapping("/test2")
	public ResponseEntity<ArrayList<DataDTO1>> test2() {
		
		DataDTO1 dto1 = new DataDTO1("이순신", 48, 192.35, true);
		DataDTO1 dto2 = new DataDTO1("유관순", 19, 162.35, false);
		DataDTO1 dto3 = new DataDTO1("김상옥", 33, 182.56, true);
		DataDTO1 dto4 = new DataDTO1("안중근", 30, 190.12, true);
		
		ArrayList<DataDTO1> list = new ArrayList<>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		list.add(dto4);
		
		//응답결과로 JSON data로 반환하기 위해 객체로 만들어줌
		//list 주소지에 있는 data 구조를 파악해서 JSON data로 변환하기 위해 generic을 <ArrayList<DataDTO1>>로 지정
		//list => JSON data를 구성하는 객체
		//HttpStatus.OK - 응답 결과가 정상적이라는 것을 browser에게 알려줌
		ResponseEntity<ArrayList<DataDTO1>> entry = new ResponseEntity<ArrayList<DataDTO1>>(list, HttpStatus.OK);
		
		//RestController는 test2 페이지를 찾아가는게 아니라 데이터를 전달하는 것이기 때문에 test2.jsp 페이지가 없어도 오류가 나지 않는다. 
		//return "test2";
		return entry;
	}
}
