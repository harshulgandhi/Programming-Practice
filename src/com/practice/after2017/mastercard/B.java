package com.practice.after2017.mastercard;

import java.util.Arrays;
import java.util.Scanner;

public class B {
	/*
     * Complete the function below.
     */
    static int[] counts(int[] nums, int[] maxes) {
    	int[] result = new int[maxes.length];
    	Arrays.sort(nums);
    	for(int i = 0; i < maxes.length; i++) {
    		int idx = Arrays.binarySearch(nums, maxes[i]);
    		if(idx >= 0) {
    			result[i] = idx + 1;
    		} else if (idx < 0) {
    			result[i] = -1 * (idx + 1);
    		}
    	}
    	
    	return result;
    }
    
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int n[] = new int[N];
		for(int i = 0; i<N; i++) {
			n[i] = s.nextInt();
		}
		
		int M = s.nextInt();
		int m[] = new int[M];
		for(int i = 0; i<M; i++) {
			m[i] = s.nextInt();
		}
		
		int[] r = counts(n, m);
		for(Integer each : r) {
			System.out.println(each);
		}
	}
}
