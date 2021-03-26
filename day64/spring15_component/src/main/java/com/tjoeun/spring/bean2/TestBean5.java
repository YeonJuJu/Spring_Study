package com.tjoeun.spring.bean2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TestBean5 {
	public TestBean5() {
		System.out.println("TestBean5의 기본 생성자");
	}
	@PostConstruct
	public void postConstructor() {
		System.out.println("TestBean5의 @PostConstruct 메소드");
	}
	@PreDestroy
	public void preDestroy() {
		System.out.println("TestBean5의 @PreDestroy 메소드");
	}
	
}




