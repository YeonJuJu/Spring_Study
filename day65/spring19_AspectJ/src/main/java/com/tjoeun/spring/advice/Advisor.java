package com.tjoeun.spring.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
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
	public Object aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("aroundMethod() !!!");
		
		System.out.println("aroundMethod 호출 1");
		Object result = pjp.proceed();
		System.out.println("aroundMethod 호출 2");
		return result;
		
	} // around
	
	@AfterReturning("execution(* method1())")
	public void afterReturningMethod() {
		System.out.println("afterReturningMethod() !!!");
	}
	
	@AfterThrowing("execution(* method1())")
	public void afterThrowingMethod() {
		System.out.println("afterThrowingMethod() !!!");
	}
}




