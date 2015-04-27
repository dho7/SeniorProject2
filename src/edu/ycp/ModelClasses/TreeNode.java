package edu.ycp.ModelClasses;

//basic node structure for tree class
public class TreeNode {
	private TreeNode left;
	private TreeNode right;
	private TreeNode parent;
	private int value;
	
	public TreeNode getParent() {
		return parent;
	}

	public void setParent(TreeNode parent) {
		this.parent = parent;
	}	
	
	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public TreeNode(int value) {
		left = null;
		right = null;
		this.value = value;
		parent = null;
	}
	
}
