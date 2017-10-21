package com.practice.before2017.CTCIv2.StacksAndQueue;

import com.practice.before2017.CTCIv2.MyStack;

public class StackWithMin {
	int SIZE = 10;
	StackNodeMin[] stack = new StackNodeMin[SIZE];
	int topIdx = -1;
	
	public void push(int val) {
		StackNodeMin node = null;
		if(topIdx == -1) {
			node = new StackNodeMin(val, val);		
		} else {
			node = new StackNodeMin(val, Math.min(val, min()));
		}
		topIdx++;
		stack[topIdx] = node; 
	}
	
	public StackNodeMin pop(){
		StackNodeMin popped = stack[topIdx];
		topIdx--;
		return popped;
	}
	
	public StackNodeMin peek() {
		return stack[topIdx];
	}
	
	public int min() {
		return peek().min;
	}
	public class StackNodeMin{
		int val;
		int min;
		
		StackNodeMin(int val, int min) {
			this.val = val;
			this.min = min;
		}
		
	}
	
	public static void main(String[] args) {
		StackWithMin st = new StackWithMin();
//		System.out.println(stack.pop().val);
		st.push(28);
		st.push(23);
		st.push(222);
		st.push(565);
		st.push(19);
		System.out.println(st.peek().val);
		System.out.println(st.min());
		System.out.println(st.pop().val);
		System.out.println(st.peek().val);
		System.out.println(st.min());
		System.out.println(st.pop().val);
		System.out.println(st.min());
		System.out.println(st.pop().val);
		System.out.println(st.min());
		System.out.println(st.pop().val);
		System.out.println("last min "+st.min());
		System.out.println(st.pop().val);
//		System.out.println(st.min());
		
	}
}
