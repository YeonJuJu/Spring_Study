package com.tjoeun.spring.bean;

import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class DataDTO1 {
	
	@Size(min=2, max=10)
	private String data1;
	
	@Max(100)
	private int data2;
	
}
