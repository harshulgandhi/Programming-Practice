package com.practice.after2017.traveloka;

import java.util.Scanner;

public class B {
	private static char X = 'x';
	private static char O = 'o';
	private static char S = ' ';
	
	
	private void populateOddLength(char[][] arr, int start, int end, int middle) {
		char toPrint = X;
		for(int i = start; i < end; i++){
			if(i % 2 == 0){
				arr[middle][i] = toPrint;
				toPrint = toPrint == X ? O : X;
			} else {
				arr[middle][i] = S;
			}
		}
	}
	
	private void populateEvenLength(char[][] arr, int N, int middle) {
		populateOddLength(arr, 0, N - 1, middle);
		arr[middle][N-1] = S;
		populateOddLength(arr, N, arr.length, middle);
		
	}
	
	private void print(char[][] arr) {
		for(char[] each: arr){
			for(int i = 0; i < each.length; i++) {
				if(each[i] == Character.MIN_VALUE){
					each[i] = ' ';
				}
				System.out.print(each[i]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int len = 2*N - 1;
		char[][] output = new char[2*N-1][2*N-1]; 
		B b = new B();
		if(N % 2 == 0) {
			b.populateEvenLength(output, N, N-1);
		} else {
			b.populateOddLength(output, 0, len, N - 1);
		}
		
		for( int i = N - 2 ; i >= 0; i--){
			for(int j = len - 2; j >= N - 1; j--){
				output[i][j] = output[i+1][j+1];
			}
		}
		
		for( int i = N ; i < len; i++){
			for(int j = 1; j < N; j++){
				output[i][j] = output[i-1][j-1];
			}
		}
		
		b.print(output);
		
	}
	
}
