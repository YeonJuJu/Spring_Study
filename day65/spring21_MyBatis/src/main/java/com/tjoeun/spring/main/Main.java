package com.tjoeun.spring.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tjoeun.spring.bean.JDBCDTO;
import com.tjoeun.spring.bean.TestBean1;
import com.tjoeun.spring.config.ConfigBean;
import com.tjoeun.spring.db.JDBCDAO;
import com.tjoeun.spring.mapper.MapperInterface;

public class Main {
  public static void main(String[] args) {
  	
  	AnnotationConfigApplicationContext atx = new AnnotationConfigApplicationContext(ConfigBean.class);
  	
  	MapperInterface mapper = atx.getBean("getMapper", MapperInterface.class);
  	
  	//insert
//  	JDBCDTO dto2 = new JDBCDTO();
//  	dto2.setInt_data(28);
//  	dto2.setStr_data("김남준");
//  	mapper.insert_data(dto2);
//  	
//  	JDBCDTO dto3 = new JDBCDTO();
//  	dto3.setInt_data(28);
//  	dto3.setStr_data("정호석");
//  	mapper.insert_data(dto3);
  	
  	//update
//	JDBCDTO dto4 = new JDBCDTO();
//	dto4.setInt_data(27);
//	dto4.setStr_data("김태형");
//	mapper.update_data(dto4);
  	
	//delete
	mapper.delete_data(25);
	
  	//select
  	List<JDBCDTO> list = mapper.select_data();
  	
  	System.out.println("\n========================================================\n");
  	for(JDBCDTO dto1 : list) {
  		System.out.println("int_data : " + dto1.getInt_data());
  		System.out.println("str_data : " + dto1.getStr_data());
  		
  		System.out.println("\n========================================================\n");
  	}

  	atx.close();
  }
  
}



  
  
