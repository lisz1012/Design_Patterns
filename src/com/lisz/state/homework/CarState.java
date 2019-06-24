package com.lisz.state.homework;

public interface CarState {
	void open();
	void close();
	void run();
	void stop();
	boolean isOpenable();
	boolean isCloseable();
	boolean isRunnable();
	boolean isStoppable();
}
