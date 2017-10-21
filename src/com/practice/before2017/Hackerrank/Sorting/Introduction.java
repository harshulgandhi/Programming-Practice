package com.practice.before2017.Hackerrank.Sorting;
import java.util.Scanner;

public class Introduction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[n];
		int i = 0;
		while(n-->0){
			arr[i] = sc.nextInt();
			if(arr[i] == V) System.out.println(i);
			i++;
		}
	}
}
