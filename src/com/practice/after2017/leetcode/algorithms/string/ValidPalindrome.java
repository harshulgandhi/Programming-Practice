package com.practice.after2017.leetcode.algorithms.string;

/**
 * https://leetcode.com/problems/valid-palindrome/description/
 * https://leetcode.com/problems/valid-palindrome-ii/description/
 */
public class ValidPalindrome {
	public boolean isPalindrome(String s) {
		s = s.toLowerCase();
		if (s.length() == 0 || s.length() == 1) {
			return true;
		}
		for (int i = 0, j = s.length() - 1; i <= j; i++, j--) {
			while (i < s.length() - 1 && !isAlphanumeric(s.charAt(i))) {
				i++;
			}
			while (j > 0 && !isAlphanumeric(s.charAt(j))) {
				j--;
			}
			if (i <= j && s.charAt(i) != s.charAt(j)) {
				return false;
			}
		}
		return true;
	}

	private boolean isAlphanumeric(char c) {
		return (c >= 48 && c <= 57) || (c >= 97 && c <= 122);
	}

	// A much better version of this is written in method validPalindromeBETTER
	// method
	public boolean validPalindrome(String s) {
		int len = s.length();
		if (len == 0 || len == 1 || len == 2) {
			return true;
		}
		boolean wildCardConsumed = false;
		for (int i = 0, j = len - 1; i <= j; i++, j--) {
			if (s.charAt(i) != s.charAt(j)) {
				if (wildCardConsumed) {
					return false;
				} else {
					if (s.charAt(i + 1) == s.charAt(j) && checkOverTwoChar(s, i + 1, j)) {
						wildCardConsumed = true;
						i += 1;
					} else if (s.charAt(i) == s.charAt(j - 1) && checkOverTwoChar(s, i, j - 1)) {
						wildCardConsumed = true;
						j -= 1;
					} else if (i + 1 == j) {
						return true;
					} else {
						return false;
					}
				}
			}
		}
		return true;
	}

	private boolean checkOverTwoChar(String s, int l, int r) {
		return s.charAt(l + 1) == s.charAt(r - 1);
	}

	public boolean validPalindromeBETTER(String s) {
		int l = -1, r = s.length();
		while (++l < --r) {
			if (s.charAt(l) != s.charAt(r)) {
				return isPalindromeRange(s, l + 1, r) || isPalindromeRange(s, l, r - 1);
			}
		}
		return true;
	}

	private boolean isPalindromeRange(String s, int l, int r) {
		while (l < r) {
			if (s.charAt(l) != s.charAt(r))
				return false;
			l++;
			r--;
		}
		return true;
	}

	public static void main(String[] args) {
		ValidPalindrome vp = new ValidPalindrome();
		System.out.println(vp.validPalindromeBETTER("abc"));
	}

}
