package com.tjoeun.spring.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tjoeun.spring.bean.TestBean;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/tjoeun/spring/config/beans.xml");
	
		/*
		 * TestBean t1 = ctx.getBean("test1", TestBean.class); TestBean t2 =
		 * ctx.getBean("test1", TestBean.class);
		 * 
		 * System.out.println("t1 : " + t1 + ", t2 : " + t2);
		 */
		
		/*
		 * TestBean t3 = ctx.getBean("test2", TestBean.class); TestBean t4 =
		 * ctx.getBean("test2", TestBean.class);
		 * 
		 * System.out.println("t3 : " + t3 + ", t4 : " + t4);
		 */
		
		TestBean t5 = ctx.getBean("test3", TestBean.class);
		TestBean t6 = ctx.getBean("test3", TestBean.class);
		
		System.out.println("t5 : " + t5 + ", t6 : " + t6);
		
		ctx.close();
	}
	
	
}
