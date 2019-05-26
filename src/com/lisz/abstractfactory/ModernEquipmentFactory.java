package com.lisz.abstractfactory;

import com.lisz.factory.Moveable;

public class ModernEquipmentFactory implements AbstractFactory {

	@Override
	public Weapon createWeapon() {
		return new AK47();
	}

	@Override
	public Moveable createVehicle() {
		return new Car();
	}

	@Override
	public Food createFood() {
		return new Bread();
	}

}
