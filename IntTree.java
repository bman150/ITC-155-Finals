// Written on 6/12/2020

// An IntTree object represents an entire binary tree of int's.
public class IntTree {
	private IntTreeNode overallRoot; // null for an empty tree
	/*
	 * constructor methods
	 */
	//constructs a sequential tree with given number of nodes
	// if max < 0, throws IllegalArgumentException
	public IntTree(int max) {
		if (max < 0) {
			throw new IllegalArgumentException("max:" + max);
		}
		overallRoot = buildTree(1, max);
	}
	// returns a sequential tree with n as its root unless n is
	// greater than max, in which case it returns an empty tree
	private IntTreeNode buildTree(int n, int max) {
		if (n > max) {
			return null;
		} else {
			return new IntTreeNode(n, buildTree(2 * n, max), buildTree(2 * n + 1, max));
			// OR use following code:
			//IntTreeNode left = buildTree(2 * n, max);  // variable for left subtree
			//IntTreeNode right = buildTree(2 * n + 1, max); // variable for right subtree
			//return new IntTreeNode(n, left, right);
		}
	}
	
	/*
	 * methods that traverse and/or print the binary tree to console
	 */
	
	// prints the tree contents using a preorder traversal
	public void printPreorder() {
		System.out.print("preorder:");
		printPreorder(overallRoot); // call private void printPreorder(IntTreeNode root) method
		System.out.println();
	}
	// prints in preorder the tree with given root
	private void printPreorder(IntTreeNode root) {
		if (root != null) {
			System.out.print(" " + root.data);
			printPreorder(root.left);  // recursive method prints left subtree in a preorder manner
			printPreorder(root.right); // recursive method prints right subtree in a preorder manner
		}
	}
	
	// prints the tree contents using an inorder traversal
	public void printInorder() {
		System.out.print("inorder:");
		printInorder(overallRoot); // call private void printInorder(IntTreeNode root) method
		System.out.println();
	}
	// prints in inorder the tree with given root
	private void printInorder(IntTreeNode root) {
		if (root != null) {
			printInorder(root.left); // recursive method prints left subtree in an inorder manner
			System.out.print(" " + root.data);
			printInorder(root.right); // recursive method prints right subtree in an inorder manner
		}
	}
	
	// prints the tree contents using a postorder traversal
	public void printPostorder() {
		System.out.print("postorder:");
		printPostorder(overallRoot); // call private void printPostorder(IntTreeNode root) method
		System.out.println();
	}
	// prints in postorder the tree with given root
	private void printPostorder(IntTreeNode root) {
		if (root != null) {
			printPostorder(root.left);  // recursive method prints left subtree in a postorder manner
			printPostorder(root.right); // recursive method prints right subtree in a postorder manner
			System.out.print(" " + root.data);
		}
	}
	
	// Prints the tree contents, one per line, following an
	// inorder traversal and using indentation to indicate
	// node depth; prints right to left so that is looks
	// correct when the output is rotated.
	public void printSideways() {
		printSideways(overallRoot, 0);
	}
	// Prints in reversed preorder the tree with given
	// root, indenting each line to the given level.
	private void printSideways(IntTreeNode root, int level) {
		if (root != null) {
			printSideways(root.right, level + 1);
			for (int i = 0; i < level; i++) {
				System.out.print("      ");
			}
			System.out.println(root.data);
			printSideways(root.left, level + 1);
		}
	}
	
	
	/*
	 * Tree Operation methods
	 */
	// returns sum of all values in a tree
	public int sum() {
		return sum(overallRoot);
	}
	private int sum(IntTreeNode root) {
		if (root == null) {
			return 0;
		} else {
			return root.data + sum(root.left) + sum(root.right);
		}
	}
	
	// returns number of levels in a tree
	public int countLevels() {
		return countLevels(overallRoot);
	}
	private int countLevels(IntTreeNode root) {
		if (root == null) {
			return 0;
		} else {
			return 1 + Math.max(countLevels(root.left), countLevels(root.right));
		}
	}
	
	// returns a count of the number of leaf nodes in a tree
	public int countLeaves() {
		return countLeaves(overallRoot);
	}
	private int countLeaves(IntTreeNode root) {
		if (root == null) {
			return 0;
		} else if (root.left == null && root.right == null) {
			return 1;
		} else {
			return countLeaves(root.left) + countLeaves(root.right);
		}
	}
	
	// Assignment 9: ch17 p.1077 e.2
	// returns the number of empty branches in a tree
	// Uses recursion
	public int countEmpty() {
		return countEmpty(overallRoot);
	}
	private int countEmpty(IntTreeNode root) {
		if (root == null) {
			return 1;
		} else {
			return countEmpty(root.left) + countEmpty(root.right);
		}
	}
	
	// Final: ch17 p.1077 e.7
	// Returns true if a binary tree is full and false if it is not.
	// A full binary tree is one in which every node has 0 or 2 children.
	// An empty tree is considered full.
	public boolean isFull() {
		return isFull(overallRoot);
	}
	// returns true if given tree is full
	private boolean isFull(IntTreeNode root) {
		if (root != null) {
			if (root.left == null && root.right == null) {
				return true;
			} else if (root.left != null && root.right != null) {
				return isFull(root.left) && isFull(root.right);
			}
		}
		return false;
	}
}
