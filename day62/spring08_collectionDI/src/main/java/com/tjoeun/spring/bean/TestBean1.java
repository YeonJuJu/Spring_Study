package com.tjoeun.spring.bean;


import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class TestBean1 {
	
	private List<String> listString;
	private List<Integer> listInteger;
	private List<Person> listPerson;
	
	private Set<String> setString;
	private Set<Integer> setInteger;
	private Set<Person> setPerson;
	
	private Map<String, Object> map;
	
	private Properties proper1;
	
	public Properties getProper1() {
		return proper1;
	}

	public void setProper1(Properties proper1) {
		this.proper1 = proper1;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public Set<String> getSetString() {
		return setString;
	}

	public void setSetString(Set<String> setString) {
		this.setString = setString;
	}

	public Set<Integer> getSetInteger() {
		return setInteger;
	}

	public void setSetInteger(Set<Integer> setInteger) {
		this.setInteger = setInteger;
	}

	public Set<Person> getSetPerson() {
		return setPerson;
	}

	public void setSetPerson(Set<Person> setPerson) {
		this.setPerson = setPerson;
	}

	public List<Person> getListPerson() {
		return listPerson;
	}

	public void setListPerson(List<Person> listPerson) {
		this.listPerson = listPerson;
	}

	public List<Integer> getListInteger() {
		return listInteger;
	}

	public void setListInteger(List<Integer> listInteger) {
		this.listInteger = listInteger;
	}

	public List<String> getListString() {
		return listString;
	}

	public void setListString(List<String> listString) {
		this.listString = listString;
	}

}
