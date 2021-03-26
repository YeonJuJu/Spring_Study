package com.tjoeun.spring.bean;

import javax.annotation.Resource;

public class TestBean6 {
	
	//멤버변수 이름과 같은 이름의 Bean이 주입됨
	@Resource(name="data1")
	private DataBean1 data1111;
	
	//"data222"로 된거 없기 떄문에 다음 문장으로 하면 오류발생
	//	@Resource(name="data222")
	@Resource(name="data2")
	private DataBean2 data2222;

	public DataBean1 getData1111() {
		return data1111;
	}
	public void setData1111(DataBean1 data1111) {
		this.data1111 = data1111;
	}
	public DataBean2 getData2222() {
		return data2222;
	}
	public void setData2222(DataBean2 data2222) {
		this.data2222 = data2222;
	}

}
