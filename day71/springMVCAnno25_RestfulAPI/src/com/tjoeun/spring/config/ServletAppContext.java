package com.tjoeun.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan("com.tjoeun.spring.controller")
@ComponentScan("com.tjoeun.spring.bean")
public class ServletAppContext implements WebMvcConfigurer {
	
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
}






