package com.practice.before2017.Hackerrank.Strings;
import java.util.*;

class twostrings{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	while(T-->0){
		int[] str1 = new int[26];
		String Str1 = sc.next();
		for(int i = 0;i<Str1.length();i++){
			str1[Str1.charAt(i) - 'a'] = 1;
		}
		String Str2 = sc.next();
		boolean flag = false;
		for(int j = 0;j<Str2.length();j++){
			if(str1[Str2.charAt(j) - 'a'] == 1){
				System.out.println("YES");
				flag = true;
				break;
			}
		}
		if(!flag){
			System.out.println("NO");
		}
	}
}
}