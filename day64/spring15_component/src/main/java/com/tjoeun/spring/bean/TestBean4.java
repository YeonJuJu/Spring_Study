package com.tjoeun.spring.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") // 기본적으로 @Lazy
public class TestBean4 {
	public TestBean4() {
		System.out.println("TestBean4의 기본 생성자");
	}
	
}
