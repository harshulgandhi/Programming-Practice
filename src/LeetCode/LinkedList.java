package LeetCode;

import LeetCode.Node;
public class LinkedList {
	public Node head = null;

	public LinkedList(int element){
		head = new Node(element);
		head.next = null;
	}
	
	public void addElement(int element){
		Node root = head;
		while(root.next != null){
			root = root.next;
		}
		Node n = new Node(element);
		root.next=n;
		n.next = null;
	}
	
	
	public void printList(){
		Node root = head;
		while(root.next != null){
			System.out.print(root.element+" - ");
			root = root.next;
		}
		System.out.print(root.element+" - ");
	}
	
}
