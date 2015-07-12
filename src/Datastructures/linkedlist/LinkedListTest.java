 package Datastructures.linkedlist;

class LinkedListTest{
	public static void main(String[] args){
		LinkedList ll = new LinkedList();
		ll.printList();
		
		ll.addElement(10);
		ll.addElement(11);
		ll.addElement(14);
		ll.addElement(15);
		ll.addElement(12);
		ll.addElement(13);
		ll.addElement(16);
		ll.addElement(99);
		
		ll.printList();
			
	}
}