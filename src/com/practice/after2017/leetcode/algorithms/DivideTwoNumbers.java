package com.practice.after2017.leetcode.algorithms;

/**
 * https://leetcode.com/problems/divide-two-integers
 * 
 * Solution is INCOMPLETE
 */
public class DivideTwoNumbers {
	public int divide(int dividend, int divisor) {
		int quotient = 0;
		if (dividend == Integer.MIN_VALUE || divisor == Integer.MIN_VALUE || dividend == Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		}
		if (dividend == 0 || Math.abs(dividend) < Math.abs(divisor) || divisor == Integer.MAX_VALUE)
			return quotient;
		if (divisor == 0)
			return Integer.MAX_VALUE;
		int reducing = Math.abs(dividend);
		int absoluteDivisor = Math.abs(divisor);
		while (reducing >= absoluteDivisor) {
			quotient++;
			reducing = reducing - absoluteDivisor;
		}
		if ((dividend < 0 && divisor < 0) || (dividend > 0 && divisor > 0)) {
			return quotient;
		} else {
			return quotient * -1;
		}

	}

	public static void main(String[] args) {
		DivideTwoNumbers div = new DivideTwoNumbers();
		// System.out.println(div.divide(-2147483648, -1));
		Long l = (long) (-1 * Integer.MIN_VALUE);
	}
}
