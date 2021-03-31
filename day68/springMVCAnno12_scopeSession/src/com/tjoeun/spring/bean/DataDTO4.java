package com.tjoeun.spring.bean;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import lombok.Data;

@Component("requestDTO4")
@RequestScope
@Data
public class DataDTO4 {
	
	private String psn;
	private String dl;
	
}
