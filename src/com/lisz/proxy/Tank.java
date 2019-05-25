package com.lisz.proxy;

import java.util.Random;

public class Tank implements Moveable {

	@Override
	public void move() {
		System.out.println("Tank moving...");
		try {
			Thread.sleep(new Random().nextInt(10000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
