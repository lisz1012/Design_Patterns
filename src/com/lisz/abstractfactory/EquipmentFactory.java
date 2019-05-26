package com.lisz.abstractfactory;


public abstract class EquipmentFactory {
	abstract Weapon createWeapon();
	abstract Vehicle createVehicle();
	abstract Food createFood();
}
