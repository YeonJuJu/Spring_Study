package com.tjoeun.spring.bean;

public class TestBean1 {
	
	public TestBean1() {
		System.out.println("TestBean1의 기본 생성자");
	}
	
	public void init() {
		System.out.println("TestBean1의 init() method");
	}
	
	public void destroy() {
		System.out.println("TestBean1의 destroy() method");
	}
}
