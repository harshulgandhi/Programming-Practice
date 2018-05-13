package com.practice.after2017.leetcode.algorithms.numbers;

/**
 * https://leetcode.com/problems/palindrome-number/description/
 */
public class NumberPalindrome {
	public boolean isPalindrome(int x) {
		if (x < 0)
			return false;
		String num = String.valueOf(x);
		for (int i = 0, j = num.length() - 1; i <= j; i++, j--) {
			if (num.charAt(i) != num.charAt(j)) {
				return false;
			}
		}
		return true;
	}

	public boolean isPalindromeInt(int x) {
		if (x < 0)
			return false;
		if (x < 10)
			return true;
		int i = 0;
		while (Math.pow(10, i) < x) {
			i++;
		}
		int p = i - 1;
		while (x > 0) {
			int first = (int) (x / Math.pow(10, p));
			int last = x % 10;
			if (first != last)
				return false;
			x = (int) ((x % Math.pow(10, p)) / 10);
			p -= 2;
		}
		return true;
	}

	public static void main(String[] args) {
		NumberPalindrome np = new NumberPalindrome();
		System.out.println(np.isPalindromeInt(1));
	}
}
