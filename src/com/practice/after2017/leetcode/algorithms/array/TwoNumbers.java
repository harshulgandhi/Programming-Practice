package com.practice.after2017.leetcode.algorithms.array;

/**
 * https://leetcode.com/problems/add-two-numbers/description/
 * */
class TwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode added = null;
        ListNode toTraverse = added;
        int carry = 0;
        while(l1 != null || l2 != null) {
        	int a = l1 != null ? l1.val : 0;
        	int b = l2 != null ? l2.val : 0;
        	int rawSum = a + b + carry;
        	int sum = rawSum >= 10 ? rawSum % 10 : rawSum;
        	if(toTraverse == null) {
        		toTraverse = new ListNode(sum);
        		added = toTraverse;
        	} else {
        		toTraverse.next = new ListNode(sum);
        		toTraverse = toTraverse.next;
        	}
        	carry = rawSum >= 10 ? 1 : 0;
        	if(l1 != null) l1 = l1.next;
        	if(l2 != null) l2 = l2.next;
        }
        if(carry != 0) {
        	toTraverse.next = new ListNode(1);
        }
        
        return added;
    }
    
    public void print(ListNode ln) {
    	while(ln != null) {
    		System.out.print(ln.val + "-> ");
    		ln = ln.next;
    	}
    	System.out.println();
    }
    
    public static void main(String[] args) {
		TwoNumbers tn = new TwoNumbers();
		ListNode l11 = new ListNode(9);
		ListNode l12 = new ListNode(9);
		ListNode l13 = new ListNode(9);
		l11.next = l12;
		l12.next = l13;
		tn.print(l11);
		ListNode l21 = new ListNode(9);
//		ListNode l22 = new ListNode(9);
//		ListNode l23 = new ListNode(9);
//		l21.next = l22;
//		l22.next = l23;
		tn.print(l21);
		ListNode added = tn.addTwoNumbers(l11, l21);
		tn.print(added);
	}
}

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { 
    	  val = x; 
      }
}