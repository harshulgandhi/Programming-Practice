package com.practice.before2017.CTCI.ArraysAndStrings;

import java.lang.StringBuffer;
import java.util.Scanner;

public class StringCompressionII {

	public String compressString(String str){
		if(str == null) return null;
		StringBuffer res = new StringBuffer();
		int len = str.length();
		char last = str.charAt(0);
		int count = 1;
		for (int i = 1;i<len;i++){
			if(last == str.charAt(i)){
				count++;
			}else{
				res.append(last+""+count);
				count = 1;
				last = str.charAt(i);
			}
		}
		res.append(last+""+count);

		if(res.toString().length() >= str.length()) return str;

		return res.toString();
	}

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String str = s.next();
		StringCompressionII obj = new StringCompressionII();
		System.out.println(obj.compressString(str));
	}
}
