 package Datastructures.linkedlist;


public class LinkedList{

	Node head;

	LinkedList(){
		head = null;
	}



	public boolean isEmpty(){
		return head == null;
	}

	public void addElement(int element){
		Node n = new Node(element);
		n.next = head;
		head = n;
	}
	
	public void printList(){
		System.out.println("Printing list");
		Node temp = head;
		if(!this.isEmpty()){
			while(temp.next != null){
				System.out.print(temp.element+" --> ");
				temp = temp.next;
			}
			System.out.println();
		}	
		else System.out.println("List is empty");
	}
	
	public void deleteNode(Node del){

	}


	public void deleteElement(int element){
		Node temp = null;
		Node prev = head;
		if(prev.element == element){
			System.out.println("Element to be deleted is the first element.\nDeleting!");
			head = head.next;
		}
		
		else{
			temp = prev.next;
			while(temp.next != null){
				if(temp.element == element){
					prev.next = temp.next;
				}
				prev = temp;
				temp = temp.next;
			}
		}
	}

	/*public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		Node n = new Node(10);
	}*/
}
