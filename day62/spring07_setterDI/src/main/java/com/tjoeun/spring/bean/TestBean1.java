package com.tjoeun.spring.bean;

public class TestBean1 {
	
	private int dataI;
	private double dataD;
	private String dataS;
	private Person person1;
	private Person person2;
	
	public Person getPerson1() {
		return person1;
	}

	public Person getPerson2() {
		return person2;
	}

	public void setPerson2(Person person2) {
		this.person2 = person2;
	}

	public void setPerson1(Person person) {
		this.person1 = person;
	}

	public int getDataI() {
		return dataI;
	}

	public void setDataI(int dataI) {
		this.dataI = dataI;
	}

	public double getDataD() {
		return dataD;
	}

	public void setDataD(double dataD) {
		this.dataD = dataD;
	}

	public String getDataS() {
		return dataS;
	}

	public void setDataS(String dataS) {
		this.dataS = dataS;
	}

	@Override
	public String toString() {
		return dataI + " -- " + dataD + " -- " + dataS + " -- " + person1 + " -- " + person2;
	}
}
