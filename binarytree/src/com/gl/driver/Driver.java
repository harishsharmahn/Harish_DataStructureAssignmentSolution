package com.gl.driver;

import com.gl.service.Node;
import com.gl.service.Snippet;

public class Driver {

	public static void main(String[] args) {
		Snippet tree = new Snippet();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);

		Snippet bt= new Snippet();
		Node node1 = null;
		bt.completeBSTtoSkewed(node1);
		System.out.println("The resultant  output is :");
		Node headNode = null;
		bt.traverseRightSkewedTree(headNode);


	}

}
