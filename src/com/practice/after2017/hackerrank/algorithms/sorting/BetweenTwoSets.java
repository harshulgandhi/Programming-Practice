package com.practice.after2017.hackerrank.algorithms.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BetweenTwoSets {
	
	static int getTotalX(int[] A, int[] B){
		int totalX = 0;
		Arrays.sort(A);
		Arrays.sort(B);
		int numberBetween = A[A.length - 1];
		
		while(numberBetween <= B[0]) {
			if(isArrayDivisibleByNumber(A, numberBetween) 
					&& isNumberDivisibleByArray(B, numberBetween)){
				totalX++;
			}
			numberBetween++;
		}
		
		
		return totalX;
	}
	
	static boolean isArrayDivisibleByNumber(int[] arr, int num) {
		for(int i = 0; i < arr.length; i++) {
			if(num % arr[i] != 0) return false;
		}
		return true;
	}
	
	static boolean isNumberDivisibleByArray(int[] arr, int num) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % num != 0) return false;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();
		int[] A = new int[N];
		int[] B = new int[M];
		for(int i = 0 ; i< N; i++) {
			A[i] = s.nextInt();
		}
		for(int i = 0; i< M; i++) {
			B[i] = s.nextInt();
		}
		
		System.out.println(getTotalX(A, B));
	}
}
