package com.tjoeun.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


// IoC 컨테이너의 객체가 생성 될 때
// (AnnotationConfigApplicationContext)
// TestBean1 의 객체를 생성함
// TestBean1 의 타입으로 Bean객체를 가져옴 (in main())
//  Singleton Design Pattern 으로 생성됨
@Component
public class TestBean1 {
	@Autowired // -> setter 가 자동으로 만들어진다.
	private DataBean1 data1;
	@Autowired
	@Qualifier("d2")
	private DataBean2 data2;
	
	@Autowired
	@Qualifier("db3")
	private DataBean3 data3;
	
	@Autowired
	@Qualifier("db4")
	private DataBean3 data4;
	
	public DataBean1 getData1() {
		return this.data1;
	}
	
	public DataBean2 getData2() {
		return this.data2;
	}

	public DataBean3 getData3() {
		return data3;
	}

	public DataBean3 getData4() {
		return data4;
	}
	
	
}








