package com.practice.before2017.Hackerrank.Implementation;

import java.util.Scanner;
import java.lang.StringBuffer;
public class CaesarCipherI{

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		StringBuffer res = new StringBuffer();
		int N = s.nextInt();
		String inp = s.next();
		int K = s.nextInt();
		for( int i = 0;i<inp.length(); i++){

			boolean isUpper = Character.isUpperCase(inp.charAt(i));
			char c = Character.toLowerCase(inp.charAt(i));
			if(c >= 'a' && c<='z'){

				if (isUpper){
					res.append(Character.toUpperCase((char)( (c - 'a' + K)%26 + 'a')));	
				} 
				else{
					res.append((char)((c - 'a' + K)%26 + 'a'));
				} 
			}
			else{res.append(c);}

		}

		System.out.println(res.toString());
	}
}