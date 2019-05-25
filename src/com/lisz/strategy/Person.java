package com.lisz.strategy;

public class Person {
	protected int faceValue;
	protected double money;
	protected int personality;
	
	public Person(int faceValue, double money, int personality) {
		this.faceValue = faceValue;
		this.money = money;
		this.personality = personality;
	}

	public int getFaceValue() {
		return faceValue;
	}

	public double getMoney() {
		return money;
	}

	public int getPersonality() {
		return personality;
	}
	
	@Override
	public String toString() {
		return faceValue + "|" + money + "|" + personality;
	}
}
