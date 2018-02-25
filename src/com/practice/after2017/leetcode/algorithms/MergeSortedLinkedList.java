package com.practice.after2017.leetcode.algorithms;

import com.practice.before2017.CTCI.LinkedList.Node;

/**
 * https://leetcode.com/problems/merge-two-sorted-lists/description/
 * */
public class MergeSortedLinkedList {
	public Node mergeList(Node head1, Node head2) {
		Node mergedList = null;
		if (head1 == null) {
			return head2;
		}
		if (head2 == null) return head1;
		
		if(head1.getVal() < head2.getVal()) {
			mergedList = head1;
			mergedList.setNext(mergeList(head1.getNext(), head2));
		} else {
			mergedList = head2;
			mergedList.setNext(mergeList(head1, head2.getNext()));
		}
		
		return mergedList;
	}
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode mergedList = null;
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) return l1;
		
		if(l1.val < l2.val) {
			mergedList = l1;
			mergedList.next = (mergeTwoLists(l1.next, l2));
		} else {
			mergedList = l2;
			mergedList.next = (mergeTwoLists(l1, l2.next));
		}
		
		return mergedList;
    }
	
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
		}
	public static void main(String[] args) {
		Node ll1 = new Node(3, null);
		Node n2 = new Node(7, null);
		Node n3 = new Node(11, null);
		ll1.setNext(n2);
		n2.setNext(n3);
		
		Node ll2 = new Node(5, null);
		Node m2 = new Node(8, null);
		Node m3 = new Node(10, null);
		Node m4 = new Node(12, null);
		ll2.setNext(m2);
		m2.setNext(m3);
		m3.setNext(m4);
		
		MergeSortedLinkedList msll = new MergeSortedLinkedList();
		Node merged = msll.mergeList(ll1, ll2);
		
		while(merged != null) {
			System.out.print(merged.getVal() + " -> ");
			merged = merged.getNext();
		}
	}
}
