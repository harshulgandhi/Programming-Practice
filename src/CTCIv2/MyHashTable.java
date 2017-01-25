package CTCIv2;

import java.util.ArrayList;
import java.util.List;

public class MyHashTable<K, V> {
	private Node<K, V>[] index;
	private int INITIAL_CAPACITY = 16;
	
	MyHashTable(){
		index = new Node[INITIAL_CAPACITY];
	}
	
	public void put(K key, V value) {
		System.out.println("[Put operation] Key : "+key.hashCode()+"; Bucket index : "+key.hashCode()%INITIAL_CAPACITY+"; Value : "+value);
		int idx = key.hashCode() % INITIAL_CAPACITY;
		if(index[idx] == null) {
			index[idx] = new Node(key, value, null);
			return;
		}
		Node curr = index[idx];
		//Go to last node
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.next = new Node(key, value, null);
	}
	
	public V get(K key){
		System.out.println("Getting value for key "+key+"[Hash code value is "+key.hashCode()+"]");
		int idx = key.hashCode() % INITIAL_CAPACITY;
		Node first = index[idx];
		while(key.hashCode() != first.getKey().hashCode()){
			first = first.next;
		}
		return (V) first.getValue();
	}
	class Node<K, V> {
		private K key;
		private V value;
		private Node next;
		Node(K key, V value, Node next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}
		
		public K getKey() {
			return key;
		}
		public V getValue() {
			return value;
		}
		
		
	}
	
	public static void main(String[] args) {
		MyHashTable<String, Integer> ht = new MyHashTable<String, Integer>();
		ht.put("One", 1);
		ht.put("Two", 2);
		ht.put("Three", 3);
		ht.put("Four", 4);
		ht.put("Five", 5);
		
		System.out.println(ht.get("Three"));
	}
}
