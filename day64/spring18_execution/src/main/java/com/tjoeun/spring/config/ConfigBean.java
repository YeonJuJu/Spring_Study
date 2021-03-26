package com.tjoeun.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.tjoeun.spring.bean.DataBean2;
import com.tjoeun.spring.bean.DataBean3;
import com.tjoeun.spring.bean.DataBean4;
import com.tjoeun.spring.bean.DataBean5;
import com.tjoeun.spring.bean.TestBean2;
import com.tjoeun.spring.bean.TestBean3;


@Configuration
@ComponentScan(basePackages = "com.tjoeun.spring.bean")
public class ConfigBean {
	
  @Bean //=>근데 이게 없음 원래는... 무야무야무ㅑ
  public DataBean2 d2() {
	  return new DataBean2();
  }	
	
  @Bean
  public DataBean3 db3() {
	  return new DataBean3();
  }
  
  @Bean
  public DataBean3 db4() {
	  return new DataBean3();
  }
  
  @Bean
  public TestBean3 anno2() {
	  return new TestBean3(222, "아카데미", new DataBean4(), new DataBean5());
  }
}
