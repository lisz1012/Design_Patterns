package com.lisz.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bullet {
	private boolean live = true;
	private static final List<Bullet> BULLET_POOL = new ArrayList<>();
	static {
		for (int i = 0; i < 10; i++) {
			BULLET_POOL.add(new Bullet());
		}
	}

	public Bullet() {}
	
	public boolean isLive() {
		return live;
	}

	public void setLive(boolean live) {
		this.live = live;
	}
	
	public static Bullet getInstance() {
		for (Bullet bullet : BULLET_POOL) {
			if (!bullet.isLive()) {
				bullet.setLive(true);
				return bullet;
			}
		}
		Bullet bullet = new Bullet();
		System.out.println("Creating a new bullet...");
		return bullet;
	}
	
	public static void removeABullet() {
		int ran = new Random().nextInt(BULLET_POOL.size());
		BULLET_POOL.get(ran).setLive(false);
	}
}
