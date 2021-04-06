package com.tjoeun.spring.bean;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DataDTO1 {

	private String name;
	private int age;
	private double height;
	private boolean marriage;
	
	public DataDTO1(String name, int age, double height, boolean marriage) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.marriage = marriage;
	}
}
