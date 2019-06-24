package com.lisz.state.homework;

public class Car {
	public void open(CarState state) {
		state.open();
	}
	
	public void close(CarState state) {
			state.close();
	}
	
	public void run(CarState state) {
		state.run();
	}
	
	public void stop(CarState state) {
		state.stop();
	}
}
