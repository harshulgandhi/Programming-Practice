package com.practice.after2017.goldman;

import com.practice.before2017.CTCIv2.MyLinkedList;

/**
 * Merge two sorted linked without creating 
 * another node
 */
public class MergeSortedLinkedList {
	
	public static void printLinkedList(Node head) {
		Node curr = head;
		while(curr.next != null) {
			System.out.print(curr.val + "->");
			curr = curr.next;
		}
		System.out.print(curr.val + "->");
	}
	
	public Node merge(Node head1, Node head2) {
		
		Node curr1 = head1.getVal() >= head2.getVal() ? head2 : head1;
		Node curr2 = head1.getVal() > head2.getVal() ? head1 : head2;
		
		while(curr1.getNext() != null || curr2.getNext() != null) {
			while(curr1.getNext() != null && curr2 != null && curr1.getNext().getVal() < curr2.getVal()) {
				curr1=curr1.getNext();
			}
			if(curr1.getNext() == null) {
				curr1.setNext(curr2);
				return head1.getVal() >= head2.getVal() ? head2 : head1;
			}
			if(curr2 == null) {
				return head1.getVal() >= head2.getVal() ? head2 : head1;
			}
			Node temp = curr1.getNext();
			curr1.setNext(curr2);
			curr2 = curr2.getNext();
			curr1.getNext().setNext(temp);
		}
		
		if(curr1.getNext() == null) {
			curr1.setNext(curr2);
			return head1.getVal() >= head2.getVal() ? head2 : head1;
		}
		return head1.getVal() >= head2.getVal() ? head2 : head1;
	}
	
	public static void main(String[] args) {
		Node head1 = new Node(4, null);
		Node n1 =  new Node(7, null);
		Node n2 =  new Node(12, null);
		head1.next = n1;
		n1.next = n2;
		Node head2 = new Node(15, null);
		Node m1 =  new Node(17, null);
		head2.next = m1;
		MergeSortedLinkedList mer = new MergeSortedLinkedList();
		mer.merge(head1, head2);
		printLinkedList(head1);
		System.out.println();
		printLinkedList(head2);
	}
}

class Node{
	int val;
	Node next;
	public Node(int val, Node next) {
		this.val = val;
		this.next = next;
	}
	public void setVal(int val) {
		this.val = val;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public int getVal() {
		return val;
	}
	public Node getNext() {
		return next;
	}
	
}