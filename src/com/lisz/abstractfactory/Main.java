package com.lisz.abstractfactory;


public class Main {
	public static void main(String[] args) {
		/*Car c = new Car();
		c.go();
		AK47 ak47 = new AK47();
		ak47.shoot();
		Bread bread = new Bread();
		bread.printName();*/
		
		// If we would like to change the series of the equipments, only change the factory here.
		EquipmentFactory equipmentFactory = new MagicEquipmentFactory();
		
		// The lines below don't need change
		Vehicle v = equipmentFactory.createVehicle();
		Weapon w = equipmentFactory.createWeapon();
		Food f = equipmentFactory.createFood();
		
		v.go();
		w.shoot();
		f.printName();
	}
}
