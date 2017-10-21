package com.practice.before2017.LeetCode;

import com.practice.before2017.Datastructures.tree.Node;

public class KthSmallestBST {
	TreeNode root;
	int kth = 0;
	int kSmallest = 0;
	public KthSmallestBST(int val) {
		root = new TreeNode(val);
	}
	
	public void insert(TreeNode node, int val){
		if(val < node.val){
			if(node.left == null){
				node.left = new TreeNode(val);
			}
			else{
			node = node.left;
			insert(node, val);
			}
		}
		else if(val >= node.val){
			if(node.right == null){
				node.right = new TreeNode(val);
			}
			else{
				node = node.right;
				insert(node, val);
			}
		}
	}
	
	public int inorderTraversal(TreeNode node, int K){
		
		if(node != null){
			inorderTraversal(node.left, K);
			kth += 1;
			System.out.println("kth = "+kth+" | "+node.val+" - ");
			if(kth == K) kSmallest = node.val;
			inorderTraversal(node.right, K);
		}
		return kSmallest;
	}
	
	public int kthSmallest(TreeNode root, int k) {
		return inorderTraversal(root, k);
    }
	
	public static void main(String[] args) {
		KthSmallestBST tree = new KthSmallestBST(20);
		tree.insert(tree.root,15);
		tree.insert(tree.root,25);
		tree.insert(tree.root,10);
		tree.insert(tree.root,18);
		tree.insert(tree.root,5);
		tree.insert(tree.root,13);
		
		System.out.println(tree.kthSmallest(tree.root, 4));
//		tree.kthSmallest(tree.root, 4);
		
	}
	
}
