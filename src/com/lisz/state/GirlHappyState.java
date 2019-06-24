package com.lisz.state;

public class GirlHappyState implements GirlState {

	@Override
	public void smile() {
		System.out.println("Smile happily");
	}

	@Override
	public void cry() {
		System.out.println("Cry happily");
	}

	@Override
	public void say() {
		System.out.println("Say sth happily");
	}

}
