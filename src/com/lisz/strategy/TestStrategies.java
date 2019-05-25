package com.lisz.strategy;

import org.junit.Test;

public class TestStrategies {
	
	// Boy自己的排序方法，先按照钱排，钱一样按颜值排序
	@Test
	public void testCompareBoys() {
		Boy b1 = new Boy(60, 100, 30);
		Boy b2 = new Boy(30, 200, 40);
		Boy b3 = new Boy(98, 130, 10);
		Boy b4 = new Boy(80, 30, 98);
		Boy b5 = new Boy(20, 10000, 50);
		Boy b6 = new Boy(75, 130, 30);
		Boy boys[] = {b1,b2,b3,b4,b5,b6};
		
		Sorter sorter = new Sorter();
		sorter.selectionSort(boys);
		for (Boy boy : boys) {
			System.out.println(boy);
		}
	}

	// 按人品降序排序
	@Test
	public void testCompareBoys2() {
		Boy b1 = new Boy(60, 100, 30);
		Boy b2 = new Boy(30, 200, 40);
		Boy b3 = new Boy(98, 130, 10);
		Boy b4 = new Boy(80, 30, 98);
		Boy b5 = new Boy(20, 10000, 50);
		Boy b6 = new Boy(75, 130, 30);
		Boy boys[] = {b1,b2,b3,b4,b5,b6};
		
		Sorter sorter = new Sorter();
		sorter.selectionSort(boys, new Comparator<Boy>() {
			@Override
			public int compare(Boy b1, Boy b2) {
				if (b1.getPersonality() < b2.getPersonality()) {
					return 1;
				} else if (b1.getPersonality() > b2.getPersonality()) {
					return -1;
				} else {
					return 0;
				}
			}
		});
		for (Boy boy : boys) {
			System.out.println(boy);
		}
	}
	
	//按钱降序排序
	@Test
	public void testCompareBoys3() {
		Boy b1 = new Boy(60, 100, 30);
		Boy b2 = new Boy(30, 200, 40);
		Boy b3 = new Boy(98, 130, 10);
		Boy b4 = new Boy(80, 30, 98);
		Boy b5 = new Boy(20, 10000, 50);
		Boy b6 = new Boy(75, 130, 30);
		Boy boys[] = {b1,b2,b3,b4,b5,b6};
		
		Sorter sorter = new Sorter();
		sorter.selectionSort(boys, (o1, o2) -> {
			if (o1.getMoney() < o2.getMoney()) {
				return 1;
			} else if (o1.getMoney() > o2.getMoney()) {
				return -1;
			} else {
				return 0;
			}
		});
		for (Boy boy : boys) {
			System.out.println(boy);
		}
	}
	
	@Test
	public void testCompareGirls() {
		Girl b1 = new Girl(60, 100, 30);
		Girl b2 = new Girl(30, 200, 40);
		Girl b3 = new Girl(98, 130, 10);
		Girl b4 = new Girl(80, 30, 98);
		Girl b5 = new Girl(20, 10000, 50);
		Girl b6 = new Girl(75, 130, 30);
		Girl girls[] = {b1,b2,b3,b4,b5,b6};
		
		Sorter sorter = new Sorter();
		sorter.selectionSort(girls, new Comparator<Girl>() {
			@Override
			public int compare(Girl b1, Girl b2) {
				if (b1.getPersonality() < b2.getPersonality()) {
					return 1;
				} else if (b1.getPersonality() > b2.getPersonality()) {
					return -1;
				} else {
					return 0;
				}
			}
		});
		for (Girl girl : girls) {
			System.out.println(girl);
		}
	}
}
