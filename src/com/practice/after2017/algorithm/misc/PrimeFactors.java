package com.practice.after2017.algorithm.misc;

public class PrimeFactors {
	public static void main(String[] args) {
		int N = 378;
		int i = 2;
		
		while(N > 1) {
			if(N % i == 0) {
				N = N/i;
				System.out.print(i+" ");
			} else{
				i++;
			}
		}
	}
}
