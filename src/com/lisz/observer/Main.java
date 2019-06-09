package com.lisz.observer;

public class Main {

	public static void main(String[] args) {
		Baby baby = new Baby("Sophia");
		baby.addWakeUpListener(new Aunt());
		baby.addWakeUpListener(new Brother());
		baby.cry();
		
		/*
		 *  Sophia cries, ah...ah...ah!!!
			My baby Sophia wakes up, feeding my baby...
			My baby Sophia wakes up, play with my baby...
			Sophia wakes up, hugging...
			Sophia wakes up, ha ha ha...
		 */
	}

}
