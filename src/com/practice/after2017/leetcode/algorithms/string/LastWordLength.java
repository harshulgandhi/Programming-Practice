package com.practice.after2017.leetcode.algorithms.string;

/**
 * https://leetcode.com/problems/length-of-last-word
 */
public class LastWordLength {
	public int lengthOfLastWord(String s) {
		String[] split = s.split(" ");
		if (split.length == 0)
			return 0;
		return split[split.length - 1].length();
	}

	public static void main(String[] args) {
		LastWordLength lwl = new LastWordLength();
		System.out.println(lwl.lengthOfLastWord(" s "));
	}
}
