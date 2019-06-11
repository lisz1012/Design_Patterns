package com.lisz.iterator;

public class ArrayList<E> implements Collection<E>{
	private static final int DEFAULT_LENGTH = 5;
	private int index = 0;
	private Object arr[] = new Object[DEFAULT_LENGTH];
	private int size = 0;
	
	public void add(E e) {
		if (index == arr.length) {
			Object arr2[] = new Object[arr.length * 2];
			for (int i = 0; i < arr.length; i++) {
				arr2[i] = arr[i];
			}
			arr = arr2;
		}
		arr[index++] = e;
		size ++;
	}
	
	public E get(int i) {
		return (E)arr[i];
	}
	
	public int size() {
		return size;
	}
	
	public static void main(String[] args) {
		Collection<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
