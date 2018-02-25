package com.practice.after2017.leetcode.algorithms;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
	public int lengthOfLongestSubstring(String s) {
		if(s.equals("")) return 0;
		int maxLen = Integer.MIN_VALUE;
		int ssLen = 0;
		Set<Character> subStr = new HashSet<>();
		int L = s.length();
		for(int i = 0 ; i < L; i++) {
			subStr.add(s.charAt(i));
			ssLen++;
			maxLen = ssLen >= maxLen ? ssLen : maxLen;
			int j = i + 1;
			for (; j < L; j++) {
				if(!subStr.contains(s.charAt(j))) {
					ssLen++;
					subStr.add(s.charAt(j));
					maxLen = ssLen >= maxLen ? ssLen : maxLen;
				} else {
					ssLen = 0;
					subStr = new HashSet<>();
					break;
				}
			}
			if(j == L) break; 
		}
		
		return maxLen;
    }
	
	public static void main(String[] args) {
		LongestSubstring ls = new LongestSubstring();
		System.out.println(ls.lengthOfLongestSubstring("abccba"));
	}
}
