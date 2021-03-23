package com.tjoeun.spring.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tjoeun.spring.bean.Person;
import com.tjoeun.spring.bean.TestBean1;
import com.tjoeun.spring.bean.TestBean2;
import com.tjoeun.spring.bean.TestBean3;
import com.tjoeun.spring.bean.TestBean4;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/tjoeun/spring/config/beans.xml");

		TestBean1 test1_1 = ctx.getBean("test1_1", TestBean1.class);
		System.out.println("test1_1 : " + test1_1);
		
		/*
		 * Person p1 = new Person(); Person p2 = new Person(); TestBean1 tb1 = new
		 * TestBean1(); tb1.setPerson(p1); tb1.setPerson(new Person());
		 */
		
		ctx.close();
	}

}
