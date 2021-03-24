package com.tjoeun.spring.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tjoeun.spring.bean.TestBean1;


@Configuration
public class ConfigBean {
	
	@Bean
	public TestBean1 anno1() {
		return new TestBean1();
	}
	
}
