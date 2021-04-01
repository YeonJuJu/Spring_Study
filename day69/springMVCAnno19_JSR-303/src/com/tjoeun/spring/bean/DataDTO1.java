package com.tjoeun.spring.bean;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DataDTO1 {

	// code - 어노테이션이름.클래스.멤버변수
	// AssertTrue.dataDTO1.name
	@AssertTrue
	private boolean name;

	@AssertFalse
	private boolean age;

	@Max(200)
	@Min(10)
	private String height;
	
	@DecimalMax(value="100", inclusive=false)
	@DecimalMin(value="10", inclusive=false)
	private String weight;

	@Null
	private String hobby;
	
	@NotNull
	private String colors;
	
	@Digits(integer=3,fraction=3)
	private String number1;
	
	@Size(min=5, max=10)
	private String addr;
	
	public DataDTO1() {
		this.name = true;
		this.age = false;
		this.height = "170";
		this.weight = "50";
		this.number1 = "123.123";
	}

}
