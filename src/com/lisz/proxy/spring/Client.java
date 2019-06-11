package com.lisz.proxy.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
		Tank tank = (Tank)context.getBean("tank");
		tank.move();
	}

}
