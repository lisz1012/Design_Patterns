package com.lisz.factory;

public class Main {
	public static void main(String[] args) {
		MoveableFactory factory = new CarFactory();
		Moveable m = factory.create();//new Car();
		m.go();
	}
}
