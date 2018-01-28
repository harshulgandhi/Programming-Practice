package com.practice.after2017.goldman;

import java.util.ArrayList;
import java.util.List;

public class FindJunctionLinkedList {
	public static void printLinkedList(Node head) {
		Node curr = head;
		while(curr.next != null) {
			System.out.print(curr.val + "->");
			curr = curr.next;
		}
		System.out.print(curr.val + "->");
	}
	
	public static Node getJunction(Node head1, Node head2) { 
		List<Node> list1 = new ArrayList<Node>();
		while(head1 != null) {
			list1.add(head1);
			head1 = head1.next;
		}
		
		while(head2 != null) {
			if(list1.contains(head2)) {
				return head2;
			}
			head2 = head2.next;
			
		}
		System.out.println("No junction");
		return null;
	}
	
	public static void main(String[] args) {
		Node n5 =  new Node(999, null);
		Node n4 =  new Node(17, n5);
		Node n3 =  new Node(16, n4);
		Node n2 =  new Node(12, n3);
		Node n1 =  new Node(77, n2);
		Node head1 = new Node(4, n1);
		printLinkedList(head1);
		System.out.println();
		Node m1 =  new Node(17, n3);
		Node head2 = new Node(15, m1);
		head2.next = m1;
		printLinkedList(head2);
		
		Node junc = getJunction(head1, head2);
		System.out.println("\nJunc "+junc.val);
	}
}
