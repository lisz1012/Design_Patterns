package com.lisz.singleton.innerclass;

public class Person {
	//类级内部类，只有被调用的时候才被初始化，实现了延迟加载
	private static class PersonHolder {
		private static final Person INSTANCE = new Person();
	}
	
	private Person(){}
	
	public Person getInstance() {
		return PersonHolder.INSTANCE;
	}
}
