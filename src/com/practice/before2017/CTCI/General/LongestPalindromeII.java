package com.practice.before2017.CTCI.General;

public class LongestPalindromeII{

	public String getPalindrome(String str, int i,int j){
		while(i>=0 && j<str.length()){
			if(str.charAt(i)!=str.charAt(j)) return str.substring(i+1,j);
			i--;
			j++;
		}
		return str.substring(i+1,j);
	}

	public String getLongestPalindrome(String str){
		char[] c_str = str.toCharArray();
		int len = c_str.length;
		String palindrome = "";
		String longestPalin = "";
		for(int i = 0;i<len;i++){
			palindrome = getPalindrome(str, i, i);
			if(longestPalin.length() < palindrome.length()) longestPalin = palindrome;

			palindrome = getPalindrome(str, i, i+1);
			if(longestPalin.length() < palindrome.length()) longestPalin = palindrome;
		}

		return longestPalin;
	}

	public static void main(String[] args){
		LongestPalindromeII obj = new LongestPalindromeII();
		String str = "aacabbaaa";
		System.out.println(obj.getLongestPalindrome(str));
	}
}