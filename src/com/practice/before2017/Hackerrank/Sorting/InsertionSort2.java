package com.practice.before2017.Hackerrank.Sorting;

import java.util.Scanner;

public class InsertionSort2 {
	
	public static void printArr(int arr[]){
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void swap(int arr[], int i, int j){
		arr[i] = arr[i] - arr[j];
		arr[j] = arr[i] + arr[j];
		arr[i] = arr[j] - arr[i];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] inputArr = new int[N];
		for(int i = 0;i<N;i++){
			inputArr[i] = sc.nextInt();
		}
		
		for(int i = 1;i<N;i++){
			if(inputArr[i]>inputArr[i-1]){
				printArr(inputArr);
				continue;
			}
			else{
				int j = i;
				do{
					if(inputArr[j] < inputArr[j-1]){
						swap(inputArr,j-1,j);
					}
				}while(j-->1);
			}
			printArr(inputArr);
		}
	}
}
