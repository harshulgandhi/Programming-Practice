package com.practice.before2017.CTCI.ArraysAndStrings;
import java.util.Scanner;

public class ComparePermutation{
public int[] getFrequencyArray(String str){
	int[] freq = new int[26];
	for(int i = 0;i<str.length();i++){
		freq[(int)str.charAt(i) - (int)'a']+=1;
	}
	return freq;
}

public  boolean compareTwoStrings(String str1, String str2){
	if(str1.length() != str2.length()) return false;
	int[] freq1 = getFrequencyArray(str1);
	for(int i = 0;i<str2.length();i++){
		int c = (int)str2.charAt(i)-(int)'a';
		if(--freq1[c] < 0) return false;
	}
	return true;
}

	public static void main(String[] args){
		ComparePermutation obj = new ComparePermutation();
		Scanner s = new Scanner(System.in);
		System.out.println(obj.compareTwoStrings(s.next(), s.next()));
	}
}

