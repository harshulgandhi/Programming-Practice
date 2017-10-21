package com.practice.before2017.Hackerrank.Strings;
import java.util.Scanner;

public class SherlockAnagrams {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		while(T-->0){
			int[] alpha = new int[26];
			String inS = s.next();
			for(int i = 0;i<inS.length();i++){
				alpha[(int)inS.charAt(i)-97]++;
			}
			int count =0;
			for (int i = 0;i<26;i++){
				if(alpha[i]>=2){
					count += alpha[i]/2;
				}
			}
			System.out.println(count*2);
		}
		
	}
}
