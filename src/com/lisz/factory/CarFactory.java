package com.lisz.factory;

public class CarFactory implements MoveableFactory {

	@Override
	public Moveable create() {
		System.out.println("Car is being created...");
		return new Car();
	}

}
