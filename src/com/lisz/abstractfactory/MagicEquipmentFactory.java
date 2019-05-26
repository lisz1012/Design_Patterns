package com.lisz.abstractfactory;

import com.lisz.factory.Moveable;

public class MagicEquipmentFactory implements AbstractFactory {

	@Override
	public Weapon createWeapon() {
		return new Wand();
	}

	@Override
	public Moveable createVehicle() {
		return new Broom();
	}

	@Override
	public Food createFood() {
		return new Mushroom();
	}

}
