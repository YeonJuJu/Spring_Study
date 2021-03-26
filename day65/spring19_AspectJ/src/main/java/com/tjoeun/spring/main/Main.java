package com.tjoeun.spring.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tjoeun.spring.bean.TestBean1;
import com.tjoeun.spring.config.ConfigBean;

public class Main {
  public static void main(String[] args) {
  	
  	// xml을 사용한 설정 방식
  	ClassPathXmlApplicationContext ctx1
  	  = new ClassPathXmlApplicationContext("com/tjoeun/spring/config/beans.xml");
  	
  	TestBean1 xml1 = ctx1.getBean(TestBean1.class);
  	System.out.printf("xml1 : %s%n", xml1);
  	try {
			xml1.method1();
		} catch (Exception e) {
			e.printStackTrace();
		}
  	
  	ctx1.close();
  	
  	System.out.println("================================================");
  	
  	
  	// Annotation 방식
  	AnnotationConfigApplicationContext ctx2
  	  = new AnnotationConfigApplicationContext(ConfigBean.class);
  	
  	TestBean1 anno1 = ctx2.getBean(TestBean1.class);
  	System.out.printf("anno1 : %s%n", anno1);
  	
  	try {
			anno1.method1();
		} catch (Exception e) {
			e.printStackTrace();
		}
  	
  	ctx2.close();
  }
  
}


  
  
