package com.tjoeun.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.tjoeun.spring.advice", "com.tjoeun.spring.bean"})
/*
    Advisor 클래스에 설정된 Annotation들을 보고
    AOP 관련 설정을 하라고 Spring 에게 지시하는 부분  
*/
@EnableAspectJAutoProxy
public class ConfigBean {
	
 
 
}
