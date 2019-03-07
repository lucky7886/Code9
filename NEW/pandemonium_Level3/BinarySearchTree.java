package pandemonium_Level3;

class Node {

	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
	}

}

public class BinarySearchTree {
	Node root;
	String s;
	String s1;

	public void insert(int data) {
		root = insertRec(root, data);
	}

	public boolean areIdentical(Node T, Node S) {
		if (T == null && S == null)
			return true;
		if (T == null || S == null)
			return false;
		return (T.data == S.data && areIdentical(T.left, S.left) && areIdentical(T.right, S.right));
	}

	public boolean isSubtree(Node T, Node S) {
		if (S == null)
			return true;
		if (T == null)
			return false;
		if (areIdentical(T, S))
			return true;
		return isSubtree(T.left, S) || isSubtree(T.right, S);
	}

	public Node insertRec(Node root, int data) {
		if (root == null) {

			root = new Node(data);
			return root;

		}

		if (data < root.data)
			root.left = insertRec(root.left, data);
		if (data > root.data)
			root.right = insertRec(root.right, data);

		return root;
	}

	public void printInorder(Node root) {
		if (root != null) {
			printInorder(root.left);
			System.out.println(root.data);
			printInorder(root.right);
		}
	}

	public void printInorder_1(Node root) {
		if (root == null)
			return;
		else {
			printInorder_1(root.left);
			s += root.data;
			printInorder_1(root.right);
		}
	}

	public void printPreorder_1(Node root) {
		if (root == null)
			return;
		else {
			s1 += root.data;
			printPreorder_1(root.left);
			printPreorder_1(root.right);
		}
	}

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(100);
		tree.insert(50);
		tree.insert(200);
		tree.insert(25);
		tree.insert(75);
		tree.insert(150);
		tree.insert(300);
		// tree.printInorder(tree.root);
		tree.printInorder_1(tree.root);
		tree.printPreorder_1(tree.root);
		System.out.println(tree.s);
		System.out.println(tree.s1);
		BinarySearchTree tree2 = new BinarySearchTree();
		tree2.insert(200);
		tree2.insert(150);
		tree2.insert(300);
		tree2.printInorder_1(tree2.root);
		tree2.printPreorder_1(tree2.root);
		System.out.println(tree2.s);
		System.out.println(tree2.s1);
		// tree2.printInorder(tree2.root);

		/*
		 * if (tree.isSubtree(tree.root, tree2.root))
		 * System.out.println("Tree is a subset"); else
		 * System.out.println("Tree is not a subset");
		 */

	}
}
