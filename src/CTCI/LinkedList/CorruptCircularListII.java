package CTCI.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class CorruptCircularListII{

	public void findLoopStart(LinkedList ll){
		Node slow = ll.head;
		Node fast = ll.head;

		while(fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) break;
		}

		System.out.println("Collision!");
		slow = ll.head;
		while(fast != slow){
			fast = fast.next;
			slow = slow.next;
		}
		System.out.println("Found \n"+slow.val);
	}

	public static void main(String[] args){
		LinkedList ll = new LinkedList(242);
		ll.addToRear(new Node(194));
		ll.addToRear(new Node(13));
		Node repeat = new Node(666);
		ll.addToRear(repeat);
		ll.addToRear(new Node(99));
		ll.addToRear(new Node(123));
		ll.addToRear(new Node(23));
		ll.addToRear(repeat);
		CorruptCircularListII obj = new CorruptCircularListII();
		obj.findLoopStart(ll);

	}
}