package com.lisz.composite;

public class LeafNode extends Node {
	private final boolean leaf = true;
	
	public LeafNode(String name) {
		this.name = name;
	}
	
	public boolean isLeaf() {
		return leaf;
	}
}
