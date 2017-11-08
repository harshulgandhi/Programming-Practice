package com.practice.after2017.algorithm.misc;

public class Fibonacci {
	public static int fib(int n) {
		switch(n) {
			case 0: 
				return -1;
			case 1:
				return 0;
			case 2:
				return 1;
			default: 
				return fib(n-1) + fib(n-2);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(fib(18));
	}
}
