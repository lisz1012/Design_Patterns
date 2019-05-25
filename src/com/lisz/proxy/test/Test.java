package com.lisz.proxy.test;

import com.lisz.proxy.InvocationHandler;
import com.lisz.proxy.Proxy;

public class Test {

	public static void main(String[] args) throws Exception {
		UserManager userManager = new UserManagerImpl();
		InvocationHandler handler = new TransactionHandler(userManager);
		UserManager u = (UserManager)Proxy.newProxyInstance(UserManager.class, handler);
		u.addUser();
	}

}
