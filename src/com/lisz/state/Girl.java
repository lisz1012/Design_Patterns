package com.lisz.state;

// Operation, 如smile, cry, say扩展的话不好用state模式
// State不会扩展的时候可以干脆就写switch，不搞这么麻烦
public class Girl {
	private String name;
	private GirlState state;
	
	public void smile() {
		state.smile();
	}
	
	public void cry() {
		state.cry();
	}
	
	public void say() {
		state.say();
	}
}
