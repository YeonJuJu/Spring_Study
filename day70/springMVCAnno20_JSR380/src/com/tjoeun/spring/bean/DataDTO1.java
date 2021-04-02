package com.tjoeun.spring.bean;

import javax.validation.constraints.Email;
import javax.validation.constraints.Negative;
import javax.validation.constraints.NegativeOrZero;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DataDTO1 {
	
	@NotEmpty
	private String name;

	@NotBlank
	private String nickname;
	
	@Positive
	private String age;
	
	@PositiveOrZero
	private String height;
	
	@Negative
	private String weight;
	
	@NegativeOrZero
	private String waist;
	
	@Email
	@NotEmpty
	private String email;
	
	public DataDTO1() {
		this.name = "김남준";
		this.nickname = "RM";
		this.age = "28";
	}
}
