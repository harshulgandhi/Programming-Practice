package com.practice.after2017.leetcode.algorithms;

/**
 * https://leetcode.com/problems/swap-nodes-in-pairs/description/
 */
public class SwapPairs {
	public ListNode swapPairs(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode virtual = new ListNode(0);
		ListNode newHead = virtual;
		virtual.next = head;
		ListNode curr = newHead;
		while (curr != null && curr.next != null) {
			curr = swapNodes(curr);
		}
		return virtual.next;
	}

	private ListNode swapNodes(ListNode swapNextPair) {
		if (swapNextPair.next.next == null)
			return null;
		ListNode left = swapNextPair.next;
		ListNode right = swapNextPair.next.next;
		swapNextPair.next = right;
		left.next = right.next;
		right.next = left;
		return left;

	}

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	private void print(ListNode head) {
		while (head != null) {
			System.out.print(head.val + "->");
			head = head.next;
		}
	}

	public static void main(String[] args) {
		SwapPairs swapPairs = new SwapPairs();
		ListNode head = swapPairs.new ListNode(1);
		ListNode n1 = swapPairs.new ListNode(2);
		ListNode n2 = swapPairs.new ListNode(3);
		ListNode n3 = swapPairs.new ListNode(4);
		ListNode n4 = swapPairs.new ListNode(5);
		// ListNode n5 = swapPairs.new ListNode(6);
		head.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		// n4.next = n5;

		ListNode head2 = swapPairs.swapPairs(head);
		swapPairs.print(head2);
	}
}
