package treeTraversal;

import java.util.Stack;

public class Solution {

	public void inorderTraversalRecursive(Node root) {

		if (root != null) {
			inorderTraversalRecursive(root.left);
			print(root.data);
			inorderTraversalRecursive(root.right);

		}
	}

	public Integer sizeOfTree(Node root) {
		Integer count = new Integer(0);
		Stack<Node> s1 = new Stack<Node>();
		while (true) {
			while (root != null) {
				s1.push(root);
				count++;
				root = root.left;
			}
			if (s1.isEmpty() == true) {
				break;
			}
			root = s1.pop();
			root = root.right;
		}

		return count;

	}

	public void preorderTraversalRecursive(Node root) {
		if (root != null) {
			preorderTraversalRecursive(root.left);
			preorderTraversalRecursive(root.right);
			print(root.data);


		}
	}
	public void postorderTraversalRecursive(Node root) {
		if (root != null) {
			postorderTraversalRecursive(root.left);
			postorderTraversalRecursive(root.right);

		}
	}

	public static void print(Integer data) {

		System.out.println(data.toString());
	}

	public static void print(String data) {

		System.out.println(data);
	}
	public void postOrderTraversal(Node root) {
		Stack<Node> s1 = new Stack<Node>();
		Stack<Node> s2 = new Stack<Node>();
		s1.push(root);
		while (s1.isEmpty() != true) {
			// System.out.println("Entering loop");
			Node temp = s1.pop();
			// System.out.println("pushed:" + temp.data);
			s2.push(temp);
			if (temp.left != null) {
				s1.push(temp.left);
			}
			if (temp.right != null) {
				s1.push(temp.right);
			}

		}
		System.out.println("Post Order");
		while (s2.isEmpty() != true) {
			Node temp = s2.pop();
			System.out.println(temp.data);

		}

	}

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(5);
		root.left.parent = root;
		root.right = new Node(15);
		root.right.parent = root;

		root.left.left = new Node(11);
		root.left.left.parent = root.left;
		root.left.right = new Node(12);
		root.left.right.parent = root.left;

		root.left.right.left = new Node(6);
		root.left.right.left.parent = root.left.right;

		root.right.right = new Node(8);
		root.right.right.parent = root.right;
		root.right.right.left = new Node(5);
		root.right.right.left.parent = root.right.right;

		Solution s = new Solution();
		s.postOrderTraversal(root);
		// s.inorderTraversalRecursive(root);
		// s.preorderTraversalRecursive(root);
		s.postOrderTraversal(root);
		print("Size");
		System.out.println(s.sizeOfTree(root));

	}

}

class Node {
	int data;
	Node left;
	Node right;
	Node parent;

	public Node(int data) {
		this.data = data;
	}

}
