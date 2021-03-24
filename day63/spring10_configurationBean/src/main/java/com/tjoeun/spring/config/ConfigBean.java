package com.tjoeun.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.tjoeun.spring.bean.TestBean1;
import com.tjoeun.spring.bean.TestBean2;
import com.tjoeun.spring.bean.TestBean3;
import com.tjoeun.spring.bean.TestBean4;

@Configuration
public class ConfigBean {
	
	@Bean
	public TestBean1 anno1() {	//method의 이름이 id가 됨
		TestBean1 t1 = new TestBean1();
		
		return t1;
	}
	
	@Bean(name="annotation")	//name을 정의하면 해당 name이 id가 됨
	public TestBean1 anno2() {
		TestBean1 t1 = new TestBean1();
		
		return t1;
	}
	
	@Bean @Lazy
	public TestBean2 anno3() {
		TestBean2 t2 = new TestBean2();
		
		return t2;
	}
	
	@Bean @Scope("prototype")
	public TestBean3 anno4() {
		TestBean3 t3 = new TestBean3();
		
		return t3;
	}
	
	@Bean 
	public TestBean4 anno5() {
		TestBean4 t4 = new TestBean4();
		
		return t4;
	}
	
	@Bean @Primary
	public TestBean4 anno6() {
		TestBean4 t4 = new TestBean4();
		
		return t4;
	}
}
