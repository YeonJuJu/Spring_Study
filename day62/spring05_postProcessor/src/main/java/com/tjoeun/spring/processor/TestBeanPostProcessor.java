package com.tjoeun.spring.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class TestBeanPostProcessor implements BeanPostProcessor{
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException{
		System.out.println("before init-method");
		
		switch(beanName) {
			case "test1":
				System.out.println("beans.xml에 등록된 id가 test1인 bean 객체 생성");
				break;
			case "test2":
				System.out.println("beans.xml에 등록된 id가 test2인 bean 객체 생성");
				break;
		}
		
		return bean;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

		System.out.println("after init-method");
		
		return bean;
	}
}
