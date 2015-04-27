package edu.ycp.ModelClasses;

public class Tree {
	private TreeNode root;
	
	public TreeNode getRoot() {
		return root;
	}

	public void insert(int value) {
		if(root == null) {
			root = new TreeNode(value);
		}
		else {
			insertNode(root, value);
		}
	}
	
	public TreeNode insertNode(TreeNode node, int value) {
		TreeNode newNode = new TreeNode(value);		
		
		if(node == null){
			node = newNode;
		}
		else if(value < node.getValue()) {
			node.setLeft(insertNode(node.getLeft(), value)); 
		}
		else {
			node.setRight(insertNode(node.getRight(), value));
		}
		return node;
	}
	
	public boolean deleteNote(int value) {
		//TODO: implement
		return false;
	}
	
	public TreeNode findNode(TreeNode node, int value) {
		if(node == null || node.getValue() == value) {
			return node;
		}
		else if(value < node.getValue()) {
			return findNode(node.getLeft(), value);
		}
		else {
			return findNode(node.getRight(), value);
		}		
	}
	
	public TreeNode findMinNode(TreeNode node) {
		if(node.getLeft() == null) {
			return node;
		}
		else {
			return findMinNode(node.getLeft());
		}
	}
	
	public TreeNode findMaxNode(TreeNode node) {
		if(node.getRight() == null) {
			return node;
		}
		else {
			return findMaxNode(node.getRight());
		}
	}
	
	public TreeNode breadthFirstSearch(int value) {
		return null;
	}
	
	public TreeNode depthFirstSearch(int value) {
		return null;
	}
	
	public Tree() {
		root = null;
	}
	
}

