package CTCI.LinkedList;
public class DeleteMiddle{

	public static void removeMiddle(Node mid){
		if(mid == null) return;
		Node nextNode = mid.next;
		mid.val = nextNode.val;
		mid.next = nextNode.next;	
	}

	public static void main(String[] args){
		LinkedList ll = new LinkedList(242);
		Node middle = new Node(134);
		ll.addToRear(new Node(194));
		ll.addToRear(new Node(13));
		ll.addToRear(middle);
		ll.addToRear(new Node(99));
		ll.addToRear(new Node(123));
		ll.addToRear(new Node(23));
		ll.printLinkedList();
		System.out.println();
		removeMiddle(middle);
		ll.printLinkedList();

	}
}