package com.tjoeun.spring.bean;

public class TestBean3 {
	private int number;
	private String str;
	private Person2 p2_1;
	private Person2 p2_2;
	
	public TestBean3(Person2 p2_1, Person2 p2_2) {
		this.p2_1 = p2_1;
		this.p2_2 = p2_2;
	}
	public TestBean3(int number, String str, Person2 p2_1, Person2 p2_2) {
		this.number = number;
		this.str = str;
		this.p2_1 = p2_1;
		this.p2_2 = p2_2;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public Person2 getP2_1() {
		return p2_1;
	}
	public void setP2_1(Person2 p2_1) {
		this.p2_1 = p2_1;
	}
	public Person2 getP2_2() {
		return p2_2;
	}
	public void setP2_2(Person2 p2_2) {
		this.p2_2 = p2_2;
	}
	
}
