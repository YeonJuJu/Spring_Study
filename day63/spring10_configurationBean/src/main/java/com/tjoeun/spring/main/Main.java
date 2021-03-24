package com.tjoeun.spring.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tjoeun.spring.bean.TestBean1;
import com.tjoeun.spring.bean.TestBean2;
import com.tjoeun.spring.bean.TestBean3;
import com.tjoeun.spring.bean.TestBean4;
import com.tjoeun.spring.config.ConfigBean;

public class Main {
	public static void main(String[] args) {
		
		//xml을 이용한 설정 방식
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/tjoeun/spring/config/beans.xml");
		
		TestBean1 xml1 = ctx.getBean("xml1", TestBean1.class);
		System.out.println("xml1 : " + xml1);
		
		System.out.println(" ");
		
		//lazy-init xml version
		TestBean2 xml21 = ctx.getBean("xml2", TestBean2.class);
		System.out.println("xml21 : " + xml21);
		
		TestBean2 xml22 = ctx.getBean("xml2", TestBean2.class);
		System.out.println("xml22 : " + xml22);
		
		System.out.println(" ");
		
		//scope xml version
		TestBean3 xml31 = ctx.getBean("xml3", TestBean3.class);
		System.out.println("xml31 : " + xml31);
		
		TestBean3 xml32 = ctx.getBean("xml3", TestBean3.class);
		System.out.println("xml32 : " + xml32);
		
		System.out.println(" ");
		
		//primary xml version
		//primary type은 이미 생성되어있음 TestBean4 형식이 여러개가 있을 경우 primary가 true인 객체를 가져옴
		TestBean4 xml4 = ctx.getBean(TestBean4.class);
		System.out.println("xml4 : " + xml4);
		
		System.out.println(" ");
		
		System.out.println("==========================================================================");
		
		//java file을 이용한 설정 방식 -> annotation
		AnnotationConfigApplicationContext atx = new AnnotationConfigApplicationContext(ConfigBean.class);
	
		TestBean1 anno1 = atx.getBean("anno1", TestBean1.class);
		System.out.println("anno1 : " + anno1);
		
		// 다음 두 문장은 에러 발생 : name 속성을 이용해 이름을 바꿨기 때문 (기본은 함수 이름)
//		TestBean1 anno2 = atx.getBean("anno2", TestBean1.class);
//		System.out.println("anno2 : " + anno2);
		
		TestBean1 annotation = atx.getBean("annotation", TestBean1.class);
		System.out.println("anno2 : " + annotation);
		
		System.out.println(" ");
		
		//lazy-init java version
		TestBean2 anno31 = atx.getBean("anno3", TestBean2.class);
		System.out.println("anno31 : " + anno31);
		
		TestBean2 anno32 = atx.getBean("anno3", TestBean2.class);
		System.out.println("anno32 : " + anno32);
		
		System.out.println(" ");
		
		//scope java version
		TestBean3 anno41 = atx.getBean("anno4", TestBean3.class);
		System.out.println("anno41 : " + anno41);
		
		TestBean3 anno42 = atx.getBean("anno4", TestBean3.class);
		System.out.println("anno42 : " + anno42);
		
		System.out.println(" ");
		
		//primary java version
		//TestBean4 타입의 객체는 두 가지 중 primary 키워드가 붙은 객체를 가져온다
		TestBean4 anno5 = atx.getBean(TestBean4.class);
		System.out.println("anno5 : " + anno5);
		
		System.out.println(" ");
		
		atx.close();
		ctx.close();
	}

}
