package com.lisz.strategy.observer;

public class Main {

	public static void main(String[] args) {
		Baby baby = new Baby("Sophia");
		baby.addWakeUpListener(new Dad());
		baby.addWakeUpListener(new Mom());
		baby.cry();
	}

}
