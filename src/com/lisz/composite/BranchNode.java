package com.lisz.composite;

import java.util.ArrayList;
import java.util.List;

public class BranchNode extends Node {
	private final boolean leaf = false;
	private final List<Node> subNodes = new ArrayList<>();

	public BranchNode(String name) {
		this.name = name;
	}
	
	public boolean isLeaf() {
		return leaf;
	}
	
	public BranchNode add(Node node) {
		subNodes.add(node);
		return this;
	}
	
	public List<Node> getSubNodes() {
		return subNodes;
	}
}
