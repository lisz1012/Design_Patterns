package com.lisz.state.homework;

public class CarOpenState extends AbstractCarState {

	@Override
	public boolean isOpenable() {
		return false;
	}

	@Override
	public boolean isCloseable() {
		return true;
	}

	@Override
	public boolean isRunnable() {
		return false;
	}

	@Override
	public boolean isStoppable() {
		return false;
	}
}
