package com.lisz.state;

public class GirlSadState implements GirlState {

	@Override
	public void smile() {
		System.out.println("Smile sadly");
	}

	@Override
	public void cry() {
		System.out.println("Cry sadly");
	}

	@Override
	public void say() {
		System.out.println("say sth sadly");
	}

}
