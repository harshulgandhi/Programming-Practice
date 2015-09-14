public class SumOfNumbers{

	static int count = 0;
	static int number1 = 0 ;

	public static int getReverseNumber(Node head){
		count++;
		if(head.next == null){
			return head.val * 
		}
		return getReverseNumber(head.next);
	}

	public static void addNumbers(LinkedList num1, LinkedList num2, boolean isNumberReverse){
		if(isNumberReverse){
			Node head1 = num1.head;
			int number1 = getReverseNumber(head1);
		}
		else{

		}
	}

	public static void main(String[] args){
		LinkedList num1 = new LinkedList(7);
		num1.addToRear(new Node(1));
		num1.addToRear(new Node(6));
		LinkedList num2 = new LinkedList(5);
		num2.addToRear(new Node(9));
		num2.addToRear(new Node(2));
	}
}