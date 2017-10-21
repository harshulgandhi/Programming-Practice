package com.practice.before2017.TopCoder.BruteForce;

public class ThreeIncreasing {
	public int minEaten(int a, int b, int c) {
		if(b == 1 || c == 2) {
			return -1;
		}
		int res = 0;
		if(b >= c) {
			res = res + b - c +1;
			b = b - res;
		}
		if(a >= b) {
			res = res + a - b +1;
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		ThreeIncreasing ti = new ThreeIncreasing();
		System.out.println(ti.minEaten(2789, 2400,1693));
	}
}
