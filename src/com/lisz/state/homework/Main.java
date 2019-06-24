package com.lisz.state.homework;

public class Main {

	public static void main(String[] args) {
		Car car = new Car();
		CarState s1 = new CarOpenState();
		CarState s2 = new CarClosedState();
		CarState s3 = new CarRunningState();
		CarState s4 = new CarStoppedState();
		
		car.open(s1);
		car.close(s1);
		car.run(s1);
		car.stop(s1);
		System.out.println("-------------------");
		
		car.open(s2);
		car.close(s2);
		car.run(s2);
		car.stop(s2);
		System.out.println("-------------------");
		
		car.open(s3);
		car.close(s3);
		car.run(s3);
		car.stop(s3);
		System.out.println("-------------------");
		
		car.open(s4);
		car.close(s4);
		car.run(s4);
		car.stop(s4);
		System.out.println("-------------------");
	}

}
