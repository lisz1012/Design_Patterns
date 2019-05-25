package com.lisz.strategy;

@FunctionalInterface
public interface Comparator<T> {
	int compare(T t1, T t2);
}
