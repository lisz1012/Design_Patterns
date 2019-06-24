package com.lisz.state.homework;

public class CarRunningState extends AbstractCarState {

	@Override
	public boolean isOpenable() {
		return false;
	}

	@Override
	public boolean isCloseable() {
		return false;
	}

	@Override
	public boolean isRunnable() {
		return false;
	}

	@Override
	public boolean isStoppable() {
		return true;
	}
}
