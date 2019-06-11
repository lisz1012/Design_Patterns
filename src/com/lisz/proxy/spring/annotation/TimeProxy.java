package com.lisz.proxy.spring.annotation;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class TimeProxy {
	
	@Before("execution(void com.lisz.proxy.spring.annotation.Tank.move())")
	public void before() {
		System.out.println("Start ... " + System.currentTimeMillis());
	}
	
	@After("execution(void com.lisz.proxy.spring.annotation.Tank.move())")
	public void after() {
		System.out.println("Stop ... " + System.currentTimeMillis());
	}
}
