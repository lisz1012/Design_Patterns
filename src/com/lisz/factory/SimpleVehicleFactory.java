package com.lisz.factory;

//简单工厂的可扩展性不好
public class SimpleVehicleFactory {
	public Car createCar() {
		// Before processing
		return new Car();
	}
	
	public Broom createBroom() {
		// Before processing
		return new Broom();
	}
}
