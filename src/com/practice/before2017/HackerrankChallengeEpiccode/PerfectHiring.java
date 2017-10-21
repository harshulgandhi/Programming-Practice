package com.practice.before2017.HackerrankChallengeEpiccode;

import java.util.Scanner;
public class PerfectHiring {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long P = sc.nextLong();
		int X = sc.nextInt();
		long max = 0L;
		int index = 0;
		
		for(int i = 1;i<=N;i++){
			int A = sc.nextInt();
			if(max < P*A){
				max = P*A;
				index = i;
			}
			P -= X;
		}
		
		System.out.println(index);
	}
}