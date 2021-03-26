package com.tjoeun.spring.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tjoeun.spring.bean.TestBean1;
import com.tjoeun.spring.bean.TestBean2;
import com.tjoeun.spring.bean.TestBean3;
import com.tjoeun.spring.bean.TestBean4;
import com.tjoeun.spring.bean.TestBean5;
import com.tjoeun.spring.bean.TestBean6;
import com.tjoeun.spring.config.ConfigBean;

public class Main {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext atx = new AnnotationConfigApplicationContext(ConfigBean.class);
	
		System.out.println("==========================================================================");
		
		System.out.println();
		
		TestBean1 anno1 = atx.getBean("anno1", TestBean1.class);
		System.out.println("anno1 : " + anno1);
		
		System.out.println();
		
		TestBean2 anno2 = atx.getBean("anno2", TestBean2.class);
		System.out.println("anno2 : " + anno2);
		
		System.out.println();
		
		TestBean3 anno3 = atx.getBean("anno3", TestBean3.class);
		System.out.println("anno3 : " + anno3);
		System.out.println("anno3.data1 : " + anno3.getData1());
		System.out.println("anno3.data2 : " + anno3.getData2());
		
		System.out.println();
		
		TestBean4 anno4 = atx.getBean("anno4", TestBean4.class);
		System.out.println("anno4 : " + anno4);
		System.out.println("anno4.data1 : " + anno4.getData1());
		System.out.println("anno4.data2 : " + anno4.getData2());
		
		System.out.println();
		
		TestBean5 anno5 = atx.getBean("anno5", TestBean5.class);
		System.out.println("anno5 : " + anno5);
		System.out.println("anno5.data1 : " + anno5.getData1());
		System.out.println("anno5.data2 : " + anno5.getData2());
		
		System.out.println();
		
		TestBean6 anno6 = atx.getBean("anno6", TestBean6.class);
		System.out.println("anno6 : " + anno6);
		System.out.println("anno6.data1 : " + anno6.getData1111());
		System.out.println("anno6.data2 : " + anno6.getData2222());
		
		System.out.println();
		
		System.out.println("==========================================================================");
		
		atx.close();
	}

}
