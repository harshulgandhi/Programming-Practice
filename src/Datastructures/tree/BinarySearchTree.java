package Datastructures.tree;

public class BinarySearchTree{

	Node root;

	public BinarySearchTree(int element){
		root = new Node(element);
	}

	public void insert(Node node, int val){

		if(val < node.element){
			if(node.left == null){
				node.left = new Node(val);
			}
			else{
			node = node.left;
			insert(node, val);
			}
		}
		else if(val >= node.element){
			if(node.right == null){
				node.right = new Node(val);
			}
			else{
				node = node.right;
				insert(node, val);
			}
		}
		
	}

	public void inorderTraversal(Node node){
		if(node != null){
			inorderTraversal(node.left);
			System.out.println("Traversed : "+node.element);
			inorderTraversal(node.right);
		}
	}

	public void preorderTraversal(Node node){
		if(node != null){
			System.out.println("Traversed : "+node.element);
			preorderTraversal(node.left);
			preorderTraversal(node.right);
		}
	}

	public void postorderTraversal(Node node){
		if(node != null){
			postorderTraversal(node.left);
			postorderTraversal(node.right);
			System.out.println("Traversed : "+node.element);
		}
	}


	public static void main(String[] args){
		BinarySearchTree tree = new BinarySearchTree(15);
		tree.insert(tree.root,10);
		tree.insert(tree.root, 20);
		tree.insert(tree.root, 5);
		tree.insert(tree.root, 17);
		tree.insert(tree.root, 12);
		System.out.println("INORDER");
		tree.inorderTraversal(tree.root);
		System.out.println("PREORDER");
		tree.preorderTraversal(tree.root);
		System.out.println("POSTORDER");
		tree.postorderTraversal(tree.root);
	}

}