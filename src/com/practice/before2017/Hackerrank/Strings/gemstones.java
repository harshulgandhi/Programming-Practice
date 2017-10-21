package com.practice.before2017.Hackerrank.Strings;
import java.util.*;
import java.io.*;
class gemstones{

public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
	int count = 0;
	for (int k = 0;k<=N;k++){
		String checkStr = sc.nextLine();
		ArrayList<Character> processedChar = new ArrayList<Character>();
		for(int j = 0;j<checkStr.length();j++){
			if(hm.get(checkStr.charAt(j)) == null){
				hm.put(checkStr.charAt(j),1);
			}
			else if(processedChar.contains(checkStr.charAt(j))){
				continue;
			}			
			else{
				hm.put(checkStr.charAt(j),hm.get(checkStr.charAt(j)) + 1);
			}
			processedChar.add(checkStr.charAt(j));
		}
	}
	for (Character key: hm.keySet()){
			if(hm.get(key)  == N) count++;
	}
	System.out.println(count);
}
}