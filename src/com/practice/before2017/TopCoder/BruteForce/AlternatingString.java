package com.practice.before2017.TopCoder.BruteForce;

public class AlternatingString {
	public int maxLength(String s) {
		int max = -1;
		if(s.length() == 1) return 1;
		char toCheck = s.charAt(0) == '1' ? '0' : '1';
		int currLength = 1;
		for(int i = 1; i<s.length(); i++) {
			 if(s.charAt(i) == toCheck) {
				 currLength++;
			 } else {
				 max = currLength > max ? currLength : max;
				 currLength = 1;
			 }
			 toCheck = s.charAt(i) == '1' ? '0' : '1';
		}
		return currLength > max ? currLength : max;
	}
	
	public static void main(String[] args) {
		AlternatingString as = new AlternatingString();
		System.out.println(as.maxLength("000001"));
	}
}
