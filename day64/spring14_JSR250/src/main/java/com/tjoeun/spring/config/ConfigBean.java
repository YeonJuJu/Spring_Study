package com.tjoeun.spring.config;


import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.tjoeun.spring.bean.DataBean1;
import com.tjoeun.spring.bean.DataBean2;
import com.tjoeun.spring.bean.TestBean1;
import com.tjoeun.spring.bean.TestBean2;
import com.tjoeun.spring.bean.TestBean3;
import com.tjoeun.spring.bean.TestBean4;
import com.tjoeun.spring.bean.TestBean5;
import com.tjoeun.spring.bean.TestBean6;


@Configuration
public class ConfigBean {
	
	@Bean(initMethod="init1", destroyMethod="destroy1")
	@Lazy
	public TestBean1 anno1() {
		return new TestBean1();
	}
	
	@Bean
	@Lazy
	public TestBean2 anno2() {
		return new TestBean2();
	}
	
	@Bean
	public DataBean1 data1() {
		return new DataBean1();
	}
	
	@Bean 
	public DataBean2 data2() {
		return new DataBean2();
	}
	
	@Bean(autowire=Autowire.BY_NAME)
	public TestBean3 anno3() {
		return new TestBean3();
	}
	
	@Bean
	public TestBean4 anno4() {
		return new TestBean4();
	}
	
	@Bean
	public TestBean5 anno5() {
		return new TestBean5();
	}
	
	@Bean
	public TestBean6 anno6() {
		return new TestBean6();
	}
}
