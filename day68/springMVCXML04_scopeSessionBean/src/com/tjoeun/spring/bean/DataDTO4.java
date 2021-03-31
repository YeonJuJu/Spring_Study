package com.tjoeun.spring.bean;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import lombok.Data;

@Component("sessionDTO4")
//@SessionScope
@Data
public class DataDTO4 {
	
	private String psn;
	private String dl;
	
}
