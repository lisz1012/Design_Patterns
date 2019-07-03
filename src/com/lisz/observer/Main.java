package com.lisz.observer;

public class Main {

	public static void main(String[] args) {
		Baby baby = new Baby("Sophia");
		baby.addWakeUpListener(new Aunt()); // 注册Aunt作为一个Listener，baby醒来可能在另外一个线程中触发，所以可能是异步
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
