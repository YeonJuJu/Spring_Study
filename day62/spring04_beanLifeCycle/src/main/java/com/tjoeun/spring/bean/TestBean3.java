package com.tjoeun.spring.bean;

public class TestBean3 {
	public TestBean3() {
		System.out.println("TestBean3 생성자 호출 - TestBean3 객체가 생성됨");
	}
	public void default_init() {
		System.out.println("TestBean3의 default_method() 호출");
	}
	public void default_destroy() {
		System.out.println("TestBean3의 default_method() 호출");
	}
	public void bean3Init() {
		System.out.println("TestBean3의 bean3Init() 호출");
	}
	public void bean3Destroy() {
		System.out.println("TestBean3의 bean3Destroy() 호출");
	}
}
