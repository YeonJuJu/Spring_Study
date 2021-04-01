package com.tjoeun.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// Spring MVC 프로젝트에 관련된 설정을 하는 클래스
// (servlet-context.xml)
@Configuration
// @Controller 어노테이션이 붙은 클래스를
// Controller 로 등록함
@EnableWebMvc // (<annotation-driven />)
// Scan 할 Bean 들이 모여있는 package 를 지정함
@ComponentScan("com.tjoeun.spring.controller")
@ComponentScan("com.tjoeun.spring.bean")
//@ComponentScan(basePackages= {"", ""}) 처럼 한줄에 해도 됨
public class ServletAppContext 
  implements WebMvcConfigurer {
  /*
    Controller 에서 return하는 문자열(경로)에
    접두사, 접미사 설정하기 
  */
  @Override
  public void configureViewResolvers(ViewResolverRegistry registry) {
    WebMvcConfigurer.super.configureViewResolvers(registry);
    registry.jsp("/WEB-INF/views/",".jsp");
  }
  
  /*
    프로젝트에서 사용하는 정적 파일 경로 설정하기
    이미지, 사운드, 동영상, js, css 등 
  */
  @Override
  public void addResourceHandlers
    (ResourceHandlerRegistry registry) {
    WebMvcConfigurer.super.addResourceHandlers(registry);
    registry.addResourceHandler("/**").addResourceLocations("/resources/");
  }

  // Properties 파일을 Message로 등록하기
  @Bean
  public ReloadableResourceBundleMessageSource messageSource() {
	  ReloadableResourceBundleMessageSource res = new ReloadableResourceBundleMessageSource();
  
	  res.setBasenames("/WEB-INF/properties/data1", "/WEB-INF/properties/data2", "/WEB-INF/properties/data");
	  
	  return res;
  }
}






