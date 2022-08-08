package com.gl.service;

public class Snippet {
	public Node node;
		static Node prevNode = null;
		static Node headNode = null;
	
		public void completeBSTtoSkewed(Node root) {
	
			if (root == null) {
				return;
			}
	
			completeBSTtoSkewed(root.left);
			Node rightNode = root.right;
			Node leftNode = root.left;
	
			if (headNode == null) {
				headNode = root;
				root.left = null;
				prevNode = root;
			} else {
				prevNode.right = root;
				root.left = null;
				prevNode = root;
			}
	
			completeBSTtoSkewed(rightNode);
	
		}
	
		public void traverseRightSkewedTree(Node root) {
			if (root == null) {
				return;
			}
			System.out.print(root.val + " ");
			traverseRightSkewedTree(root.right);
		}
	
}

