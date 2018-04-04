package com.practice.after2017.leetcode.algorithms;

/**
 * https://leetcode.com/problems/count-and-say/description/
 */
public class CountAndSay {
	public String countAndSay(int n) {
		StringBuilder result = new StringBuilder();
		if (n == 1 || n == 0) {
			return n + "";
		}
		result = new StringBuilder("1");
		for (int i = 1; i < n; i++) {
			int len = result.length();
			int cnt = 1;
			StringBuilder currentRes = new StringBuilder();
			for (int j = 0; j < len; j++) {
				while (j + 1 < len && result.charAt(j) == result.charAt(j + 1)) {
					j++;
					cnt++;
				}
				currentRes.append(cnt + "" + result.charAt(j));
				cnt = 1;
			}
			result = currentRes;
		}
		return result.toString();
	}

	public static void main(String[] args) {
		CountAndSay cas = new CountAndSay();
		System.out.println(cas.countAndSay(30));
	}
}
