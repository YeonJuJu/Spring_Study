package com.tjoeun.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;

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
  @RequestScope
  public DataDTO1 dataDto1() {
	  return new DataDTO1();
  }
  
  @Bean("requestDto2")
  @RequestScope
  public DataDTO2 dataDto2() {
	  return new DataDTO2();
  }
  
// DataDTO3 와 DataDTO4 는 해당 클래스에 @Component 이런 키워드가 들어가 있기 때문에 밑 문장들을 코딩하면 오류 발생
//  @Bean
//  @RequestScope
//  public DataDTO3 dataDto3() {
//	  return new DataDTO3();
//  }
//  
//  @Bean
//  @RequestScope
//  public DataDTO4 dataDto4() {
//	  return new DataDTO4();
//  }
}
