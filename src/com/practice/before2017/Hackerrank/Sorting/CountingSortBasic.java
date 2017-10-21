package com.practice.before2017.Hackerrank.Sorting;

import java.util.Scanner;

public class CountingSortBasic {
	
	public static void printArr(int[] arr){
		for(int a : arr){
			System.out.print(a+" ");
		}
		System.out.println();
	}
	
	public static void countingSort(int[] freq){
		for(int i = 0;i<100;i++){
			while(freq[i]-->0){
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] freq = new int[100];
		while(N-->0){
			freq[sc.nextInt()]++;
			
		}
		countingSort(freq);
		
	}
}
