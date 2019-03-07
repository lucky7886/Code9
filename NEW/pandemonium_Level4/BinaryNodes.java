package pandemonium_Level4;

class Node {

	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
	}
}

public class BinaryNodes {
	Node root;

	public void insert(int data) {
		root = insertRec(root, data);
	}

	public void printInorder(Node root) {
		if (root != null) {
			printInorder(root.left);
			System.out.println(root.data);
			printInorder(root.right);

		}
	}

	public int countNodes(Node root) {

		if (root == null)
			return 0;

		return 1 + countNodes(root.left) + countNodes(root.right);

	}

	public int countLeafNodes(Node root) {
		if (root == null)
			return 0;
		if (root.left == null && root.right == null)
			return 1;

		return countLeafNodes(root.left) + countLeafNodes(root.right);

	}

	public int countInternalNodes(Node root) {
		if (root == null)
			return 0;
		if ((root.left == null && root.right != null) || (root.right == null && root.left != null)
				|| (root.right != null && root.left != null))
			return 1 + countInternalNodes(root.left) + countInternalNodes(root.right);
		return 0;

	}

	public int countInternalNodes_2(Node root) {
		if (root == null)
			return 0;
		if ((root.left == null && root.right == null))
			return 0;
		return 1 + countInternalNodes_2(root.left) + countInternalNodes_2(root.right);

	}

	public Node insertRec(Node root, int data) {
		if (root == null) {
			root = new Node(data);
			return root;

		}

		if (data < root.data)
			root.left = insertRec(root.left, data);

		else if (data > root.data)
			root.right = insertRec(root.right, data);

		return root;

	}

	public static void main(String[] args) {

		BinaryNodes tree = new BinaryNodes();
		tree.insert(100);
		tree.insert(50);
		tree.insert(200);
		tree.insert(150);
		tree.insert(250);
		tree.insert(180);
		tree.insert(225);

		tree.printInorder(tree.root);
		System.out.println("The number of roots in the tree are: " + tree.countNodes(tree.root)); // 5

		System.out.println("The number of leaves in the tree are: " + tree.countLeafNodes(tree.root)); // 3

		System.out.println("The number of leaves in the tree are: " + tree.countInternalNodes(tree.root)); // 2

		System.out.println("The number of leaves in the tree are: " + tree.countInternalNodes_2(tree.root)); // 2
	}

}
