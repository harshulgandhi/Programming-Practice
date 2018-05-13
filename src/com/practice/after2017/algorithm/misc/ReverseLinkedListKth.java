package com.practice.after2017.algorithm.misc;

/**
 * Reverse linked list from kth node
 */
public class ReverseLinkedListKth {
	public void print(Node head) {
		while (head != null) {
			System.out.print(head.val + " -> ");
			head = head.next;
		}
	}

	public Node reverse(Node head) {
		Node p = null;
		Node c = head;
		Node n = head.next;
		while (n != null) {
			c.next = p;
			p = c;
			c = n;

			n = n.next;
		}
		c.next = p;
		return c;
	}

	public static void main(String[] args) {
		ReverseLinkedListKth reverse = new ReverseLinkedListKth();
		Node head = reverse.new Node(3, null);
		Node n1 = reverse.new Node(1);
		Node n2 = reverse.new Node(5);
		Node n3 = reverse.new Node(7);
		Node n4 = reverse.new Node(4);
		head.setNext(n1);
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(null);
		Node headCopy = head;
		reverse.print(headCopy);
		Node p = head;
		Node c = head.next;
		Node n = head.next.next;
		Node head1 = reverse.reverse(head);
		reverse.print(head1);
	}

	class Node {
		int val;
		Node next;

		public Node(int val) {
			this.val = val;
		}

		public Node(int val, Node next) {
			this.val = val;
			this.next = next;
		}

		public int getVal() {
			return val;
		}

		public void setVal(int val) {
			this.val = val;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}
}
