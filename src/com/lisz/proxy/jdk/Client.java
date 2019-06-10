package com.lisz.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Client {

	public static void main(String[] args) {
		Car car = new Car();
		Moveable proxy = (Moveable)Proxy.newProxyInstance(Car.class.getClassLoader(), new Class[]{Moveable.class}, new LogHandler(car));
		proxy.move();
		/*
		   Car starts ... 
		   Car is moving ... 
		   Car stops ... 
		 */
	}

}

class LogHandler implements InvocationHandler {
	private Moveable m;
	
	public LogHandler(Moveable m) {
		super();
		this.m = m;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("Car starts ... ");
		Object o = method.invoke(m, args);
		System.out.println("Car stops ... ");
		return o;
	}
	
}
