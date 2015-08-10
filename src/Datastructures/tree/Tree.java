package Datastructures.tree;

public class Tree{

	Node root;

	public Tree(int element){
		root = new Node(element);
	}

	public void insert(Node node, int val){

			if(node.left == null){
				node.left = new Node(val);
				return;
			}
			else if (node.right == null){
				node.right = new Node(val);
				return;
			}
			else{
				if(node.left.left == null || node.left.right == null) insert(node.left,val);
				else if(node.right.left == null || node.right.right == null) insert(node.right, val);
				else insert(node.left,val);
//				node = node.left;
//				insert(node, val);	
			}
//			if(node.right == null){
//				node.right = new Node(val);
//				return;
//			}	
//			else{
//			node = node.right;
//			insert(node, val);
//			}
	}

	public void inorderTraversal(Node node){
		if(node != null){
			inorderTraversal(node.left);
			System.out.print(node.element+" - ");
			inorderTraversal(node.right);
		}
	}

	public void preorderTraversal(Node node){
		if(node != null){
			System.out.print(node.element+" - ");
			preorderTraversal(node.left);
			preorderTraversal(node.right);
		}
	}

	public void postorderTraversal(Node node){
		if(node != null){
			postorderTraversal(node.left);
			postorderTraversal(node.right);
			System.out.print(node.element+" - ");
		}
	}


	public static void main(String[] args){
		Tree tree = new Tree(3);
		tree.insert(tree.root,5);
		tree.insert(tree.root, 1);
		tree.insert(tree.root, 6);
		tree.insert(tree.root, 2);
		tree.insert(tree.root, 0);
		tree.insert(tree.root, 8);
		
		tree.insert(tree.root, 7);
		tree.insert(tree.root, 4);
		System.out.println("INORDER");
		tree.inorderTraversal(tree.root);
		System.out.println("\nPREORDER");
		tree.preorderTraversal(tree.root);
		System.out.println("\nPOSTORDER");
		tree.postorderTraversal(tree.root);
	}

}

/*
INORDER
7 - 6 - 4 - 5 - 2 - 3 - 0 - 1 - 8 - 
PREORDER
3 - 5 - 6 - 7 - 4 - 2 - 1 - 0 - 8 - 
POSTORDER
7 - 4 - 6 - 2 - 5 - 0 - 8 - 1 - 3 -  
 */
 