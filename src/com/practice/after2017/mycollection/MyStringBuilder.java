package com.practice.after2017.mycollection;

import java.util.ArrayList;
import java.util.List;

public class MyStringBuilder {

	private List<String> strings;
	private final int DEFAULT_CHAR_BUFFER = 16;
	private char[] buffer;
	private int capacity;
	
	public MyStringBuilder() {
		buffer = new char[DEFAULT_CHAR_BUFFER];
		capacity = DEFAULT_CHAR_BUFFER;
	}
	
	public MyStringBuilder(String input) {
		buffer = new char[input.length() + DEFAULT_CHAR_BUFFER];
		capacity = DEFAULT_CHAR_BUFFER + input.length();
		append(input);
	}
	
	public void append(String str) {
		if(capacity < str.length()) {
			buffer = increaseBuffer(buffer);
		}
		int startFilling = buffer.length - capacity;
		for(int i = 0; i < str.length(); i++){
			buffer[i+startFilling] = str.charAt(i);
		}
		capacity = capacity - str.length();
	}
	
	private char[] increaseBuffer(char[] buffer) {
		int newSize = buffer.length * 2;
		capacity = capacity + buffer.length;
		char[] newBuffer = new char[newSize];
		for(int i = 0 ; i < buffer.length; i++) {
			newBuffer[i] = buffer[i];
		}
		return newBuffer;
	}
	
	public int length() {
		return buffer.length - capacity;
	}
	
	public String toString() {
		return new String(buffer);
	}
	
	public char charAt(int index) {
		return buffer[index];
	}
	
	public void print() {
		System.out.println(toString());
	}
}
