package com.lisz.proxy.spring;

import java.util.Random;

public class Tank {
	public void move() {
		System.out.println("Tank is moving ....");
		try {
			Thread.sleep(new Random().nextInt(5000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
