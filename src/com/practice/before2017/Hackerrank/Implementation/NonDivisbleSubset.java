package com.practice.before2017.Hackerrank.Implementation;

import java.util.Scanner;

public class NonDivisbleSubset {
	
	public static boolean areAllValidPairs(int[] subset, int k) {
		for(int i = 0; i<subset.length; i++) {
			for(int j = i; j< subset.length; j++) {
				if ((subset[i]+subset[j]) % k == 0) {
					return false;
				}
			}
		}
		return true;	
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int k = s.nextInt();
		int output = 0;
		int arr[] = new int[N];
		for(int i = 0; i < N; i++) {
			int newN = s.nextInt();
			arr[i] = newN;
//			if(i == 0) arr[i] = s.nextInt();
//			if(i > 0) {
//				int newN = s.nextInt();
//				arr[i] = newN;
//				for( int j = i; j >= 0; j--) {
//					for( int m = j-1; m >=0 ; m--) {
//						if((arr[j] + arr[m]) % k == 0) {
//							output++;
//						}
//					}
//				}
//			}
		}
		
		for(int i = 0;i<N;i++) {
			for (int j = i+1; j<N-1;j++) {
				if((arr[i]+arr[j]) % 2 != 0) {
					
				}
			}
		}
	}
}
