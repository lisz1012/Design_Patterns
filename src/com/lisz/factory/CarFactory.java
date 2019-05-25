package com.lisz.factory;

public class CarFactory {
	public Car createCar() {
		// Log
		System.out.println("Car is being created!");
		return new Car();
	}
}
