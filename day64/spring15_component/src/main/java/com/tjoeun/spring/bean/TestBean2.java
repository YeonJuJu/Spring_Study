package com.tjoeun.spring.bean;

import org.springframework.stereotype.Component;

//IoC 컨테이너의 객체가 생성 될 때
//(AnnotationConfigApplicationContext)
//TestBean1 의 객체를 생성함
//설정된 이름으로("test2") Bean객체를 가져옴 (in main())
//Singleton Design Pattern 으로 생성됨
@Component("test2")
public class TestBean2 {
	
	public TestBean2(){
		System.out.println("TestBean2의 기본 생성자");
	}
	
}
