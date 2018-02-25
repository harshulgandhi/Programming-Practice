package com.practice.before2017.CTCI.LinkedList;
public class Node{
    int val = 0;
    Node next = null;
    
    Node(int val){
        this.val = val;    
    }
    
    public Node(int val, Node next) {
    	this.val = val;
    	this.next = next;
    }
    public int getVal() {
    	return this.val;
    }
    
    public void setVal(int val) {
    	this.val = val;
    }
    
    public Node getNext() {
    	return this.next;
    }
    
    public void setNext(Node next) {
    	this.next = next;
    }
}