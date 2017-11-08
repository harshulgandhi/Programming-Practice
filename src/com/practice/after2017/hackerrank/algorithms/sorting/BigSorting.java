package com.practice.after2017.hackerrank.algorithms.sorting;

import java.util.Scanner;

public class BigSorting {
	
	public String[] bigSort(String[] inputArray) {
		quickSort(inputArray, 0, inputArray.length - 1);
		for(String each : inputArray) {
			System.out.println(each);	
		}
		
		return inputArray;
	}
	
	private void quickSort(String[] array, int start, int end) {
		if(end <= start) return;
		int pivot = partition(array, start, end);
		quickSort(array, start, pivot - 1);
		quickSort(array, pivot + 1, end);
	}
	
	private int partition(String[] array, int start, int end) {
		int pivot = end;
		int wall = start;
		for(int i = start; i <= end - 1; i++){
			if(isFirstLessThanSecond(array[i], array[pivot])) {
				swap(array, i, wall);
				wall++;
			}
		}
		swap(array, wall , pivot);
		return wall;
	}
	
	private void swap(String[] array, int idxA, int idxB) {
		String temp = array[idxA];
		array[idxA] = array[idxB];
		array[idxB] = temp;
	}
	
	private boolean isFirstLessThanSecond(String first, String second) {
		return first.length() != second.length() 
				? first.length() < second.length()
				: first.compareTo(second) < 0;
	}
	
	private void printArray(String[] array) {
		for(String each : array) {
			System.out.print(each + " - ");
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		String[] inputStrings = new String[N];
		for(int i = 0; i< N; i++) {
			inputStrings[i] = s.next();
		}
		BigSorting bs = new BigSorting();
		bs.bigSort(inputStrings);
	}
}
