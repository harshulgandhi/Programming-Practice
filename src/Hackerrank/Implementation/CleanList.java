package Hackerrank.Implementation;

import java.util.Scanner;

/**
 * Input is a linked list and a number after that. 
 * Output should be the linked list with all those numbers removed that
 * are greater than the last input number. 
 * */
public class CleanList {

	private class Node {
		int num;
		Node next = null;
	}
	
	private void printLinkedList(Node head) {
		while (head.next != null) {
			System.out.print(head.num+"->");
			head = head.next;
		}
	}
	
	private Node cleanList(Node head, int num) {
		while (head != null && head.num > num) {
			head = head.next;
		}
		Node curr = head;
		while (curr != null && curr.next != null) {
			while (curr.next.num > num) {
				curr.next = curr.next.next;
			}
			curr = curr.next;
		}
		printLinkedList(head);
		System.out.println();
		return head;
	}
	
//	private 
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		CleanList cl = new CleanList();
		int N = s.nextInt();
		Node head = cl.new Node();
		Node curr = head;
		for (int i = 0; i<N; i++) {
			curr.num = s.nextInt();
			curr.next = cl.new Node();
			curr = curr.next;
		}
		cl.printLinkedList(head);
//		Node head2 = cl.cleanList(head, s.nextInt());
		cl.cleanList(head, s.nextInt());
//		System.out.println("Head val "+head.num);
		cl.printLinkedList(head);
	}
}
