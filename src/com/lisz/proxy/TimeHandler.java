package com.lisz.proxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler {
	private Object target;
	
	public TimeHandler(Object target) {
		this.target = target;
	}

	@Override
	public void invoke(Object o, Method method) {
		long start = System.currentTimeMillis();
		System.out.println("Start at: " + start);
		System.out.println(o.getClass().getName());
		try {
			method.invoke(target, new Object[]{});
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
		System.out.println("Running time: " + (System.currentTimeMillis() - start));
	}

}
