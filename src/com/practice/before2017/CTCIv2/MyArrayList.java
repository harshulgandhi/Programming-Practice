package com.practice.before2017.CTCIv2;

import java.util.Arrays;

public class MyArrayList<E> {
	private int DEFAULT_SIZE = 1;
	private Object elements[];
	private int filledSize=0;

	MyArrayList() {
		elements = new Object[DEFAULT_SIZE];
	}
	public void add(Object element) {
		if(filledSize == elements.length) {
			increaseArray();
		}
		elements[filledSize] = element;
		filledSize++;
	}
	
	private void increaseArray() {
		elements = Arrays.copyOf(elements, elements.length * 2);
	}
	
	public Object getValueAt(int index) {
		return elements[index];
	}
	
	public int size() {
		return filledSize;
	}
}
