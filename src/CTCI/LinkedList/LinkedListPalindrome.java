
public class LinkedListPalindrome{

	Node head = null;
	boolean isPalindrome = true;
	public void traverseRecursively(Node rhead){
		if(rhead == null){
			return;
		}else{
			traverseRecursively(rhead.next);
			if(head.val != rhead.val){
				isPalindrome = false;
			}
			head = head.next;
		}
	}

	public static void main(String[] args){
		LinkedList ll = new LinkedList(0);
		ll.addToRear(new Node(1));
		ll.addToRear(new Node(2));
		ll.addToRear(new Node(6));
		ll.addToRear(new Node(2));
		ll.addToRear(new Node(1));
		ll.addToRear(new Node(0));
		LinkedListPalindrome obj = new LinkedListPalindrome();
		obj.head = ll.head;
		Node head1 = ll.head;

		obj.traverseRecursively(head1);
		if(obj.isPalindrome) System.out.println("Is Palindrome");
		else System.out.println("Is not Palindrome");
	}
}