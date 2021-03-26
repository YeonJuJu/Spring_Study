package com.tjoeun.spring.bean;



public class TestBean1 {
	
	public TestBean1() {
		System.out.println("TestBean1 기본 생성자");
	}
	
	public void init1() {
		System.out.println("TestBean1 init() 호출");
	}
	
	public void destroy1() {
		System.out.println("TestBean1 destroy() 호출");
	}
}
