package CTCI.LinkedList;
public class SumOfNumbers{

	static int count = 0;
	static int number1 = 0 ;


	public static LinkedList addNumbers(LinkedList num1, LinkedList num2, boolean isNumberReverse){
		LinkedList result = null;
		int carry = 0;
		if(isNumberReverse){
			Node head1 = num1.head;
			Node head2 = num2.head;
			while(head1.next != null && head2.next != null){
				if(result == null){
					result = new LinkedList((head1.val+head2.val+carry)%10);
					carry = (head1.val+head2.val+carry)/10;
					Node resHead = result.head;
				}else{
					result.addToRear(new Node((head1.val+head2.val+carry)%10));
					carry = (head1.val+head2.val+carry)/10;
				}
				head1 = head1.next;
				head2 = head2.next;
			}
		}

		return result;
		
	}

	public static void main(String[] args){
		LinkedList num1 = new LinkedList(7);
		num1.addToRear(new Node(1));
		num1.addToRear(new Node(6));
		LinkedList num2 = new LinkedList(5);
		num2.addToRear(new Node(9));
		num2.addToRear(new Node(2));
		System.out.println("num1 = ");
		LinkedList result = addNumbers(num1, num2, true);
		result.printLinkedList();

	}
}