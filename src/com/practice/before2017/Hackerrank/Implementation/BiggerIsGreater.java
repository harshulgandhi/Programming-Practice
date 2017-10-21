package com.practice.before2017.Hackerrank.Implementation;

import java.util.Arrays;
import java.util.Scanner;

public class BiggerIsGreater {

	private int findPivot(String str) {
		for( int i = str.length() - 1; i>=1; i--) {
			if(str.charAt(i-1) < str.charAt(i) ) {
				return i-1; 
			}
		}
		return -1;
	}
	
	private String getBiggerSuffixedString(String str, int pivot) {
		int i = str.length()-1;
		while(i >= 0) {
			if( str.charAt(pivot) < str.charAt(i)) {
				char[] strC = str.toCharArray();
				char temp = strC[pivot];
				strC[pivot] = strC[i];
				strC[i] = temp;
				str = new String(strC);
				return str;
			}
			i--;
		}
		return null;
	}
	
	private String sortSubString(String str, int start, int end) {
		if(start == end) return str;
//		System.out.println("Start = "+start+" end = "+end+" substring of "+str+" is "+ str.substring(start, end));
		char[] subStrC = str.substring(start, end).toCharArray();
		Arrays.sort(subStrC);
//		System.out.println("Sorted suffix :"+new String(subStrC));
		return str.substring(0, start) + new String(subStrC);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0){
			String str = s.next();
			BiggerIsGreater o = new BiggerIsGreater();
			int pivot = o.findPivot(str);
//			System.out.println("\nPivot returned "+pivot);
			if( pivot < 0) {
				System.out.println("no answer");
				continue;
			}
			str = o.getBiggerSuffixedString(str, pivot);
//			System.out.println(str);
			str = o.sortSubString(str, pivot + 1, str.length());
			System.out.println(str);
		}
	}
}
