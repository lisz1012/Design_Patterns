package com.lisz.abstractfactory;

public class MagicEquipmentFactory extends EquipmentFactory {

	@Override
	public Weapon createWeapon() {
		return new Wand();
	}

	@Override
	public Vehicle createVehicle() {
		return new Broom();
	}

	@Override
	public Food createFood() {
		return new Mushroom();
	}

}
