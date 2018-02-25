package com.practice.after2017.leetcode.algorithms;

public class RemoveNthNode {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode head1 = head;
		int len = 0;
		while (head1 != null) {
			head1 = head1.next;
			len++;
		}
		if (n == 0) {
			return head;
		}
		if (n == len) {
			return head.next;
		}
		ListNode runner = head;
		int count = 0;
		while (runner != null) {
			count++;
			if (count == len - n) {
				runner.next = runner.next == null ? null : runner.next.next;
			}
			runner = runner.next;
		}
		return head;
	}

	private void print(ListNode head) {
		while (head != null) {
			System.out.print(head.val + "->");
			head = head.next;
		}
	}

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		RemoveNthNode remove = new RemoveNthNode();
		ListNode head = remove.new ListNode(1);
		ListNode n1 = remove.new ListNode(2);
		ListNode n2 = remove.new ListNode(3);
		ListNode n3 = remove.new ListNode(4);
		ListNode n4 = remove.new ListNode(5);
		head.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;

		ListNode head2 = remove.removeNthFromEnd(head, 5);
		remove.print(head2);
	}
}
