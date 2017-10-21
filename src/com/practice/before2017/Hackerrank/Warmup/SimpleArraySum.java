package com.practice.before2017.Hackerrank.Warmup;

import java.util.Scanner;

public class SimpleArraySum {
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int arr[] = new int[N];
		for(int i=0;i<N;i++){
			arr[i] = s.nextInt();
		}
		int sum = 0;
		for(int each:arr){
			sum += each;
		}
		System.out.println(sum);
		
	}
}
