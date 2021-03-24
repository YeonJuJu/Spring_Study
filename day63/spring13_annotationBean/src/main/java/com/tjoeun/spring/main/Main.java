package com.tjoeun.spring.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tjoeun.spring.bean.TestBean1;
import com.tjoeun.spring.config.ConfigBean;

public class Main {
	public static void main(String[] args) {
		
		//xml을 이용한 설정 방식
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/tjoeun/spring/config/beans.xml");
		
		System.out.println("==========================================================================");
		
		System.out.println();
		
		TestBean1 xml1 = ctx.getBean("xml1", TestBean1.class);
		System.out.println("xml1.data1 : " + xml1.getData1());
		
		System.out.println();
		
		System.out.println("==========================================================================");
		
		//java를 이용한 설정 방식
		AnnotationConfigApplicationContext atx = new AnnotationConfigApplicationContext(ConfigBean.class);
	
		System.out.println("==========================================================================");
		
		System.out.println();
		
		TestBean1 anno1 = atx.getBean("anno1", TestBean1.class);
		System.out.println("anno1.data1 : " + anno1.getData1());
		
		System.out.println();
		
		System.out.println("==========================================================================");
		
		atx.close();
		ctx.close();
	}

}
