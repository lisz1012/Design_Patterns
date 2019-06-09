package com.lisz.observer;

import java.util.Date;

public class Mom implements WakeUpListener {

	@Override
	public void actionPerformed(WakeUpEvent<Baby> e) {
		System.out.println("My baby "  + e.getSource().getName() + " wakes up at " + new Date(e.getTimestamp()) + ", feeding my baby...");
	}

}
