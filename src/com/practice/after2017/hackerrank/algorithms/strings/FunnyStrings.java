package com.practice.after2017.hackerrank.algorithms.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/funny-string/problem 
 * */
public class FunnyStrings {
	static String findString(String s) {
		for(int i = 0, j = s.length() - 1; i < j; i++, j--) {
			if (Math.abs(s.charAt(i) - s.charAt(i+1)) != Math.abs(s.charAt(j) - s.charAt(j - 1))) {
				return "Not Funny";
			}
		}
		return "Funny";
	}
	
	public static void main(String[] args) {
		FunnyStrings fs  = new FunnyStrings();
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		List<String> input = new ArrayList<>();
		while(T-- > 0) {
			input.add(s.next());
		}
		
		for(String inp : input) {
			fs.findString(inp);
		}
	}
}
