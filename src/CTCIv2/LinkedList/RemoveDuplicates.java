package CTCIv2.LinkedList;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import CTCIv2.MyLinkedList;
import CTCIv2.MyLinkedList.Node;

public class RemoveDuplicates {
	
	public Node removeDuplicate(Node head) {
		Set<Integer> set = new HashSet<>();
		Node itr = head;
		while(itr.getNext() != null) {
			if(set.contains(itr.getVal())) {
				removeNode(itr);
			} else {
				set.add(itr.getVal());
				itr = itr.getNext();
			}
		}
		if(set.contains(itr.getVal())) {
			removeNode(itr);
		} else {
			set.add(itr.getVal());
			itr = itr.getNext();
		}
		return head;
	}
	
	public void removeNode(Node curr) {
		if(curr.getNext() == null) {
			curr = null;
			return;
		}
		curr.setVal(curr.getNext().getVal());
		Node temp = curr.getNext().getNext();
		curr.getNext().setNext(null);
		curr.setNext(temp);
	}
	
	public void printLinkedList(Node head) {
		Node temp = head;
		while(temp.getNext() != null){
			System.out.print(temp.getVal()+" -> ");
			temp = temp.getNext();
		}
		System.out.print(temp.getVal()+" -> ");
	}
	
	
	public static void main(String[] args) {
		MyLinkedList mll = new MyLinkedList();
		mll.insertAtRear(23);
		mll.insertAtRear(23);
		mll.insertAtRear(77);
		mll.insertAtRear(89);
		mll.insertAtRear(2);
		mll.insertAtRear(23);
		mll.insertAtRear(32);
		mll.insertAtRear(2);
		mll.insertAtRear(11);
		mll.printLinkedList();
		System.out.println();
		RemoveDuplicates rd = new RemoveDuplicates();
		Node head = rd.removeDuplicate(mll.getHead());
		rd.printLinkedList(head);
		
	}
}
