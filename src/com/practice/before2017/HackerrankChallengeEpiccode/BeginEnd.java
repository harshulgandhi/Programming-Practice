package com.practice.before2017.HackerrankChallengeEpiccode;
import java.util.Scanner;

public class BeginEnd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String inStr = sc.next();
		int[] ch = new int[26];
		long ans = 0;
		for(int i = 0;i<N;i++){
			ch[inStr.charAt(i) - (int)'a'] += 1; 
		}
		
		for(int i = 0;i<26;i++){
			if(ch[i] == 1){
				ans += 1;
			}
			else if(ch[i]>1){
				ans += (((long)ch[i] * (ch[i]-1) / 2) + ch[i]);
			}
		}
		System.out.println(ans);
	}
}