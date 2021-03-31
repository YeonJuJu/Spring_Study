package com.tjoeun.spring.bean;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import lombok.Data;

@Data
@Component
@RequestScope
public class DataDTO3 {
	private String job;
	private String hobby;	
}
