package com.tjoeun.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class TestBean1 {
  public void method1() throws Exception{
  	System.out.println("TestBean1의 method1()");
  	
    int number = 110/ 0;
		
		System.out.println("예외 발생 없는 경우 실행되는 부분");
	  System.out.printf("number : %d%n", number);
  }
}








