package com.practice.after2017.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class AppendAndDelete {
	private static final String YES="Yes";
	private static final String NO="No";
	public static void isConvertable(String A, String B, int steps) {
		int lenA = A.length();
		int lenB = B.length();
		if(steps >= lenA + lenB) {
			System.out.println(YES);
			return;
		}
		int i = 0;
		while(i<A.length()
				&& i<B.length() 
				&& A.charAt(i) == B.charAt(i)) i++;
		if(i == 0) {
			System.out.println(steps >= lenA + lenB ? YES : NO);
			return;
		} else {
			int uncommonInA = lenA - i;
			int uncommonInB = lenB - i;
			int extraOperation = steps - (uncommonInA + uncommonInB);
			System.out.println(
					(extraOperation % 2 ==  0)
					&& (extraOperation >= 0) ? YES : NO);
			return;
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String one = s.next();
		String two = s.next();
		int steps = s.nextInt();
		isConvertable(one, two, steps);
	}
}
