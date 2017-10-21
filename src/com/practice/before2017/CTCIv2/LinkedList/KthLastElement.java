package com.practice.before2017.CTCIv2.LinkedList;

import com.practice.before2017.CTCIv2.MyLinkedList;
import com.practice.before2017.CTCIv2.MyLinkedList.Node;

public class KthLastElement {
	public int kthLastElement(Node head, int k){
		Node kWindow = head;
		int i = 0;
		while(kWindow.getNext() != null) {
			i++;
			if(i == k) break;
			kWindow = kWindow.getNext();
			
		}
		
		Node curr = head;
		while(kWindow.getNext() != null) {
			kWindow = kWindow.getNext();
			curr = curr.getNext();
		}
		
		return curr.getVal();
	}
	
	public static void main(String[] args) {
		MyLinkedList mll = new MyLinkedList();
		mll.insertAtRear(3);
		mll.insertAtRear(2);
		mll.insertAtRear(33);
		mll.insertAtRear(234);
		mll.insertAtRear(44);
		mll.insertAtRear(9);
		mll.insertAtRear(378);
		
		KthLastElement kll = new KthLastElement();
		System.out.println(kll.kthLastElement(mll.getHead(), 5));
	}
}
