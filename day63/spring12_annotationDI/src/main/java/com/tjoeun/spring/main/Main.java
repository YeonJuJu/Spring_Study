package com.tjoeun.spring.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tjoeun.spring.bean.TestBean1;
import com.tjoeun.spring.bean.TestBean2;
import com.tjoeun.spring.bean.TestBean3;
import com.tjoeun.spring.config.ConfigBean;

public class Main {
	public static void main(String[] args) {
		
		//xml을 이용한 설정 방식
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/tjoeun/spring/config/beans.xml");
		
		TestBean1 xml1 = ctx.getBean("xml1", TestBean1.class);
		System.out.println("xml1.data1 : " + xml1.getData1());
		System.out.println("xml1.data2 : " + xml1.getData2());
		System.out.println("xml1.data3 : " + xml1.getData3());
		
		System.out.println(" ");
		
		TestBean1 xml2 = ctx.getBean("xml2", TestBean1.class);
		System.out.println("xml2.data1 : " + xml2.getData1());
		System.out.println("xml2.data2 : " + xml2.getData2());
		System.out.println("xml2.data3 : " + xml2.getData3());
		
		System.out.println(" ");
		
		TestBean3 xml3 = ctx.getBean("xml3", TestBean3.class);
		System.out.println("xml3.data1 : " + xml3.getData1());
		System.out.println("xml3.data2 : " + xml3.getData2());
		
		System.out.println(" ");
		
		System.out.println("==========================================================================");
		
		//java를 이용한 설정 방식
		AnnotationConfigApplicationContext atx = new AnnotationConfigApplicationContext(ConfigBean.class);
	
		TestBean1 anno1 = atx.getBean("anno1", TestBean1.class);
		System.out.println("anno1.data1 : " + anno1.getData1());
		System.out.println("anno1.data2 : " + anno1.getData2());
		System.out.println("anno1.data3 : " + anno1.getData3());
		
		System.out.println(" ");
		
		TestBean1 anno2 = atx.getBean("anno2", TestBean1.class);
		System.out.println("anno2.data1 : " + anno2.getData1());
		System.out.println("anno2.data2 : " + anno2.getData2());
		System.out.println("anno2.data3 : " + anno2.getData3());
		
		System.out.println(" ");
		
		TestBean2 anno3 = atx.getBean("anno3", TestBean2.class);
		System.out.println("anno3.data1 : " + anno3.getData1());
		System.out.println("anno3.data2 : " + anno3.getData2());
		
		TestBean3 anno4 = atx.getBean("anno4", TestBean3.class);
		System.out.println("anno4.data1 : " + anno4.getData1());
		System.out.println("anno4.data2 : " + anno4.getData2());
		
		atx.close();
		ctx.close();
	}

}
