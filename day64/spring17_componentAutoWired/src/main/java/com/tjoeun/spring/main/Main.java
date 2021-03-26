package com.tjoeun.spring.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tjoeun.spring.bean.TestBean1;
import com.tjoeun.spring.config.ConfigBean;

public class Main {
  public static void main(String[] args) {
  	
	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/tjoeun/spring/config/beans.xml");
	  
	System.out.println("\n========================================================\n");  
	
	TestBean1 xml1 = ctx.getBean("xml1", TestBean1.class);
	System.out.println("xml1 : " + xml1);
	
	int result = xml1.method1();
	System.out.println("result : " + result);
	
	/*	-> 수행 결과
	beforeMethod() !!!
	aroundMethod() !!!
	TestBean1 method()
	aroundMethod() !!!
	afterMethod() !!!
	*/
	
	System.out.println();	
  	System.out.println("\n========================================================\n");
  	ctx.close();
  	
	// java 파일을 사용한 설정 방식 : Annotation
  	AnnotationConfigApplicationContext atx = new AnnotationConfigApplicationContext(ConfigBean.class);
  	
  	System.out.println();
  	
  	
  	
  	System.out.println("\n========================================================\n");
  	
  	
  	
  	atx.close();
    
  }
  
}


  
  
