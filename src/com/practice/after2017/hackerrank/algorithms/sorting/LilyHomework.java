package com.practice.after2017.hackerrank.algorithms.sorting;

import java.util.Scanner;

public class LilyHomework {
	
	
	public int findSwapsTaMakeBeautiful(int[] array) {
		return selectionSort(array);
	}
	
	private int selectionSort(int[] array) {
		int swaps = 0;
		for(int i = 0; i < array.length; i++) {
			int minIdx = i;
			for(int j = i; j< array.length; j++) {
				if(array[j] < array[i]) {
					minIdx = j;
					swaps++;
				}
			}
			swap(array, i, minIdx);
		}
			
		return swaps;
	}
	
	private void swap(int[] array, int idxA, int idxB) {
		int temp = array[idxA];
		array[idxA] = array[idxB];
		array[idxB] = temp;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[] array = new int[N];
		for(int i = 0; i < N; i++){
			array[i] = s.nextInt();
		}
		
		LilyHomework lh = new LilyHomework();
		System.out.println(lh.findSwapsTaMakeBeautiful(array));
	}
}
