package com.practice.before2017.CTCI.ArraysAndStrings;
import java.util.Scanner;

public class UniqueCharacters{

	public static boolean isStringAllUnique(String inp){
		int len = inp.length();
		char[] inpC = new char[len];
		inpC = inp.toCharArray();
		for(int i = 0;i<len-1;i++){
			for(int j = i+1;j<len;j++){
				// System.out.println("inpC[i] : "+inpC[i]+"   (int)inpC[i] : "+(int)inpC[i]+"inpC[j] : "+inpC[j]+"  (int)inpC[j] : "+(int)inpC[i]);
				if(((int)inpC[i] - (int)inpC[j]) == 0) return false;
			}
		}
		return true;
	}

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String input = s.next();
		System.out.println(isStringAllUnique(input));
	}
}