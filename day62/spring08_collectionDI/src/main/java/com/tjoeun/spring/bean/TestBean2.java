package com.tjoeun.spring.bean;

public class TestBean2 {
	private Person p1;
	private Person p2;
	
	public TestBean2(Person p1, Person p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	@Override
	public String toString() {
		return p1 + " || " + p2;
	}
}
