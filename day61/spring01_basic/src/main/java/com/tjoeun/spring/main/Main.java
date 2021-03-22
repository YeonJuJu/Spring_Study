package com.tjoeun.spring.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tjoeun.spring.bean.HelloWorld;
import com.tjoeun.spring.bean.HelloWorldEn;

public class Main {
	public static void main(String[] args) {
		
		//beans.xml loading
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/tjoeun/spring/config/beans.xml");
		
		HelloWorldEn hwe = (HelloWorldEn) ctx.getBean("greetingEn");
		HelloWorld hwk = (HelloWorld) ctx.getBean("greetingKo");
		
		callMethod(hwe);
		callMethod(hwk);
		
		ctx.close();
	}
	
	
	public static void callMethod(HelloWorld hw) {
		hw.greeting();
	}
}
