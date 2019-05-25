package com.lisz.proxy;

public class TankTimeProxy implements Moveable {
	private Moveable m;
	
	public TankTimeProxy(Moveable m) {
		super();
		this.m = m;
	}

	@Override
	public void move() {
		long start = System.currentTimeMillis();
		m.move();
		System.out.println("Time: " + (System.currentTimeMillis() - start));
	}

}
