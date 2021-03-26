package com.tjoeun.spring.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class Advisor {
	public void beforeMethod() {
		System.out.println("beforeMethod() !!!");
	}
	
	public void afterMethod() {
		System.out.println("afterMethod() !!!");
	}
	
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
	
	public void afterReturningMethod() {
		System.out.println("afterReturningMethod() !!!");
	}
	
	public void afterThrowingMethod(Throwable e) {
		System.out.println("afterThrowingMethod() !!!");
		System.out.println(e);
	}
}
