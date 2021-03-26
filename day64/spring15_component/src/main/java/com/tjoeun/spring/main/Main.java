package com.tjoeun.spring.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tjoeun.spring.bean.TestBean1;
import com.tjoeun.spring.bean.TestBean2;
import com.tjoeun.spring.bean.TestBean3;
import com.tjoeun.spring.bean.TestBean4;
import com.tjoeun.spring.bean2.TestBean5;
import com.tjoeun.spring.config.ConfigBean;

public class Main {
  public static void main(String[] args) {
  	// java 파일을 사용한 설정 방식 : Annotation
  	AnnotationConfigApplicationContext ctx 
  	  = new AnnotationConfigApplicationContext(ConfigBean.class);
  	
  	TestBean1 test1_1 = ctx.getBean(TestBean1.class);
  	System.out.printf("test1_1 : %s%n", test1_1);
  	System.out.println("---------------------------------------------------");
  	
  	TestBean1 test1_2 = ctx.getBean(TestBean1.class);
  	System.out.printf("test1_2 : %s%n", test1_2);
  	System.out.println("---------------------------------------------------");
  	
  	TestBean2 test2_1 = ctx.getBean("test2", TestBean2.class);
  	System.out.printf("test2_1 : %s%n", test2_1);
  	System.out.println("---------------------------------------------------");
  	
  	TestBean2 test2_2 = ctx.getBean("test2", TestBean2.class);
  	System.out.printf("test2_2 : %s%n", test2_2);
  	System.out.println("---------------------------------------------------");
  	
  	TestBean2 test2_3 = ctx.getBean("test2_3", TestBean2.class);
  	System.out.printf("test2_3 : %s%n", test2_3);
  	System.out.println("---------------------------------------------------");
  	
  	TestBean2 test2_4 = ctx.getBean("test2_4", TestBean2.class);
  	System.out.printf("test2_4 : %s%n", test2_4);
  	System.out.println("---------------------------------------------------");
  	
  	TestBean3 test3_1 = ctx.getBean(TestBean3.class);
  	System.out.printf("test3_1 : %s%n", test3_1);
  	System.out.println("---------------------------------------------------");
  	
  	TestBean3 test3_2 = ctx.getBean(TestBean3.class);
  	System.out.printf("test3_2 : %s%n", test3_2);
  	System.out.println("---------------------------------------------------");
  	
  	TestBean4 test4_1 = ctx.getBean(TestBean4.class);
  	System.out.printf("test4_1 : %s%n", test4_1);
  	System.out.println("---------------------------------------------------");
  	
  	TestBean4 test4_2 = ctx.getBean(TestBean4.class);
  	System.out.printf("test4_2 : %s%n", test4_2);
  	System.out.println("---------------------------------------------------");
  	
  	TestBean5 test5_1 = ctx.getBean(TestBean5.class);
  	System.out.printf("test5_1 : %s%n", test5_1);
  	System.out.println("---------------------------------------------------");
  	
  	
  	ctx.close();
    
  }
  
}


  
  
