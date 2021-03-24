package com.tjoeun.spring.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.tjoeun.spring.bean.DataBean1;
import com.tjoeun.spring.bean.DataBean2;
import com.tjoeun.spring.bean.DataBean3;
import com.tjoeun.spring.bean.TestBean1;
import com.tjoeun.spring.bean.TestBean2;
import com.tjoeun.spring.bean.TestBean3;

@Configuration
public class ConfigBean {
	
	@Bean
	public TestBean1 anno1() {
		return new TestBean1(1111, "더조은", new DataBean1());
	}
	
	@Bean
	public TestBean1 anno2() {
		TestBean1 tb1 = new TestBean1();
		tb1.setData1(1111);
		tb1.setData2("academy");
		tb1.setData3(new DataBean1());
		
		return tb1;
	}
	
	@Bean
	public DataBean2 data1() {
		return new DataBean2();
	}
	
	@Bean
	public DataBean2 data2() {
		return new DataBean2();
	}
	
	@Bean(autowire = Autowire.BY_NAME)
	@Lazy
	public TestBean2 anno3() {
		return new TestBean2();
	}
	
	@Bean
	public DataBean3 data3() {
		return new DataBean3();
	}
	
	@Bean(autowire = Autowire.BY_TYPE)
	@Lazy
	public TestBean3 anno4() {
		return new TestBean3();
	}
	
}
