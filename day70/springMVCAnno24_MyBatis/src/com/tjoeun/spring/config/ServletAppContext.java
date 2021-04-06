package com.tjoeun.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
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
@ComponentScan("com.tjoeun.spring.exception")
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
  
	  //res.setBasenames("/WEB-INF/properties/data1", "/WEB-INF/properties/data2", "/WEB-INF/properties/data");
	  
	  res.setBasenames("/WEB-INF/properties/error_msg");
	  
	  return res;
  }
  
  //Interceptor 둥록하기
  @Override
  public void addInterceptors(InterceptorRegistry registry) {
	  WebMvcConfigurer.super.addInterceptors(registry);
	  
//	  TestInterceptor1 inter1 = new TestInterceptor1();
//	  TestInterceptor2 inter2 = new TestInterceptor2();
//	  TestInterceptor3 inter3 = new TestInterceptor3();
//	  TestInterceptor4 inter4 = new TestInterceptor4();
//	  TestInterceptor5 inter5 = new TestInterceptor5();
//	  TestInterceptor6 inter6 = new TestInterceptor6();
//	  TestInterceptor7 inter7 = new TestInterceptor7();
//	  TestInterceptor8 inter8 = new TestInterceptor8();
//	  
//	  InterceptorRegistration reg1 = registry.addInterceptor(inter1);
//	  InterceptorRegistration reg2 = registry.addInterceptor(inter2);
//	  InterceptorRegistration reg3 = registry.addInterceptor(inter3);
//	  InterceptorRegistration reg4 = registry.addInterceptor(inter4);
//	  InterceptorRegistration reg5 = registry.addInterceptor(inter5);
//	  InterceptorRegistration reg6 = registry.addInterceptor(inter6);
//	  InterceptorRegistration reg7 = registry.addInterceptor(inter7);
//	  InterceptorRegistration reg8 = registry.addInterceptor(inter8);
//	  
//	  //"/test1"이 요청될 때 Controller로 바로 이동하지 않고, TestInterceptor1으로 먼저 이동하라는 의미
//	  reg1.addPathPatterns("/test1");
//	  reg2.addPathPatterns("/test1");
//	  reg3.addPathPatterns("/test2");
//	  
////	  reg4.addPathPatterns("/test1");
////	  reg4.addPathPatterns("/test2");
//	  reg4.addPathPatterns("/test1", "test2");
//	  
//	  reg5.addPathPatterns("/sub1/test3", "/sub1/test4");
//	  
//	  //하나까지만 가능 뒤에 /더 있으면 ㄴㄴ임
//	  reg6.addPathPatterns("/*");
//	  
//	  reg7.addPathPatterns("/sub1/*");
//	  
//	  reg8.addPathPatterns("/**");
//	  reg8.excludePathPatterns("/*"); //제외
  }
}






