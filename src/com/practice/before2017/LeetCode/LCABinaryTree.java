package com.practice.before2017.LeetCode;

import com.practice.before2017.Datastructures.tree.Node;



public class LCABinaryTree {
	TreeNode root;

	public LCABinaryTree(int val){
		root = new TreeNode(val);
	}
	
	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(root == null){
			return null;
		}
		if(root.val == p.val || root.val == q.val) return root;
		
		TreeNode left = lowestCommonAncestor(root.left, p, q);
		TreeNode right = lowestCommonAncestor(root.right, p, q);
		
		if(left!=null && right!=null) return root;
		
        return (left!=null) ? left : right;
    }
	
	public void printAncestors(TreeNode root, TreeNode target){
		System.out.println("Traversing : "+root.val+" right : "+root.right.val+" left : "+root.left.val);
		if((root.left!=null && root.left.val == target.val) || (root.right!=null && root.right.val == target.val)){
			System.out.println("Found first parent "+ root.val);
			return;
		}
		else {
			if(root.left != null) printAncestors(root.left,target);
//			System.out.println(root.val);
			if(root.right != null) printAncestors(root.right,target);
//			System.out.println(root.val);
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
			System.out.print(node.val+" - ");
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
		System.out.println();
		System.out.println(tree.lowestCommonAncestor(tree.root, new TreeNode(5), new TreeNode(7)).val);
	}
}
