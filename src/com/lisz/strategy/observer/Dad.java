package com.lisz.strategy.observer;

public class Dad implements WakeUpListener {

	@Override
	public void actionPerformed(WakeUpEvent<Baby> e) {
		System.out.println("My baby " + e.getSource().getName() + " wakes up at " + e.getLocation() + ", play with my baby...");
	}

}
