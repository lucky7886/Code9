package pandemonium_Level1;

class Node {

	int key;
	Node left;
	Node right;

	Node(int key) {
		this.key = key;
	}

}

public class BinarySearchTree {
	Node root;

	public void insert(int key) {
		root = insertRec(root, key);
	}

	public Node insertRec(Node root, int key) {
		if (root == null)
			root = new Node(key);

		if (key < root.key)
			root.left = insertRec(root.left, key);
		else if (key > root.key)
			root.right = insertRec(root.right, key);

		return root;
	}

	public void inorderTraversal(Node root) {
		if (root != null) {
			inorderTraversal(root.left);
			if(root.key%2==0)
			System.out.println(root.key);
			inorderTraversal(root.right);
		}
	}

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(30);
		tree.insert(15);
		tree.insert(120);
		tree.inorderTraversal(tree.root);
	}

}
