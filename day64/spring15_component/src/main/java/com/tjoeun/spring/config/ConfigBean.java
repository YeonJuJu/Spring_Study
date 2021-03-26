package com.tjoeun.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.tjoeun.spring.bean.TestBean2;


@Configuration
@ComponentScan(basePackages = {"com.tjoeun.spring.bean", "com.tjoeun.spring.bean2"})
public class ConfigBean {
	
  @Bean
  public TestBean2 test2_3() {
  	return new TestBean2();
  }
  
  @Bean
  public TestBean2 test2_4() {
  	return new TestBean2();
  }
}
