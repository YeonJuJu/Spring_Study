package com.tjoeun.spring.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tjoeun.spring.bean.JDBCDTO;
import com.tjoeun.spring.bean.TestBean1;
import com.tjoeun.spring.config.ConfigBean;
import com.tjoeun.spring.db.JDBCDAO;

public class Main {
  public static void main(String[] args) {
  	
  	AnnotationConfigApplicationContext atx = new AnnotationConfigApplicationContext(ConfigBean.class);
  	
  	System.out.println("\n========================================================\n");
  	
//  	JDBCDTO dto1 = atx.getBean(JDBCDTO.class);
//  	dto1.setInt_data(25);
//  	dto1.setStr_data("전정국");
//  	
//  	JDBCDTO dto2 = atx.getBean(JDBCDTO.class);
//  	dto2.setInt_data(27);
//  	dto2.setStr_data("박지민");
  	
  	JDBCDAO dao = atx.getBean(JDBCDAO.class);
  	
//  		dao.insert_data(dto1);
//  		dao.insert_data(dto2);
//  	System.out.println("DB에 data가 저장됨");

//  	List<JDBCDTO> list = dao.select_data();
//  	
//  	for(JDBCDTO dto : list) {
//  		System.out.println(dto.getInt_data() + " -- " + dto.getStr_data());
//  	}
  	
//  	JDBCDTO dto = new JDBCDTO();
//  	dto.setInt_data(27);
//  	dto.setStr_data("김태형");
//  	dao.update_data(dto);
 
  	dao.delete_data(27);
 	
 	System.out.println();	
  	System.out.println("\n========================================================\n");
  	atx.close();
  }
  
}


  
  
