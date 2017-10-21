package com.practice.before2017.TopCoder.BruteForce;

public class SquareFreeString {
	
	public boolean isSquare(String s, int startI, int startJ) {
		int i = 0, j = 0;
		for(i = startI, j = startJ; i < startJ && j < s.length(); i++, j++ ) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
		}
		return i == startJ;
	}
	
	public String isSquareFree(String s) {
		
		for(int i = 0; i < s.length()-1; i++) {
			if(s.charAt(i) == s.charAt(i+1)) {
				return "not square-free";
			} else {
				for(int j = i+1; j<s.length(); j++){
					if(s.charAt(i) == s.charAt(j)) {
						if(isSquare(s, i, j)) {
							return "not square-free";
						}
					}
				}
			}
		}
		return "square-free";
	}
	public static void main(String[] args) {
		SquareFreeString sfs = new SquareFreeString();
		System.out.println(sfs.isSquareFree("qwertyuiopasdfghjklzxcvbnm"));
	}
}
