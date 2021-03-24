package com.tjoeun.spring.bean;

import org.springframework.beans.factory.annotation.Required;

public class TestBean1 {
	
	private int data1;
	
	public TestBean1() {}
	
	public TestBean1(int data1) {
		this.data1 = data1;
	}
	
	public int getData1() {
		return data1;
	}
	
	@Required
	public void setData1(int data1) {
		this.data1 = data1;
	}
}
