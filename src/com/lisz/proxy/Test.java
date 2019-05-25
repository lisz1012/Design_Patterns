package com.lisz.proxy;

import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) {
		Method method = null;
		try {
			method = Test.class.getMethod("ooo");
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}

}
