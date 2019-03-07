package randomness5;

class Node {

	int data;

	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
	}

}

public class BinarySearchTree {

	Node root;

	public void delete(int key) {

		root = deleteRec(root, key);

	}

	public Node deleteRec(Node root, int key) {

		if (root == null)
			return root;
		if (key < root.data)
			root.left = deleteRec(root.left, key);
		else if (key > root.data)
			root.right = deleteRec(root.right, key);

		else {

			if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;

			
			root.data = minValue(root.right);

			root.right = deleteRec(root.right, root.data);

		}

		return root;
	}

	int minValue(Node root) {
		int minv = root.data;
		while (root.left != null) {
			minv = root.left.data;
			root = root.left;
		}
		return minv;
	}

	public void inorderTraversal(Node root) {
		if (root != null) {
			inorderTraversal(root.left);
			System.out.print(root.data + " ");
			inorderTraversal(root.right);
		}

	}

	public static void main(String[] args) {

		BinarySearchTree tree = new BinarySearchTree();

		tree.root = new Node(50);
		tree.root.left = new Node(30);
		tree.root.left.right = new Node(60);
		tree.root.right = new Node(100);
		tree.root.right.left = new Node(80);
		tree.root.left.left = new Node(10);
		tree.root.right.right = new Node(200);

		tree.inorderTraversal(tree.root);

		System.out.println();

		tree.delete(50);

		tree.inorderTraversal(tree.root);
	}

}
