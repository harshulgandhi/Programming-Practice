
public class LinkedList{
    Node head = null;
    
    LinkedList(int val){
        head = new Node(val);
    }
    
    public void addToRear(Node node){
        Node head1 = head;
        while(head1.next != null){
            head1 = head1.next;
        }
        head1.next = node;
    }
    
    public void printLinkedList(){
        Node head1 = head;
        while(head1.next != null){
            System.out.print(head1.val+"-");
            head1 = head1.next;
        }
    }
    
}