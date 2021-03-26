package com.tjoeun.spring.bean;

import javax.annotation.Resource;


public class TestBean5 {
	
	//멤버변수 이름과 같은 이름의 Bean이 주입됨
	@Resource
	private DataBean1 data1;
	
	@Resource
	private DataBean2 data2;
	
	public DataBean1 getData1() {
		return data1;
	}
	public DataBean2 getData2() {
		return data2;
	}
	
}
