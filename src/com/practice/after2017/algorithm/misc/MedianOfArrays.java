package com.practice.after2017.algorithm.misc;

import java.util.Arrays;

/**
 * Find median of two arrays
 * 
 *  THE MERGE APPROACH
 */
public class MedianOfArrays {
	public int median(int[] A, int[] B) {
		Arrays.sort(A);
		Arrays.sort(B);
		int lenA = A.length;
		int lenB = B.length;
		int totalLen = lenA + lenB;
		int[] merged = new int[(totalLen/2) + 1];
		
		int idxA = 0, idxB = 0;
		for(int i = 0; i < merged.length; i++) {
			if(idxA >= lenA || A[idxA] > B[idxB]) {
				merged[i] = B[idxB];
				idxB++;
			} else if(idxB >= lenB || B[idxB] > A[idxA]){
				merged[i] = A[idxA];
				idxA++;
			}
		}
		
		if(totalLen % 2 == 0) {
			return (merged[merged.length-2] + merged[merged.length-1])/2;
		} else {
			return merged[merged.length-1];
		}
	}
	
	public static void main(String[] args) {
		MedianOfArrays moa = new MedianOfArrays();
		System.out.println(moa.median(new int[]{12,1,15,38,26}, new int[]{13,45,2,30}));
	}
}
