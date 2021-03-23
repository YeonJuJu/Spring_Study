package com.tjoeun.spring.bean;

public class TestBean2 {
	public TestBean2() {
		System.out.println("TestBean2 생성자 호출 - TestBean2 객체가 생성됨");
	}
	public void default_init() {
		System.out.println("TestBean2의 default_method() 호출");
	}
	public void default_destroy() {
		System.out.println("TestBean2의 default_method() 호출");
	}
}
