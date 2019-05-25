package com.lisz.strategy;

public class Boy extends Person implements Comparable<Boy> {
	
	public Boy(int faceValue, double money, int personality) {
		super(faceValue, money, personality);
	}

	//先按照金钱，再按照颜值进行升序排列
	@Override
	public int compareTo(Boy b) {
		if (money < b.money) {
			return -1;
		} else if (money > b.money) {
			return 1;
		} else {
			if (faceValue < b.faceValue) {
				return -1;
			} else if (faceValue > b.faceValue) {
				return 1;
			} else {
				return 0;
			}
		}
	}

}
