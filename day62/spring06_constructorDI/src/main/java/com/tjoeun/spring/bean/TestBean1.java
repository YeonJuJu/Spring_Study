package com.tjoeun.spring.bean;

public class TestBean1 {
	
	private int dataI;
	private double dataD;
	private String dataS;
	
	public TestBean1() {
		System.out.println("TestBean1 기본 생성자");
		dataI = 0;
		dataD = 0.0;
		dataS = null;
	}
	
	public TestBean1(int dataI) {
		System.out.println("TestBean1 생성자 - 매개변수 : int dataI");
		this.dataI = dataI;
		this.dataD = 0.0;
		this.dataS = null;
	}
	
	public TestBean1(double dataD) {
		System.out.println("TestBean1 생성자 - 매개변수 : double dataD");
		this.dataI = 0;
		this.dataD = dataD;
		this.dataS = null;
	}
	
	public TestBean1(String dataS) {
		System.out.println("TestBean1 생성자 - 매개변수 : String dataS");
		this.dataI = 0;
		this.dataD = 0.0;
		this.dataS = dataS;
	}
	
	public TestBean1(int dataI, double dataD, String dataS) {
		System.out.println("TestBean1 생성자 - 매개변수 : int dataI, double dataD, String dataS");
		this.dataI = dataI;
		this.dataD = dataD;
		this.dataS = dataS;
	}
	
	public String toString() {
		return dataI + "--" + dataD + "--" + dataS;
	}
	
	public void bean1Init() {
		System.out.println("bean1Init() called");
	}
}
