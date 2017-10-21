package com.practice.before2017.MorePractice;
import java.lang.StringBuffer;
public class LongestPalindrome{

	public static String getPalindrome(String str, int start, int end){
		while(start >= 0 && end<str.length()){
			if(str.charAt(start) != str.charAt(end)) return str.substring(start+1, end);
			start--;
			end++;
		}

		return "";
	}

	public static String longestPalindrome(String str){
		String res = "";
		for(int i = 0;i<str.length();i++){
			String palin = getPalindrome(str, i,i+1);
			if(palin.length() > res.length()) res = palin;
			
			palin = getPalindrome(str, i,i);
			if(palin.length() > res.length()) res = palin;

		}

		return res;
	}

	public static void main(String[] args){
		String s = "aabbcccbbdef";

		System.out.println(LongestPalindrome.longestPalindrome(s));
	}
}