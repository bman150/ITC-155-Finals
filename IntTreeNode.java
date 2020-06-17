// Written on 6/12/2020
// Class for storing a single node of a binary tree of int's
// An IntTreeNode object is one node in a binary tree of int's
public class IntTreeNode {
	public int data; 		 // data stored at this node
	public IntTreeNode left; // reference to left subtree
	public IntTreeNode right;// reference to right subtree
	
	// constructs a leaf node with the given data
	public IntTreeNode(int data) {
		this(data, null, null);
	}
	
	// constructs a branch node with the given data and subtrees
	public IntTreeNode(int data, IntTreeNode left, IntTreeNode right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
}
