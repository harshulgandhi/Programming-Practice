package com.practice.before2017.Hackerrank.Sorting;
import java.util.Scanner;

public class SherlockAndWatson {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int K = s.nextInt()%N;
		int Q = s.nextInt();
		int p = N;
		int[] inpArr = new int[N];
		for (int i = 0;i<N;i++){
			inpArr[i] = s.nextInt();
		}
		
		while(Q-->0){
			int idx = s.nextInt();
			System.out.println((idx < K)?inpArr[N-K+idx]:inpArr[idx-K]);
		}
	}
}
