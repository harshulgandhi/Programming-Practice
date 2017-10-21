package com.practice.before2017.CTCIv2;

public class MyLinkedList {
	Node head = null;
	
	public MyLinkedList(){}
	
	public MyLinkedList(int val) {
		head = new Node();
		head.setVal(val);
		head.setNext(null);
	}
	
	public void removeNextNode(Node curr) {
		curr.next = curr.next.next;
		curr.next.next = null;
	}
	
	public void insertAtRear(Node node){
		if(head == null) {
			head = node;
			return;
		}
		Node temp = head;
		while(temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(node);
	}
	
	public void insertAtRear(int val){
		if(head == null) {
			head = new Node(val, null);
			return;
		}
		Node temp = head;
		while(temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(new Node(val, null));
	}
	
	public void printLinkedList() {
		Node temp = head;
		while(temp.getNext() != null){
			System.out.print(temp.val+" -> ");
			temp = temp.getNext();
		}
		System.out.print(temp.val+" -> ");
	}
	
	public Node getHead() {
		return head;
	}
	
	public class Node{
		int val;
		private Node next;
		public Node(){
			setNext(null);
		}
		public Node(int val, Node next) {
			this.val = val;
			this.setNext(next);
		}
		public void setVal(int val) {
			this.val = val;
		}
		public void setNext(Node next) {
			this.next = next;
		}
		public Node getNext() {
			return next;
		}
		public int getVal() {
			return val;
		}
	}
}
