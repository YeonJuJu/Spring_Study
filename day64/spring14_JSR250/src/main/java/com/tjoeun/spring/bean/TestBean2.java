package com.tjoeun.spring.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TestBean2 {
	
	public TestBean2() {
		System.out.println("TestBean2 기본 생성자");
	}
	
	@PostConstruct
	public void init2() {
		System.out.println("TestBean2 init() - @PostConstruct 호출");
	}
	
	@PreDestroy
	public void destroy2() {
		System.out.println("TestBean2 destroy() - @PreDestroy 호출");
	}
}
