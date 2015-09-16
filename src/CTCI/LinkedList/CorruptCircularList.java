import java.util.List;
import java.util.ArrayList;

public class CorruptCircularList{

	List<Node> visited = new ArrayList<>();
	public void traverseCorruptList(LinkedList ll){
		Node head1 = ll.head;
		while(!visited.contains(head1)){
			visited.add(head1);
			head1 = head1.next;
		}
		System.out.println(head1.val);
		return;
	}

	public static void main(String[] args){
		LinkedList ll = new LinkedList(242);
		Node repeat = new Node(194);
		ll.addToRear(repeat);
		ll.addToRear(new Node(13));
		ll.addToRear(new Node(99));
		ll.addToRear(new Node(123));
		ll.addToRear(new Node(23));
		ll.addToRear(repeat);
		CorruptCircularList obj = new CorruptCircularList();
		obj.traverseCorruptList(ll);

	}
}