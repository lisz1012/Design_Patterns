package com.lisz.factory;

public class Main {
	public static void main(String[] args) {
		Moveable m = new CarFactory().createCar();//new Car();
		m.go();
	}
}
