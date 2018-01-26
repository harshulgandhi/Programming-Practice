package com.practice.after2017.hackerrank.algorithms.strings;

import java.util.Scanner;

public class TwoCharacters {
	
	public static int getAlternatingLength(String input) {
		int[] frequency = getFreqArray(input);
		for(int i = 0; i < 26; i++) {
			if(frequency[i] != 0) {
				char c = (char) ('a' + i);
				if(input.contains(""+c+c)) {
					input = input.replace(""+c, "");
					frequency[i] = 0;
					i = 0;
				}
			}
		}
		// after cleanup
		int maxLen = -1;
		int len = input.length();
		for(int i = 0; i < len - 1; i++) {
			int currLen = 2;
			char lookFor = input.charAt(i);
			char alternating = input.charAt(i+1);
			for(int j = i+1; j < len; j++) {
				if(input.charAt(j) == lookFor) {
					lookFor = alternating;
					alternating = input.charAt(i);
					currLen++;
				}
			}
			maxLen = maxLen < currLen ? currLen : maxLen;
		}
		return maxLen;
	}
	
	private static int[] getFreqArray(String input) {
		int[] frequency = new int[26];
		for(char eachCharacter : input.toCharArray()) {
			frequency[eachCharacter - 'a']++;
		}
		return frequency;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int len = s.nextInt();
		String input = s.next();
		System.out.println(getAlternatingLength(input));
	}
}
