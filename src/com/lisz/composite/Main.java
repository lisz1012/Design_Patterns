package com.lisz.composite;

public class Main {

	public static void main(String[] args) {
		BranchNode root = new BranchNode("Root");
		BranchNode chap1 = new BranchNode("Chapter1");
		BranchNode chap2 = new BranchNode("Chapter1");
		BranchNode sec1 = new BranchNode("Section1");
		LeafNode article1 = new LeafNode("Article1");
		LeafNode article2 = new LeafNode("Article2");
		LeafNode article3 = new LeafNode("Article3");
		LeafNode article4 = new LeafNode("Article4");
		
		root.add(chap1).add(chap2);
		chap1.add(article1).add(article2);
		chap2.add(sec1.add(article3).add(article4));
		
		tree(root, 0);
	}

	private static void tree(Node node, int level) {
		for (int i = 0; i < level; i++) {
			System.out.print("      ");
		}
		System.out.println(node.name);
		if (node.isLeaf()) {
			return;
		}
		
		BranchNode branchNode = (BranchNode)node;
		branchNode.getSubNodes().forEach(n->{
			tree(n, level + 1);
		});
	}

}
