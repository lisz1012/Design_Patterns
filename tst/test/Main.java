package test;

import java.util.Comparator;

import org.junit.Test;

public class Main {
	private Comparator<Integer> comparator1 = new MyComparator1();
	private Comparator<Integer> comparator2 = new MyComparator2();
	
	@Test
	public void testIntegerAotoBoxing1() {
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		System.out.println(comparator1.compare(i1, i2));
	}
	
	@Test
	public void testIntegerAotoBoxing2() {
		Integer i1 = new Integer(10000);
		Integer i2 = new Integer(10000);
		System.out.println(comparator1.compare(i1, i2));
	}
	
	@Test
	public void testIntegerAotoBoxing3() {
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		System.out.println(comparator2.compare(i1, i2));
	}
	
	@Test
	public void testIntegerAotoBoxing4() {
		Integer i1 = new Integer(10000);
		Integer i2 = new Integer(10000);
		System.out.println(comparator2.compare(i1, i2));
	}
}

class MyComparator1 implements Comparator<Integer> {
	@Override
	public int compare(Integer i1, Integer i2) {
		if (i1 == i2) {
			return 0;
		}
		return i1 < i2 ? 1 : -1;
	}
}

class MyComparator2 implements Comparator<Integer> {
	@Override
	public int compare(Integer i1, Integer i2) {
		if (i1.equals(i2)) {
			return 0;
		}
		return i1 < i2 ? 1 : -1;
	}
}
