package com.tjoeun.spring.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tjoeun.spring.bean.Person;
import com.tjoeun.spring.bean.TestBean1;
import com.tjoeun.spring.bean.TestBean2;
import com.tjoeun.spring.bean.TestBean3;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/tjoeun/spring/config/beans.xml");

		TestBean1 tb1 = ctx.getBean("test1", TestBean1.class);
		System.out.println("tb1.p1 : " + tb1.getP1());
		System.out.println("tb1.p2 : " + tb1.getP2());
		
		System.out.println("=====================================");
		
		TestBean1 tb2 = ctx.getBean("test2", TestBean1.class);
		System.out.println("tb2.p1 : " + tb2.getP1());
		System.out.println("tb2.p2 : " + tb2.getP2());
		
		System.out.println("=====================================");
		
		TestBean2 tb3 = ctx.getBean("test3", TestBean2.class);
		System.out.println("tb3.p1 : " + tb3.getP1());
		System.out.println("tb3.p2 : " + tb3.getP2());
		
		System.out.println("=====================================");

		TestBean3 tb4 = ctx.getBean("test4", TestBean3.class);
		System.out.println("tb4.number : " + tb4.getNumber());
		System.out.println("tb4.str : " + tb4.getStr());
		System.out.println("tb4.p1 : " + tb4.getP2_1());
		System.out.println("tb4.p2 : " + tb4.getP2_2());
		
		System.out.println("=====================================");
		
		TestBean3 tb5 = ctx.getBean("test5", TestBean3.class);
		System.out.println("tb5.number : " + tb5.getNumber());
		System.out.println("tb5.str : " + tb5.getStr());
		System.out.println("tb5.p1 : " + tb5.getP2_1());
		System.out.println("tb5.p2 : " + tb5.getP2_2());
		
		System.out.println("=====================================");
		
		TestBean3 tb6 = ctx.getBean("test6", TestBean3.class);
		System.out.println("tb6.number : " + tb6.getNumber());
		System.out.println("tb6.str : " + tb6.getStr());
		System.out.println("tb6.p1 : " + tb6.getP2_1());
		System.out.println("tb6.p2 : " + tb6.getP2_2());
		
		System.out.println("=====================================");
		
		TestBean3 tb7 = ctx.getBean("test7", TestBean3.class);
		System.out.println("tb7.number : " + tb7.getNumber());
		System.out.println("tb7.str : " + tb7.getStr());
		System.out.println("tb7.p1 : " + tb7.getP2_1());
		System.out.println("tb7.p2 : " + tb7.getP2_2());
		
		System.out.println("=====================================");
		
		TestBean1 tb8 = ctx.getBean("test8", TestBean1.class);
		System.out.println("tb8.p1 : " + tb8.getP1());
		System.out.println("tb8.p2 : " + tb8.getP2());
		
		System.out.println("=====================================");
		
		TestBean1 tb9 = ctx.getBean("test9", TestBean1.class);
		System.out.println("tb9.p1 : " + tb9.getP1());
		System.out.println("tb9.p2 : " + tb9.getP2());
		
		System.out.println("=====================================");
		
		ctx.close();
	}

}
