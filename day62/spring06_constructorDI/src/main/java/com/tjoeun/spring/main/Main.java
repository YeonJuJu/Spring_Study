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

		/*
		 * TestBean1 t1 = new TestBean1(); System.out.println(t1.toString());
		 * 
		 * TestBean1 t2 = new TestBean1(123); System.out.println(t2.toString());
		 * 
		 * TestBean1 t3 = new TestBean1(123.456); System.out.println(t3.toString());
		 * 
		 * TestBean1 t4 = new TestBean1("123456789"); System.out.println(t4.toString());
		 * 
		 * TestBean1 t5 = new TestBean1(123, 123.456, "123456789");
		 * System.out.println(t5.toString());
		 */
		
		/*
		 * TestBean1 t1_1 = ctx.getBean("test1_1", TestBean1.class);
		 * System.out.println(t1_1);
		 * 
		 * TestBean1 t1_2 = ctx.getBean("test1_2", TestBean1.class);
		 * System.out.println(t1_2);
		 * 
		 * TestBean1 t1_3 = ctx.getBean("test1_3", TestBean1.class);
		 * System.out.println(t1_3);
		 * 
		 * TestBean1 t1_4 = ctx.getBean("test1_4", TestBean1.class);
		 * System.out.println(t1_4);
		 * 
		 * TestBean1 t1_5 = ctx.getBean("test1_5", TestBean1.class);
		 * System.out.println(t1_5);
		 * 
		 * TestBean1 t1_6 = ctx.getBean("test1_6", TestBean1.class);
		 * System.out.println(t1_6);
		 */
		
		/*
		 * Person p1 = new Person("전정국", 25); Person p2 = new Person("김태형", 27);
		 * TestBean2 tb2 = new TestBean2(p1, p2);
		 * 
		 * System.out.println(tb2.toString());
		 */
		
		TestBean2 tb2 = ctx.getBean("tb2", TestBean2.class);
		System.out.println(tb2);
		
		TestBean2 tb2_2 = ctx.getBean("tb2_2", TestBean2.class);
		System.out.println(tb2_2);
		
		ctx.close();
	}

}
