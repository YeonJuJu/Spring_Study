package com.tjoeun.spring.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tjoeun.spring.bean.TestBean1;
import com.tjoeun.spring.bean.TestBean2;
import com.tjoeun.spring.bean.TestBean3;
import com.tjoeun.spring.bean.TestBean4;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/tjoeun/spring/config/beans.xml");

		TestBean1 t1 = ctx.getBean("test1", TestBean1.class);
		System.out.println("t1 : " + t1);

		System.out.println("===================================");

		TestBean2 t2 = ctx.getBean("test2", TestBean2.class);
		System.out.println("t2 : " + t2);

		System.out.println("===================================");

		ctx.close();
	}

}
