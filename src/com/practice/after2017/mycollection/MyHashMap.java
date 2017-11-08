package com.practice.after2017.mycollection;

import java.util.ArrayList;
import java.util.List;

public class MyHashMap<K, V> {
	private final int INDEX_ARRAY_SIZE = 16;
	private List<Pair>[] indexArray;
	
	public MyHashMap() {
		indexArray = new ArrayList[INDEX_ARRAY_SIZE];
	}
	
	public void put(K key, V value) {
		int idxInArray = Math.abs(key.hashCode()) % INDEX_ARRAY_SIZE;
		List<Pair> targetList = indexArray[idxInArray];
		if(targetList == null) {
			List<Pair> list = new ArrayList<Pair>();
			list.add(new Pair(key, value));
			indexArray[idxInArray] = list;
			return;
		}
		List<Pair> list = indexArray[idxInArray];
		list.add(new Pair(key, value));
	}
	
	public void putNonDuplicate(K key, V value) {
		int idxInArray = Math.abs(key.hashCode()) % INDEX_ARRAY_SIZE;
		V v = this.get(key);
		if(v == null) {
			put(key, value);
			return;
		}
		
		Pair entrySet = getEntrySet(key);
		entrySet.setValue(value);
		
	}
	
	public V get(K key) {
		int idxInArray = Math.abs(key.hashCode()) % INDEX_ARRAY_SIZE;
		List<Pair> targetList = indexArray[idxInArray];
		if(targetList == null) {
			return null;
		}
		for(Pair eachPair : targetList) {
			if(eachPair.getKey().equals(key)) {
				return (V) eachPair.getValue();
			}
		}
		
		return null;
	}
	
	public Pair getEntrySet(K key) {
		int idxInArray = Math.abs(key.hashCode()) % INDEX_ARRAY_SIZE;
		List<Pair> targetList = indexArray[idxInArray];
		for(Pair eachPair : targetList) {
			if(eachPair.getKey().equals(key)) {
				return eachPair;
			}
		}
		return null;
	}
	
	public void printMap() {
		for(int i = 0; i < indexArray.length; i++) {
			System.out.print(i + "==> [");
			if(indexArray[i] != null) {
				for(Pair eachPair : indexArray[i]) {
					System.out.print("("+eachPair.getKey()+":"+eachPair.getValue()+"), ");
				}
			}
			System.out.println(" ]");
		}
	}
	
}

class Pair<K,V> {
	private K key;
	private V value;
	
	public void setKey(K key) {
		this.key = key;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	
}