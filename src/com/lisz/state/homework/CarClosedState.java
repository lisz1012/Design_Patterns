package com.lisz.state.homework;

public class CarClosedState extends AbstractCarState {

	@Override
	public boolean isOpenable() {
		return true;
	}

	@Override
	public boolean isCloseable() {
		return false;
	}

	@Override
	public boolean isRunnable() {
		return true;
	}

	@Override
	public boolean isStoppable() {
		return true;
	}
}
