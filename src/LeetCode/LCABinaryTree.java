package LeetCode;

import Datastructures.tree.Node;



public class LCABinaryTree {
	TreeNode root;

	public LCABinaryTree(int element){
		root = new TreeNode(element);
	}
	
	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        printAncestors(root, p);
		return root;
    }
	
	public void printAncestors(TreeNode root, TreeNode target){
		
		if((root.left!=null && root.left.element == target.element) || (root.right!=null && root.right.element == target.element)){
//			System.out.println(root.element);
			return;
		}
		else {
			if(root.left != null) printAncestors(root.left,target);
			System.out.println(root.element);
			if(root.right != null) printAncestors(root.right,target);
			System.out.println(root.element);
		}
	}
	public void insert(TreeNode node, int val){

		if(node.left == null){
			node.left = new TreeNode(val);
			return;
		}
		else if (node.right == null){
			node.right = new TreeNode(val);
			return;
		}
		else{
			if(node.left.left == null || node.left.right == null) insert(node.left,val);
			else if(node.right.left == null || node.right.right == null) insert(node.right, val);
			else insert(node.left,val);
		}
	}

	public void inorderTraversal(TreeNode node){
		if(node != null){
			inorderTraversal(node.left);
			System.out.print(node.element+" - ");
			inorderTraversal(node.right);
		}
	}
	
	public static void main(String[] args) {
		LCABinaryTree tree = new LCABinaryTree(3);
		tree.insert(tree.root,5);
		tree.insert(tree.root, 1);
		tree.insert(tree.root, 2);
		tree.insert(tree.root, 6);
		tree.insert(tree.root, 0);
		tree.insert(tree.root, 8);
		tree.insert(tree.root, 7);
		tree.insert(tree.root, 4);
		System.out.println("INORDER");
		tree.inorderTraversal(tree.root);
		
		tree.lowestCommonAncestor(tree.root, new TreeNode(6), new TreeNode(7));
	}
	
	
}
