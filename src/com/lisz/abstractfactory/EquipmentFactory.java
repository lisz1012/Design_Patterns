package com.lisz.abstractfactory;


public interface EquipmentFactory {
	Weapon createWeapon();
	Vehicle createVehicle();
	Food createFood();
}
