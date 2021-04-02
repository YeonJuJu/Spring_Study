package com.tjoeun.spring.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class TestInterceptor1 implements HandlerInterceptor{
	// Controller의 메소드(test1)가 호출되기 전에 호출됨
	// 이 메소드가 false를 return 하면 code의 흐름이 중단됨
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		//return HandlerInterceptor.super.preHandle(request, response, handler);
		//이 메소드가 false를 반환하면 그 밑에 애들 다 실행 안됨
		System.out.println("TestInterceptor1.preHandle()");
		return true;
	}
	// Controller 의 메소드의 수행이 완료되고
	  // (Interceptor로 등록된 주솟값에 의해 호출되는
	  //  Controller의 메소드)
	  // view 처리를 하기 전에 호출됨
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		//HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
		System.out.println("TestInterceptor1.postHandle()");
	}
	  // view 처리까지 완료되고
	  // response(응답결과)가 browser로
	  // 전달되기 전에 호출됨
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
        //HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
		System.out.println("TestInterceptor1.afterCopletion()");
	}

}
