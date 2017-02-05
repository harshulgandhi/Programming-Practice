package CTCIv2;


public class MyQueue<T> {
	
	private MyQueueNode<Integer> first = null;
	private MyQueueNode<Integer> last = null;
	
	public void add(T val) {
		if(first == null) {
			last = new MyQueueNode(val, null);
			first = last;
			return;
		}
		MyQueueNode toAdd = new MyQueueNode(val, null);
		last.next = toAdd;
		last = toAdd;
	}
	
	public MyQueueNode remove() {
		if(first == null) throw new MyStackException("Queue is empty");
		MyQueueNode n = first;
		first = first.next;
		return n;	
	}
	
	public MyQueueNode peek(){
		if(first == null) throw new MyStackException("Queue is empty");
		MyQueueNode n = first;
		return n;
	}
	
	private class MyQueueNode<T> {
		private T val;
		private  MyQueueNode next;
		
		public MyQueueNode(T val, MyQueueNode next){
			this.val = val;
			this.next = next;
		}
	}
	public static void main(String[] args) {
		MyQueue<Integer> stack = new MyQueue<>();
//		System.out.println(stack.remove().val);
		stack.add(28);
		stack.add(23);
		stack.add(222);
		stack.add(565);
		stack.add(19);
		System.out.println(stack.peek().val);
		System.out.println(stack.remove().val);
		System.out.println(stack.peek().val);
		System.out.println(stack.remove().val);
		System.out.println(stack.remove().val);
		System.out.println(stack.remove().val);
		System.out.println(stack.remove().val);
//		System.out.println(stack.peek().val);
	}
}
