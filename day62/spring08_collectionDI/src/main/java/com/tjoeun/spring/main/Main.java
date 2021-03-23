package com.tjoeun.spring.main;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tjoeun.spring.bean.Person;
import com.tjoeun.spring.bean.TestBean1;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/tjoeun/spring/config/beans.xml");

		/*
		 * List<String> listString = new ArrayList<String>();
		 * 
		 * listString.add("hello"); listString.add("spring"); listString.add("java");
		 */

		/*
		 * TestBean1 test1 = new TestBean1(); test1.setListString(listString);
		 * List<String> list = test1.getListString();
		 */
		
		TestBean1 test1 = ctx.getBean("test1", TestBean1.class);
		List<String> listStr = test1.getListString();
		List<Integer> listInt = test1.getListInteger();
		List<Person> listPer = test1.getListPerson();
		
		Set<String> setStr = test1.getSetString();
		Set<Integer> setInt = test1.getSetInteger();
		Set<Person> setPer = test1.getSetPerson();
		
		Map<String, Object> mapResult = test1.getMap();
		
		String m1 = (String)mapResult.get("map1");
		Integer m2 = (Integer)mapResult.get("map2");
		Person m3 = (Person) mapResult.get("map3");
		Person m4 = (Person) mapResult.get("map4");
		List<String> m5 = (List<String>)mapResult.get("map5");
		
		Properties prop1 = test1.getProper1();
		String subj1 = prop1.getProperty("subject1");
		String subj2 = prop1.getProperty("subject2");
		String subj3 = prop1.getProperty("subject3");
		
		System.out.println(subj1);
		System.out.println(subj2);
		System.out.println(subj3);
		
		System.out.println("==================================================");
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		System.out.println(m5);
		
		for(String str : m5) {
			System.out.println(str);
		}
		
		System.out.println("==================================================");
		
		for(String str : listStr) {
			System.out.println(str);
		}
		
		for(Integer inte : listInt) {
			System.out.println(inte);
		}
		
		for(Person per : listPer) {
			System.out.println(per);
		}
		
		System.out.println("==================================================");
		
		for(String str : setStr) {
			System.out.println(str);
		}
		
		for(Integer inte : setInt) {
			System.out.println(inte);
		}
		
		for(Person per : setPer) {
			System.out.println(per);
		}
		
		
		
		ctx.close();
	}

}
