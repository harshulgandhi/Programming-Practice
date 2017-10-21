package com.practice.before2017.Hackerrank.Warmup;

import java.util.Scanner;

public class VeryBigSum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		long arr[] = new long[N];
		for(int i=0;i<N;i++){
			arr[i] = s.nextLong();
		}
		long sum = 0;
		for(long each:arr){
			sum += each;
		}
		System.out.println(sum);
		
	}
}
