package com.lisz.strategy.observer;

public class Mom implements WakeUpListener {

	@Override
	public void actionPerformed(WakeUpEvent<Baby> e) {
		System.out.println("My baby "  + e.getSource().getName() + " wakes up, feeding my baby...");
	}

}
