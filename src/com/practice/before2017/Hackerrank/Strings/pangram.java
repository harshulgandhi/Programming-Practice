package com.practice.before2017.Hackerrank.Strings;
import java.util.*;
import java.io.*;
class pangram{

public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
	for(int j = 0;j<26;j++){
		hm.put(alpha[j],0);
	}
	String checkStr = sc.nextLine();
	checkStr = checkStr.toLowerCase();
	for(int m = 0;m<checkStr.length();m++){
		if(checkStr.charAt(m)!=' '){
			hm.put(checkStr.charAt(m),hm.get(checkStr.charAt(m))+1);
		}
	}
	if(hm.containsValue(0)) System.out.println("not pangram");
	else System.out.println("pangram");
}
}