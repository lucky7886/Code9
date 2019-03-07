package randomness2;

class Node {

	int key;
	Node left;
	Node right;

	public Node(int key) {

		this.key = key;

	}

}

public class BinaryTree {

	Node root;

	public void inorderTraversal(Node root) {

		if (root == null)
			return;
		else {
			inorderTraversal(root.left);
			System.out.println(root.key);
			inorderTraversal(root.right);
		}
	}

	public int getCountOfNodes(Node root) {
		if (root != null)
			return (1 + getCountOfNodes(root.left) + getCountOfNodes(root.right));

		return 0;
	}

	public int getCountOfLeaves(Node root) {
		if (root == null)
			return 0;
		if (root.left == null && root.right == null)
			return 1;

		return getCountOfLeaves(root.left) + getCountOfLeaves(root.right);

	}

	public int getCountOfNonLeaves(Node root) {
		if (root == null)
			return 0;
		if (root.left == null && root.right == null)
			return 0;
		return 1 + getCountOfNonLeaves(root.left) + getCountOfNonLeaves(root.right);
	}

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();

		tree.root = new Node(50);

		tree.root.left = new Node(30);

		tree.root.right = new Node(60);

		tree.root.left.left = new Node(10);

		tree.root.right.right = new Node(80);

		tree.inorderTraversal(tree.root);

		int count = tree.getCountOfNodes(tree.root);

		System.out.println(count);

		int count2 = tree.getCountOfLeaves(tree.root);

		System.out.println(count2);

		int count3 = tree.getCountOfNonLeaves(tree.root);

		System.out.println(count3);
	}

}
