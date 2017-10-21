package com.practice.before2017.Hackerrank.Strings;
import java.util.*;
public class makeanagram {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String inStr1 = sc.nextLine();
	String inStr2 = sc.nextLine();
	int[] strOne = new int[26];
	int[] strTwo = new int[26];
	char c = 'a';
	for(int i = 0;i<inStr1.length();i++){
		strOne[inStr1.charAt(i)-(int)c] += 1;
	}
	for(int i = 0;i<inStr2.length();i++){
		strTwo[inStr2.charAt(i)-(int)c] += 1;
	}
	int count = 0;
	for(int i = 0;i<26;i++){
		count = count + Math.abs(strOne[i] - strTwo[i]);
	}
	System.out.println(count);
	}
}



/*
 * 
imkhnpqnhlvaxlmrsskbyyrhwfvgteubrelgubvdmrdmesfxkpykprunzpustowmvhupkqsyjxmnptkcilmzcinbzjwvxshubeln
wfnfdassvfugqjfuruwrdumdmvxpbjcxorettxmpcivurcolxmeagsdundjronoehtyaskpwumqmpgzmtdmbvsykxhblxspgnpgfzydukvizbhlwmaajuytrhxeepvmcltjmroibjsdkbqjnqjwmhsfopjvehhiuctgthrxqjaclqnyjwxxfpdueorkvaspdnywupvmy
102
 * */
