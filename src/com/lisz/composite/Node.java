package com.lisz.composite;

public abstract class Node {
	protected String name;
	
	void print() {
		System.out.println(name);
	}
	
	public abstract boolean isLeaf();
}
