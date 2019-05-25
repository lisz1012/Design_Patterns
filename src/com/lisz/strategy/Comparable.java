package com.lisz.strategy;

@FunctionalInterface
public interface Comparable<T> {
	int compareTo(T t);
}