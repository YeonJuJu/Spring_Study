package com.tjoeun.spring.bean;

import org.springframework.stereotype.Component;


// IoC 컨테이너의 객체가 생성 될 때
// (AnnotationConfigApplicationContext)
// TestBean1 의 객체를 생성함
// TestBean1 의 타입으로 Bean객체를 가져옴 (in main())
//  Singleton Design Pattern 으로 생성됨
@Component
public class TestBean1 {
  public TestBean1() {
  	System.out.println("TestBean1 의 기본 생성자");
  }
}














