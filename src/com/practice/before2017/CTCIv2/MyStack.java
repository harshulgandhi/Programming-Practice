package com.practice.before2017.CTCIv2;

public class MyStack<T> {

	MyStackNode<T> top = null;
	public void push(T val) {
		if(top == null) {
			top = new MyStackNode<T>(val, null);
			return;
		}
		MyStackNode<T> newNode = new MyStackNode<T>(val, top);
		top = newNode;
	}
	
	public MyStackNode<T> pop(){
		if(top == null) throw new MyStackException("Top is null. Stack is empty.");
		MyStackNode<T> poppedNode = top;
		top = top.next;
		return poppedNode;
	}
	
	public MyStackNode<T> peek() {
		if(top == null) throw new MyStackException();
		MyStackNode<T> peeked = top;
		return peeked;
	}
	
	private class MyStackNode<T> {
		private T val;
		private MyStackNode<T> next;
		
		public MyStackNode(T val, MyStackNode<T> next){
			this.val = val;
			this.next = next;
		}
	}
	public static void main(String[] args) {
		MyStack<Integer> stack = new MyStack<>();
//		System.out.println(stack.pop().val);
		stack.push(28);
		stack.push(23);
		stack.push(222);
		stack.push(565);
		stack.push(19);
		System.out.println(stack.peek().val);
		System.out.println(stack.pop().val);
		System.out.println(stack.peek().val);
		System.out.println(stack.pop().val);
		System.out.println(stack.pop().val);
		System.out.println(stack.pop().val);
		System.out.println(stack.pop().val);
		System.out.println(stack.peek().val);
		
	}
}
