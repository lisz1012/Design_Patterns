package com.lisz.proxy;

public class Client {
	// 出现找不到类错误的时候刷新整个项目文件夹
	public static void main(String[] args) throws Exception {
		Tank tank = new Tank();
		InvocationHandler handler = new TimeHandler(tank);
		Moveable m = (Moveable)Proxy.newProxyInstance(Moveable.class, handler);
		m.move();
	}

}
