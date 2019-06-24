package com.lisz.state.homework;

public class CarStoppedState extends AbstractCarState {

	@Override
	public boolean isOpenable() {
		return true;
	}

	@Override
	public boolean isCloseable() {
		return true;
	}

	@Override
	public boolean isRunnable() {
		return true;
	}

	@Override
	public boolean isStoppable() {
		return false;
	}
}
