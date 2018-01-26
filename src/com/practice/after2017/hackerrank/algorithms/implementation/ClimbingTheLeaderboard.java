package com.practice.after2017.hackerrank.algorithms.implementation;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ClimbingTheLeaderboard {
	
	public static int printCurrentRank(int score, int[] scores, int lastIndex){
		int newIndex = 0;
		newIndex = binarySearch(scores, 0, lastIndex, score);
		System.out.println(newIndex+2);

		return newIndex;
	}
	
	public static int binarySearch(int[] arr, int start, int end, int ele) {
		if(start > end) return end;
		
		int mid = start + (end - start) / 2;
		if(arr[mid] == ele) return mid - 1;
		else if(arr[mid] > ele) return binarySearch(arr, mid+1, end,ele);
		else return binarySearch(arr, start, mid-1,ele);
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[] scores = new int[N];
		int prev = s.nextInt();
		scores[0] = prev;
		int i = 0;
		while(N-- > 1) {
			int next = s.nextInt();
			if(next != prev) {
				i++;
				scores[i] = next;
				prev = next;
			}
		}
		int lastIndex = i;
		
		int M = s.nextInt();
		int currIndex = N;
		for(int j = 0; j < M; j++) {
			currIndex = printCurrentRank(s.nextInt(), scores, lastIndex);
		}
		s.close();
	}
}
