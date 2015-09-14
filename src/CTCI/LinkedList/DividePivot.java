import java.util.Scanner;

public class DividePivot{

	public static Node mergeInOrder(LinkedList less, LinkedList greater){
		System.out.println("\nMerging lists");
		Node head1 = less.head;
		while(head1.next != null){head1 = head1.next;}
		head1.next = greater.head;
		return less.head;

	}

	public static void print(Node head){
		Node head1 = head;
        while(head1 != null){
            System.out.print(head1.val+"-");
            head1 = head1.next;
        }
	}
	public static Node pivot(Node head, int val){
		LinkedList less = null;
		LinkedList greater = null;
		Node mainHead = head;
		while(mainHead != null){
			if(mainHead.val < val){
				if(less == null){
					less = new LinkedList(mainHead.val);
				}else{
					less.addToRear(new Node(mainHead.val));
				}
			}
			else{
				if(greater == null){
					greater = new LinkedList(mainHead.val);
				}else{
					greater.addToRear(new Node(mainHead.val));
				}
			}
			mainHead = mainHead.next;
		}
		System.out.println("\nLesser part of list : ");
		print(less.head);
		System.out.println("\nGreater part of list : ");
		print(greater.head);
		return mergeInOrder(less, greater);
	}

	public static void main(String[] args){
		LinkedList ll = new LinkedList(10);
		ll.addToRear(new Node(194));
		ll.addToRear(new Node(13));
		ll.addToRear(new Node(134));
		ll.addToRear(new Node(99));
		ll.addToRear(new Node(123));
		ll.addToRear(new Node(23));

		int pivot = 100;

		Node headMerged = DividePivot.pivot(ll.head, pivot);
		DividePivot.print(headMerged);
	}
}