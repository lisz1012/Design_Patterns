package com.lisz.abstractfactory;

import com.lisz.factory.Moveable;

public interface AbstractFactory {
	Weapon createWeapon();
	Moveable createVehicle();
	Food createFood();
}
