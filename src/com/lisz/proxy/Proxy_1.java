package com.lisz.proxy;

import java.lang.reflect.Method;

public class Proxy_1 implements com.lisz.proxy.test.UserManager {
	private com.lisz.proxy.InvocationHandler handler;
	
	public Proxy_1(com.lisz.proxy.InvocationHandler handler) {
		super();
		this.handler = handler;
	}

	@Override
	public void addUser() {
		Method method = null;
		try {
			method = com.lisz.proxy.test.UserManager.class.getMethod("addUser");
			handler.invoke(this, method);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}

}