package com.lisz.singleton.lazy;

public class Plane {
	//volatile 避免指令重排带来的问题 
	private static volatile Plane INSTANCE = null;
	
	private Plane() {}
	
	public static Plane getInstance() {
		if (INSTANCE == null) {
			synchronized (Plane.class) {
				if (INSTANCE == null) {
					INSTANCE = new Plane();
				}
			}
		}
		return INSTANCE;
	}
}
