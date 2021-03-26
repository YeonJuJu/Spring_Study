package com.tjoeun.spring.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tjoeun.spring.bean.TestBean1;
import com.tjoeun.spring.bean.TestBean2;

public class Main {
  public static void main(String[] args) {
  	
	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/tjoeun/spring/config/beans.xml");
	  
	System.out.println("\n========================================================\n");  
	
	TestBean1 xml1 = ctx.getBean("xml1", TestBean1.class);
	TestBean2 xml2 = ctx.getBean("xml2", TestBean2.class);
	com.tjoeun.spring.bean2.TestBean1 xml3 = ctx.getBean("xml3", com.tjoeun.spring.bean2.TestBean1.class);
	
	
	xml1.method1();
	
	System.out.println("\n========================================================\n");

	xml1.method1(555);
	
	System.out.println("\n========================================================\n");

	xml1.method1("hi~");
	
	System.out.println("\n========================================================\n");

	xml1.method1(1, 2);
	
	System.out.println("\n========================================================\n");

	xml1.method1(1, "one");
	
	System.out.println("\n========================================================\n");

	xml1.method2();
	
	System.out.println("\n========================================================\n");
	
	xml2.method1();
	
	System.out.println("\n========================================================\n");
	
	xml3.method1();
	
	System.out.println("\n========================================================\n");
	
	xml3.method2();
	
	System.out.println("\n========================================================\n");
	
	xml3.method3();
	
	System.out.println();	
  	System.out.println("\n========================================================\n");
  	ctx.close();
  }
  
}


  
  
