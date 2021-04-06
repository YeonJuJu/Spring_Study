package com.tjoeun.spring.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends RuntimeException{
	
	@ExceptionHandler(NullPointerException.class)
	public String globalException() {
		
		return "error_global";
	}
}
