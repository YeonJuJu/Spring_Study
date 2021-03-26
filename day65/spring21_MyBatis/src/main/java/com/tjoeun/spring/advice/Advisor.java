package com.tjoeun.spring.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
public class Advisor {
	
	@Before("execution(* method1())")
	public void beforeMethod() {
		System.out.println("beforeMethod() !!!");
	}
	
	@After("execution(* method1())")
	public void afterMethod() {
		System.out.println("afterMethod() !!!");
	}
	
	@Around("execution(* method1())")
	public Object aroundMethod(ProceedingJoinPoint pjp) {
		System.out.println("aroundMethod() !!!");
		
		Object result = 0;
		
		try {
			// pjp.proceed() : 관심사로 등록된 메소드를 실행하는 역할
			result = (Integer) pjp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("aroundMethod() !!!");
		
		return result;
	}
	
	@AfterReturning("execution(* method1())")
	public void afterReturningMethod() {
		System.out.println("afterReturningMethod() !!!");
	}
	
	@AfterThrowing("execution(* method1())")
	public void afterThrowingMethod(Throwable e) {
		System.out.println("afterThrowingMethod() !!!");
		System.out.println(e);
	}
}
