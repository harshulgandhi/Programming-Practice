package com.practice.before2017.Hackerrank.GraphTheory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenTree {
	private Node[] tree;

	public void insertEdge(int parent, int child) {
		tree[parent] = (tree[parent] == null) ? new Node(parent) : tree[parent];
		tree[child] = (tree[child] == null) ? new Node(child) : tree[child];
		tree[child].parentNode = tree[parent];
		tree[parent].addChild(tree[child]);
	}
	
	public void printTree(){
		for(int i = 1; i<tree.length; i++){
			System.out.println();
			System.out.print(tree[i].value+" --> [");
			tree[i].children.forEach((child)->{
				System.out.print(child.value+", ");
			});
			System.out.print("]");
			if(tree[i].parentNode != null) {
			 System.out.print(" | [parent: "+tree[i].parentNode.value+"]");
			}
		}
	}
	
	public boolean isSubTreeEven(Node startingNode) {
		return countNodes(startingNode, 0) % 2 == 0;
	}
	
	public int countNodes(Node rootNode, int nodeCount) {
		nodeCount++;
		List<Node> children = tree[rootNode.getValue()].getChildren();
		if(children.size() == 0) return nodeCount;
		for(Node eachChild : children) {
			nodeCount = countNodes(eachChild, nodeCount);
		}
		return nodeCount++;
	}
	
	public int edgeCountToDelete(Node rootNode) {
		int edgeCount = 0;
		for( int i = 1; i<tree.length; i++){
			List<Node> children = tree[i].getChildren();
			for (Node eachChild : children) {
				if (isSubTreeEven(eachChild)) {
					edgeCount++;
				}
			}
		}
		return edgeCount;
	}
	
	public static void main(String[] args) {
		EvenTree et = new EvenTree();
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();
		et.tree = new Node[N+1];
		for(int i = 0; i<M; i++) {
			int child = s.nextInt();
			int parent = s.nextInt();
			et.insertEdge(parent, child);
		}
//		et.printTree();
//		System.out.println("\nCount is : "+et.countNodes(et.tree[1], 0));
		System.out.println(et.edgeCountToDelete(et.tree[1]));
		
	}
	private class Node {
		int value = 0;;
		List<Node> children = new ArrayList<>();
		Node parentNode;
		
		Node(int num){
			this.value = num;
		}
		
		public void addChild(Node child){
			this.children.add(child);
		}
		
		public void setParent(Node parent) {
			this.parentNode = parent;
		}
		
		public int getValue() {
			return value;
		}
		
		public List<Node> getChildren() {
			return children;
		}
	}
}
