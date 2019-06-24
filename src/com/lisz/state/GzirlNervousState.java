package com.lisz.state;

public class GzirlNervousState implements GirlState {

	@Override
	public void smile() {
		System.out.println("Smile nervously");
	}

	@Override
	public void cry() {
		System.out.println("Cry nervously");
	}

	@Override
	public void say() {
		System.out.println("Say sth nervously");
	}

}
