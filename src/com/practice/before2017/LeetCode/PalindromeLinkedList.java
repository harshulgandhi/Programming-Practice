package com.practice.before2017.LeetCode;
import java.util.List;
import java.util.Scanner;

import com.practice.before2017.LeetCode.LinkedList;
public class PalindromeLinkedList {
	
	Node root;
	public boolean isPalindrome(Node head){
		boolean flag = true;
		if(head.next != null){
			flag = isPalindrome(head.next);
		}
		System.out.println("this.root.element : "+this.root.element+" head.element : "+head.element);
		if(flag && this.root.element == head.element){
			this.root = this.root.next;
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		PalindromeLinkedList obj = new PalindromeLinkedList();
		Scanner sc = new Scanner(System.in);
		LinkedList ll = new LinkedList(14);
		int i = 4;
		while(i>0){
			ll.addElement(sc.nextInt());
			i--;
		}
		obj.root = ll.head;
		System.out.println(obj.isPalindrome(ll.head));
	}
}
