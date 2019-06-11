package com.lisz.proxy.spring;

public class TimeProxy {
	public void before() {
		System.out.println("Start ... " + System.currentTimeMillis());
	}
	
	public void after() {
		System.out.println("Stop ... " + System.currentTimeMillis());
	}
}
