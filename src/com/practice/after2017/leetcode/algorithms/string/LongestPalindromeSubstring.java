package com.practice.after2017.leetcode.algorithms.string;

/**
 * https://leetcode.com/problems/longest-palindromic-substring/description/
 */
public class LongestPalindromeSubstring {

	public static String longestPalindromeEfficient(String s) {
		if (s.equals(""))
			return "";
		if (s.length() == 1)
			return s;
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			String check = palindromeFromIdx(i, i, s);
			if (result.length() < check.length()) {
				result = check;
			}

			check = palindromeFromIdx(i, i + 1, s);
			if (result.length() < check.length()) {
				result = check;
			}
		}
		return result;
	}

	private static String palindromeFromIdx(int i, int j, String s) {
		while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
			i--;
			j++;
		}
		return s.substring(i + 1, j);
	}

	public static String longestPalindrome(String s) {
		if (s.equals(""))
			return "";
		if (s.length() == 1)
			return s;
		StringBuilder result = new StringBuilder("");
		int L = s.length();
		StringBuilder check = new StringBuilder(s);

		for (int i = 0; i < L; i++) {
			for (int j = i + 1; j < L + 1; j++) {
				if (isPalindrome(new StringBuilder(check.subSequence(i, j)))) {
					result = getLonger(new StringBuilder(check.subSequence(i, j)), result);
				}
			}
		}
		return result.toString();

	}

	private static boolean isPalindrome(StringBuilder s) {
		for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
		}
		return true;
	}

	private static StringBuilder getLonger(StringBuilder s1, StringBuilder s2) {
		return s1.length() > s2.length() ? s1 : s2;
	}

	public static void main(String[] args) {
		String s = "bbb";

		// "lqlvciwekzxapmjxyddlaoqhfhwphamsyfwjinkfvciucjhdgwodvmnpkibumexvlsxxumvrznuuyqfavmgwfnsvfbrvqhlvhpxaqehsiwxzlvvtxsnmlilbnmvnxyxitxwoahjricdjdncvartepfpdfndxqoozkfpdmlpvshzzffsspdjzlhmamqooooor";
		System.out.println(longestPalindromeEfficient(s));
	}
}
