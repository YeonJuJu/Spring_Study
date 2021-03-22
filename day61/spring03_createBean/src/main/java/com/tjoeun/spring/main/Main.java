package com.tjoeun.spring.main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import com.tjoeun.spring.bean.TestBean;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/tjoeun/spring/config.xml");
	
		ctx.close();
	}
	
	// BeanFactory 사용하는 경우
	// 1) ClassPathResource 사용 
	// beans.xml 파일이 패키지 내부에 있는 경우
	public static void test1() {
		ClassPathResource cpr = new ClassPathResource("com/tjoeun/spring/config/beans.xml");
	
		XmlBeanFactory xbf = new XmlBeanFactory(cpr);
		
		// Bean 객체 생성
		TestBean tb = xbf.getBean("testbean", TestBean.class );
		System.out.println("tb : " + tb);
		
		TestBean tb2 = xbf.getBean("testbean", TestBean.class );
		System.out.println("tb2 : " + tb2);
	}
	
	// BeanFactory 사용하는 경우
	// 2) FileSystemResource 사용
	// beans.xml 파일이 패키지 외부에 있는 경우
	public static void test2() {

		FileSystemResource fsr = new FileSystemResource("beans.xml");
		
		XmlBeanFactory xbf = new XmlBeanFactory(fsr);
		
		TestBean out1 = xbf.getBean("out1", TestBean.class );
		System.out.println("out1 : " + out1);
		
		TestBean out2 = xbf.getBean("out2", TestBean.class );
		System.out.println("out2 : " + out2);
	}
	
	//ApplicationContext 사용하는 경우
	//beans.xml 파일이  pakage 내부에 있는 경우
	//ClassPathXmlApplicationContext 사용
	public static void test3() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/tjoeun/spring/config.xml");
	
		TestBean tb1 = ctx.getBean("test1", TestBean.class);
		TestBean tb2 = ctx.getBean("test1", TestBean.class);
		
		System.out.println("tb1 : " + tb1);
		System.out.println("tb2 : " + tb2);
	}
	
	//ApplicationContext 사용하는 경우
	//beans.xml 파일이  pakage 외부에 있는 경우
	//FileSystemXmlApplicationContext 사용
	public static void test4() {
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
	
		TestBean out1 = ctx.getBean("out1", TestBean.class);
		TestBean out2 = ctx.getBean("out1", TestBean.class);
		
		System.out.println("out1 : " + out1);
		System.out.println("out2 : " + out2);
	}
}
