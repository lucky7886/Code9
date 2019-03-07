package randomness;

class Node {

	int key;
	Node left, right;

	public Node(int key) {
		this.key = key;
		left = null;
		right = null;
	}

}

public class BinarySearchTree {

	Node root;

	/*
	 * public BinarySearchTree() { root = null; }
	 */

	void insert(int key) {
		root = insertRec(root, key);
	}

	Node insertRec(Node root, int key) {

		if (root == null) {
			root = new Node(key);
			return root;
		}

		/* Otherwise, recur down the tree */
		if (key < root.key)
			root.left = insertRec(root.left, key);
		else if (key > root.key)
			root.right = insertRec(root.right, key);

		/* return the (unchanged) node pointer */
		return root;
	}

	void inorder() {
		inorderRec(root);
	}

	// A utility function to do inorder traversal of BST
	void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.println(root.key);
			inorderRec(root.right);
		}
	}

	public Node search(Node root, int key) {
		if (root == null || root.key == key)
			return root;
		if (root.key > key)
			return search(root.left, key);

		return search(root.right, key);
	}

	public void search(int key) {
		Node r = search(root, key);
		if (r == null)
			System.out.println("Key is not present");
		else
			System.out.println("key is present");
	}

	public static void main(String[] args) {

		BinarySearchTree tree = new BinarySearchTree();

		System.out.println("Root has been created with value = " + tree.root);

		tree.insert(50);
		tree.insert(20);
		tree.insert(80);
		tree.insert(100);

		// tree.inorder();

		tree.search(100);

	}

}
