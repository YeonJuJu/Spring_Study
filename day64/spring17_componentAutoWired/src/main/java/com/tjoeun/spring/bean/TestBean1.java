package com.tjoeun.spring.bean;

public class TestBean1 {
	
	public int method1() {
		System.out.println("TestBean1 method()");
		
		//다음 문장은 예외 발생
		int number = 111/0;
		
		System.out.println(number);
		
		return 111;
	}
}








