package com.lisz.singleton.lazy;

//懒汉1
public class Car {
	private static Car INSTANCE = null;

	private Car() {}
	
	public synchronized static Car getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Car();
		}
		return INSTANCE;
	}
}
