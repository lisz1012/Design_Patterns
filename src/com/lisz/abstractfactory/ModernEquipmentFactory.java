package com.lisz.abstractfactory;


public class ModernEquipmentFactory extends EquipmentFactory {

	@Override
	public Weapon createWeapon() {
		return new AK47();
	}

	@Override
	public Vehicle createVehicle() {
		return new Car();
	}

	@Override
	public Food createFood() {
		return new Bread();
	}

}
