package com.lisz.strategy.observer;

public class Aunt implements WakeUpListener {

	@Override
	public void actionPerformed(WakeUpEvent<Baby> e) {
		System.out.println(e.getSource().getName() + " wakes up, hugging...");
	}

}
