package randomness3;

class Node {

	int key;
	Node left;
	Node right;

	Node(int key) {
		this.key = key;
	}

}

public class BinaryTree {

	Node root;

	public void printPaths(Node root) {
		int[] path = new int[100];
		printPathsRecur(root, path, 0);

	}

	public void printPathsRecur(Node root, int[] path, int pathLen) {
		if (root == null)
			return;

		path[pathLen++] = root.key;

		if (root.left == null && root.right == null)
			printPath(path, pathLen);
		else {
			printPathsRecur(root.left, path, pathLen);
			printPathsRecur(root.right, path, pathLen);
		}

	}

	public void printPath(int[] path, int pathLen) {
		for (int i = 0; i < pathLen; i++)
			System.out.print(path[i] + " ");
		System.out.println();
	}

	public void inorderTraversal(Node root) {

		if (root == null)
			return;
		else {

			inorderTraversal(root.left);
			System.out.println(root.key);
			inorderTraversal(root.right);

		}

	}

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.root = new Node(100);
		tree.root.left = new Node(50);
		tree.root.left.right = new Node(75);
		tree.root.right = new Node(200);
		tree.root.right.left = new Node(150);
		tree.root.left.left = new Node(25);
		tree.root.right.right = new Node(400);

		tree.inorderTraversal(tree.root);
		tree.printPaths(tree.root);
	}

}
