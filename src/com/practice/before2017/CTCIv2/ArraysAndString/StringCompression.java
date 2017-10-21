package com.practice.before2017.CTCIv2.ArraysAndString;

import com.practice.before2017.CTCIv2.MyStringBuilder;

public class StringCompression {
	public String compressedString(String inpStr) {
		MyStringBuilder sb = new MyStringBuilder();
		char[] inp = inpStr.toCharArray();
		int consecutiveCount = 1;
		for( int i = 0; i<inp.length - 1; i++) {
			if (inp[i] == inp[i+1]) {
				consecutiveCount++;
			} else {
				sb.append(inp[i]+"");
				sb.append(consecutiveCount+"");
				consecutiveCount = 1;
			}
		}
		sb.append(inp[inp.length - 1]+"");
		sb.append(consecutiveCount+"");
		return sb.toString().length() >= inpStr.length() ? inpStr : sb.toString();
	}
	public static void main(String[] args) {
		StringCompression sc = new StringCompression();
		System.out.println(sc.compressedString("a"));
		
	}
}
