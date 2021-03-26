package com.tjoeun.spring.bean;

import javax.annotation.Resource;

public class TestBean6 {
	
	// 멤버변수(data1) 이름과 같은 이름의 Bean 이 주입됨
	
  //@Resource(name="data1")
	private DataBean1 data111;
	
	// 멤버변수(data2) 이름과 같은 이름의 Bean 이 주입됨
  //@Resource(name="data222")
	private DataBean2 data222;

	public DataBean1 getData111() {
		return data111;
	}

	public void setData111(DataBean1 data111) {
		this.data111 = data111;
	}

	public DataBean2 getData222() {
		return data222;
	}

	public void setData222(DataBean2 data222) {
		this.data222 = data222;
	}
	
	
}
