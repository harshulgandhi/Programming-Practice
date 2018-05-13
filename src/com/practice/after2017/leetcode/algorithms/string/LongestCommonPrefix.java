package com.practice.after2017.leetcode.algorithms.string;

/**
 * https://leetcode.com/problems/longest-common-prefix/
 */
public class LongestCommonPrefix {
	public static String longestCommonPrefix(String[] strs) {
		if (strs.length == 0)
			return "";
		if (strs.length == 1)
			return strs[0];
		int i = 0;
		int maxLen = strs[0].length();
		for (i = 0; i < maxLen; i++) {
			for (int j = 1; j < strs.length; j++) {
				if (i > strs[j].length() - 1 || strs[j].charAt(i) != strs[j - 1].charAt(i)) {
					return strs[0].substring(0, i);
				}
			}
		}
		return strs[0].substring(0, i);
	}

	public static void main(String[] args) {
		String[] strs = new String[] { "aaaa", "aaa", "aa" };
		System.out.println(longestCommonPrefix(strs));
	}
}
