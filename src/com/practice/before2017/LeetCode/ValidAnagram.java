package com.practice.before2017.LeetCode;

import java.util.Scanner;

public class ValidAnagram{
	
	public boolean isAnagram(String s, String t){
		int len_s = s.length();
		int len_t = t.length();
		int fre_s[] = new int[26];
		int fre_t[] = new int[26];
		for(int i = 0;i<len_s;i++){
			fre_s[s.charAt(i) - (int)('a')] = fre_s[s.charAt(i) - (int)('a')]+1;
		}
		for(int i = 0;i<len_t;i++){
			fre_t[t.charAt(i) - (int)('a')] = fre_t[t.charAt(i) - (int)('a')]+1;
		}
		
		for(int i = 0;i<26;i++){
			if(fre_s[i] !=fre_t[i]) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		ValidAnagram an = new ValidAnagram();
		System.out.println(an.isAnagram(s, t));
	}
}