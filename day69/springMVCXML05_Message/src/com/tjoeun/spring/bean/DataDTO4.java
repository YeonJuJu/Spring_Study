package com.tjoeun.spring.bean;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import lombok.Data;

@Component("sessionDTO4")
@SessionScope
@Data  // 생성자, getters / setters, toString()
public class DataDTO4 {

	private String psn;
	private String dl;
	
}
