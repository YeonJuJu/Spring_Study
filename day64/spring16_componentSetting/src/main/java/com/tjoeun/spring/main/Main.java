package com.tjoeun.spring.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tjoeun.spring.bean.TestBean1;
import com.tjoeun.spring.bean.TestBean2;
import com.tjoeun.spring.bean.TestBean3;
import com.tjoeun.spring.bean.TestBean4;
import com.tjoeun.spring.bean2.TestBean5;
import com.tjoeun.spring.config.ConfigBean;

public class Main {
  public static void main(String[] args) {
  	// java 파일을 사용한 설정 방식 : Annotation
  	AnnotationConfigApplicationContext atx = new AnnotationConfigApplicationContext(ConfigBean.class);
  	
  	System.out.println();
  	
  	TestBean1 test1_1 = atx.getBean(TestBean1.class);
  	System.out.println("test1_1 : " + test1_1);
  	System.out.println("test1_1.data1 : " + test1_1.getData1());
  	System.out.println("test1_1.data2 : " + test1_1.getData2());
  	System.out.println("test1_1.data3 : " + test1_1.getData3());
  	System.out.println("test1_1.data4 : " + test1_1.getData4());
  	
  	System.out.println("\n========================================================\n");
  	
  	TestBean2 test2 = atx.getBean(TestBean2.class);
  	System.out.println("test2 : " + test2);
  	System.out.println("test2.number : " + test2.getNumber());
  	System.out.println("test2.name : " + test2.getName());
  	System.out.println("test2.data4 : " + test2.getData4());
  	System.out.println("test2.data5 : " + test2.getData5());
  	
  	System.out.println("\n========================================================\n");
  	
  	TestBean3 anno2 = atx.getBean("anno2", TestBean3.class);
  	System.out.println("anno2 : " + anno2);
  	System.out.println("anno2.number : " + anno2.getNumber());
  	System.out.println("anno2.name : " + anno2.getName());
  	System.out.println("anno2.data4 : " + anno2.getData4());
  	System.out.println("anno2.data5 : " + anno2.getData5());
  	
  	System.out.println("\n========================================================\n");
  	
  	atx.close();
    
  }
  
}


  
  
