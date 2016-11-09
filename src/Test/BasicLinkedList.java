package Test;

import java.util.Scanner;

public class BasicLinkedList {

	private class LinkedListNode {
		int num;
		LinkedListNode next = null;
	}
	
	private void printLinkedList(LinkedListNode head) {
		while (head.next != null) {
			System.out.print(head.num+"->");
			head = head.next;
		}
		System.out.print(head.num+"->");
	}
	
	private LinkedListNode cleanList(LinkedListNode head, int num) {
		while (head != null && head.num > num) {
			head = head.next;
		}
		LinkedListNode curr = head;
		while (curr != null && curr.next != null) {
			while (curr.next != null && curr.next.num > num) {
				curr.next = curr.next.next;
			}
			curr = curr.next;
		}
//		printLinkedList(head);
		return head;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BasicLinkedList cl = new BasicLinkedList();
		int N = s.nextInt();
//		Node head = cl.new Node();
		LinkedListNode head = null;
		LinkedListNode curr = null;
		for (int i = 0; i<N; i++) {
			LinkedListNode node = cl.new LinkedListNode();
			node.num = s.nextInt();
			node.next = null;
			
			if (head == null) {
				head = node;
				curr = node;
				continue;
			}
			
			curr.next = node;
			curr = curr.next;
		}
		cl.printLinkedList(head);
		LinkedListNode head2 = cl.cleanList(head, s.nextInt());
		cl.printLinkedList(head2);
	}
}
