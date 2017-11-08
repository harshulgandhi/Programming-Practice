package com.practice.after2017.algorithm.misc;

/**
 * Check if a given number N is a power of another number M 
 */
public class CheckPower {

	public boolean checkIf(int N, int M) {
		if(N == 0) return false;
		if(N == 1) return true;
		
		while(N % M == 0) {
			N = N / M;
		}
		return N == 1;
 	}
	
	public static void main(String[] args) {
		CheckPower cp = new CheckPower();
		System.out.println(cp.checkIf(40, 2));
	}
}
