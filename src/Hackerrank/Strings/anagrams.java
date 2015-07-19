package Hackerrank.Strings;
import java.util.*;

class anagram{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	while(T-->0){
		int[] str1 = new int[26];
		int[] str2 = new int[26];
		String inStr = sc.next();
		if(inStr.length() %2 !=0) System.out.println(-1);
		else{
			int len = inStr.length();
			for(int i = 0;i<len;i++){
				if(i<len/2){
					str1[inStr.charAt(i)-'a'] += 1;
				}
				else{
					str2[inStr.charAt(i)-'a'] += 1;
				}
			}
			int diffSum = 0;
			for(int j = 0 ;j<26;j++){
				if(Math.abs(str1[j] - str2[j]) != 0){
					diffSum = diffSum + Math.abs(str1[j] - str2[j]);
				}
			}
			System.out.println(diffSum/2);
		}
	}
}
}