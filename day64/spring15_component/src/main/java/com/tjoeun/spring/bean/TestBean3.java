package com.tjoeun.spring.bean;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TestBean3 {
	
	public TestBean3(){
		System.out.println("TestBean3의 기본 생성자");
	}
	
}
