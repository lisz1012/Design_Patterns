package com.lisz.singleton.eager;

public class Dog {
	private static final Dog INSTANCE = new Dog();
	
	private Dog() {}
	
	public static Dog getInstance() {
		return INSTANCE;
	}
}
