package com.lisz.proxy.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.lisz.proxy.InvocationHandler;

public class TransactionHandler implements InvocationHandler {
	private Object target;
	
	public TransactionHandler(Object target) {
		super();
		this.target = target;
	}



	@Override
	public void invoke(Object obj, Method method) {
		System.out.println("Transaction started...");
		try {
			method.invoke(target);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
		System.out.println("Transaction ended...");
	}

}
