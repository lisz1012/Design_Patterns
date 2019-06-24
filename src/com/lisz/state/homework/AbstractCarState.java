package com.lisz.state.homework;

public abstract class AbstractCarState implements CarState {

	@Override
	public void open() {
		if (isOpenable()) {
			openImpl();
		}
	}

	@Override
	public void close() {
		if (isCloseable()) {
			closeImpl();
		}
	}
	

	@Override
	public void run() {
		if (isRunnable()) {
			runImpl();
		}
	}

	
	@Override
	public void stop() {
		if (isStoppable()) {
			stopImpl();
		}
	}
	
	protected void openImpl() {
		System.out.println("Open the door!");
	}

	protected void closeImpl() {
		System.out.println("Close the door!");
	}

	protected void runImpl() {
		System.out.println("Run the car!");
	}

	protected void stopImpl() {
		System.out.println("Stop the car!");
	}
}
