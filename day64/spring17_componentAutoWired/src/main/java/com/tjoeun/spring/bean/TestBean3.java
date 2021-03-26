package com.tjoeun.spring.bean;

import org.springframework.beans.factory.annotation.Value;


public class TestBean3 {
	
	private int number;
	private String name;
	private DataBean4 data4;
	private DataBean5 data5;
	
	
	//TestBean2의 객체를 생성할 때 반드시 주입받아야 하는 객체(Bean)의 경우 생성자를 통해 주입받도록 설정
	public TestBean3(@Value("111") int number, @Value("joeun") String name, DataBean4 data4, DataBean5 data5) {
		this.number = number;
		this.name = name;
		this.data4 = data4;
		this.data5 = data5;
	}
	
	public int getNumber() {
		return number;
	}
	public String getName() {
		return name;
	}
	public DataBean4 getData4() {
		return data4;
	}
	public DataBean5 getData5() {
		return data5;
	}
	
}
