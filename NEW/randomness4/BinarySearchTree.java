package randomness4;

class Node {

	int key;
	Node right;
	Node left;

	public Node(int key) {
		this.key = key;
	}

}

public class BinarySearchTree {

	Node root;

	public Node sortedArrayToBst(int[] arr, int start, int end) {
		if (start > end)
			return null;

		int mid = (start + end) / 2;

		Node node = new Node(arr[mid]);

		node.left = sortedArrayToBst(arr, start, mid - 1);

		node.right = sortedArrayToBst(arr, mid + 1, end);

		return node;

	}

	public void preOrder(Node root) {

		if (root == null)
			return;

		System.out.println(root.key);
		preOrder(root.left);
		preOrder(root.right);

	}

	public static void main(String[] args) {

		BinarySearchTree tree = new BinarySearchTree();
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int n = arr.length;
		tree.root = tree.sortedArrayToBst(arr, 0, n - 1);
		tree.preOrder(tree.root);
	}

}
