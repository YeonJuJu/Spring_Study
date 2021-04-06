package com.tjoeun.spring.bean;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import lombok.Data;

@Component
@SessionScope
@Data  // 생성자, getters / setters, toString()
public class DataDTO3 {

	private String job;
	private String hobby;
	
}
