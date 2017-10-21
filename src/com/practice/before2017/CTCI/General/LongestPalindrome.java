package com.practice.before2017.CTCI.General;

public class LongestPalindrome{


	public static String getPalindrome(String str, int i, int j){
		while(i>=0 && j<str.length()){
			if(str.charAt(i) != str.charAt(j)) return str.substring(i+1, j);
			i--;
			j++;
		}

		return str.substring(i+1, j);
	}

	public static String longestPalindrome(String str){
		String longestPalin = "";
		if(str == null) return "";
		if(str.length() == 1) return str;

		for(int i = 0;i<str.length();i++){
			String palindrome = getPalindrome(str, i, i);
			if(longestPalin.length() < palindrome.length()) longestPalin = palindrome;

			palindrome = getPalindrome(str, i, i+1);
			if(longestPalin.length() < palindrome.length()) longestPalin = palindrome;
		}

		return longestPalin;
	}

	public static void main(String[] args){
		System.out.println(LongestPalindrome.longestPalindrome("12333341"));
	}
}