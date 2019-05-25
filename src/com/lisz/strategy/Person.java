package com.lisz.strategy;

public class Person {
	protected int faceValue;
	protected double money;
	protected int character; //人品：character，not the class java.lang.Character
	
	
	public Person(int faceValue, double money, int character) {
		this.faceValue = faceValue;
		this.money = money;
		this.character = character;
	}

	public int getFaceValue() {
		return faceValue;
	}

	public double getMoney() {
		return money;
	}

	public int getCharacter() {
		return character;
	}
	
	@Override
	public String toString() {
		return faceValue + "|" + money + "|" + character;
	}
}
