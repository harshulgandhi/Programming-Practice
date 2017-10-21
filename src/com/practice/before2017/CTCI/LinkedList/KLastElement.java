package com.practice.before2017.CTCI.LinkedList;
import java.util.Scanner;

public class KLastElement{

	public static int getKthToLast(LinkedList ll, int k){
		Node tempHead = ll.head;
		Node curr = ll.head;
		int i = 0;
		while(i<k){
			curr = curr.next;
			i++;
		}

		while(curr.next != null){
			tempHead = tempHead.next;
			curr = curr.next;
		}

		return tempHead.next.val;
	}

	public static void main(String[] args){
		LinkedList ll = new LinkedList(10);
		ll.addToRear(new Node(194));
		ll.addToRear(new Node(13));
		ll.addToRear(new Node(134));
		ll.addToRear(new Node(99));
		ll.addToRear(new Node(123));
		ll.addToRear(new Node(23));

		Scanner s = new Scanner(System.in);
		int K = s.nextInt();
		System.out.println("Element Kth from the last is : "+getKthToLast(ll,K));
	}
}