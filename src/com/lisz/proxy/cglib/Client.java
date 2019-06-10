package com.lisz.proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

// cglib的底层用的也是asm
public class Client {

	public static void main(String[] args) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(Truck.class);
		enhancer.setCallback(new LogInterceptor());
		Truck truck = (Truck)enhancer.create();
		truck.move();
	}
}

class LogInterceptor implements MethodInterceptor {

	@Override
	public Object intercept(Object o, Method arg1, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println(o.getClass().getSuperclass().getName());//com.lisz.proxy.cglib.Truck 代理类是Truck的子类，所以Truck是final的就不行了，但asm可以
		System.out.println("Before ... ");
		//System.out.println(o); //打印这个o对象会报异常Exception in thread "main" java.lang.StackOverflowError
		Object ret = methodProxy.invokeSuper(o, objects);
		System.out.println("After ...");
		return ret;
		
	}
	
}