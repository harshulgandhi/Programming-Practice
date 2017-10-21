package com.practice.before2017.TopCoder.BruteForce;

import java.util.Arrays;

public class SwapAndArithmetic {
	
	public String able(int[] x) {
		if(x.length == 1) return "Possible";
		Arrays.sort(x);
		int d = x[1] - x[0];
		for(int i = 0; i<x.length-1; i++) {
			if(x[i+1] - x[i] != d) {
				return "Impossible";
			}
		}
		return "Possible";
	}
	
	public static void main(String[] args) {
		SwapAndArithmetic saa = new SwapAndArithmetic();
		System.out.println(saa.able(new int[]{11}));
	}
}
