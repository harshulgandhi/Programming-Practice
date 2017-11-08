package com.practice.after2017.hackerrank.algorithms.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ClosestNumbers {
	
	public List<Integer> findClosestPairs(int[] inputArray) {
		Arrays.sort(inputArray);
		List<Integer> closestPairs = new ArrayList<>();
		int minDiff = Integer.MAX_VALUE;
		for(int i = 0 ; i < inputArray.length - 1; i++) {
			if(minDiff > Math.abs(inputArray[i] - inputArray[i + 1])) {
				minDiff = Math.abs(inputArray[i] - inputArray[i + 1]);
			}
		}
		
		for(int i = 0 ; i < inputArray.length - 1; i++) {
			if(minDiff == Math.abs(inputArray[i] - inputArray[i + 1])) {
				closestPairs.add(inputArray[i]);
				closestPairs.add(inputArray[i+1]);
			}
		}
		
		return closestPairs;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[] numbers = new int[N];
		for(int i = 0; i<N;i++){
			numbers[i] = s.nextInt();
		}
		
		ClosestNumbers cn = new ClosestNumbers();
		List<Integer> closestPair = cn.findClosestPairs(numbers);
		for(int i = 0 ; i < closestPair.size(); i++) {
			if(i < closestPair.size() - 1) {
				System.out.print(closestPair.get(i) + " ");
			} else {
				System.out.print(closestPair.get(i));
			}
		}
		
	}
}
