package com.practice.after2017.algorithm.misc;

/**
 * At a time a person can take either 1 step , 2 steps or 3 steps. 
 * Find out total number of ways in which that person can climb a staircase
 * of N steps
 */
public class StairCase {
	
	public int noOfWays(int N) {
		if (N == 0) return 1;
		if (N == 1) return 1;
		if (N == 2) return 2;
		return noOfWays(N-1) + noOfWays(N-2) + noOfWays(N-3);
	}
	
	public static void main(String[] args) {
		StairCase sc = new StairCase();
		System.out.println(sc.noOfWays(45));
	}
}
