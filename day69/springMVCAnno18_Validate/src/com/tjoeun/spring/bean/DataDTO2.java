package com.tjoeun.spring.bean;

import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class DataDTO2 {
	
   @Size(min=2, max=10)
   private String data3;
	 
   @Max(100)
   private String data4;
   
}
