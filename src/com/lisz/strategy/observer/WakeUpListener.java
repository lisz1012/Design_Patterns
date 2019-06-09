package com.lisz.strategy.observer;

public interface WakeUpListener {
	void actionPerformed(WakeUpEvent<Baby> e);
}
