package com.practice.before2017.CTCIv2;

public class MyStackException extends RuntimeException {
	MyStackException() {
		super("Stack is empty");
	}
	MyStackException(String message) {
		super(message);
	}
}
