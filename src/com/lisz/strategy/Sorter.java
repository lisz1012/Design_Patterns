package com.lisz.strategy;

public class Sorter {
	
	public <T> void selectionSort(T arr[], Comparator<T> comparator) {
		if (arr == null || arr.length <= 1) {
			return;
		}
		
		for (int i = 0; i < arr.length; i++) {
			T min = arr[i];
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (comparator.compare(arr[j], min) < 0) {
					min = arr[j];
					minIndex = j;
				}
			}
			swap(arr, i, minIndex);
		}
	}
	
	public <T> void selectionSort(Comparable<T>[] comparables) {
		if (comparables == null || comparables.length <= 1) {
			return;
		}
		
		for (int i = 0; i < comparables.length; i++) {
			Comparable<T> min = comparables[i];
			int minIndex = i;
			for (int j = i + 1; j < comparables.length; j++) {
				if (comparables[j].compareTo((T) min) < 0) {
					min = comparables[j];
					minIndex = j;
				}
			}
			swap(comparables, i, minIndex);
		}
	}

	private <T> void swap(T[] persons, int i, int j) {
		T temp = persons[i];
		persons[i]=  persons[j];
		persons[j] = temp;
	}
}
