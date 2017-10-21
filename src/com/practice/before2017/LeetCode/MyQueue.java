package com.practice.before2017.LeetCode;

import java.util.Stack;

/*
 * Queue using stack
 * */
public class MyQueue{
	Stack<Integer> st = new Stack<>();
	public void push(int x){
		st.push(x);
	}
	
	public void pop(){
		Stack<Integer> temp = new Stack<>();
		while(!st.empty()){
			temp.push(st.pop());
		}
		temp.pop();
		while(!temp.empty()){
			st.push(temp.pop());
		}
	}
	
	public int peek(){
		Stack<Integer> temp = new Stack<>();
		if(st.empty()) return 0;
		while(!st.empty()){
			temp.push(st.pop());
		}
		int frnt = temp.peek();
		while(!temp.empty()){
			st.push(temp.pop());
		}
		return frnt;
	}
	
	public boolean empty(){
		return st.empty();
	}
	
	public static void main(String[] args) {
		MyQueue mq = new MyQueue();
		mq.push(10);
		mq.push(11);
		mq.push(12);
		mq.push(13);
		mq.push(14);
		System.out.println(mq.peek());
		mq.pop();
		System.out.println(mq.peek());
		
	}
}
