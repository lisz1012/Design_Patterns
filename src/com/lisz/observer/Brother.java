package com.lisz.observer;

public class Brother implements WakeUpListener {

	@Override
	public void actionPerformed(WakeUpEvent<Baby> e) {
		System.out.println(e.getSource().getName() + " wakes up, ha ha ha...");
	}

}
