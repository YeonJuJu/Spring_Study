package com.tjoeun.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import com.tjoeun.spring.bean.DataDTO1;
import com.tjoeun.spring.bean.DataDTO2;
import com.tjoeun.spring.bean.DataDTO3;
import com.tjoeun.spring.bean.DataDTO4;

// Bean 을 정의하는 xml 파일 지정하기
// 프로젝트에서 사용하는 Bean을 정의하는 클래스
// (root-context.xml)
@Configuration
public class RootAppContext {
  @Bean
  @SessionScope
  public DataDTO1 dataDto1() {
	  return new DataDTO1();
  }
  
  @Bean("sessionDTO2")
  @SessionScope
  public DataDTO2 dataDto2() {
	  return new DataDTO2();
  }

}
