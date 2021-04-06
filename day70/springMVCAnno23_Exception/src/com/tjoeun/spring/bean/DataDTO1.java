package com.tjoeun.spring.bean;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DataDTO1 {
	
	@NotEmpty
	@Size(min=2, max=10)
	private String name;

	private String addr;
	private String email;
	
}
