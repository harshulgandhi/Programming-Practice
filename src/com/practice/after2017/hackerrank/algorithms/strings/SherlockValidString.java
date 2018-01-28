package com.practice.after2017.hackerrank.algorithms.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SherlockValidString {
	static String isValid(String s){
		int[] freqArr = freq(s);
		boolean oneDiffEnc = false;
		for(int i = 0; i<26; i++) {
			for(int j = i; j<26; j++) {
				int diff = Math.abs(freqArr[i] - freqArr[j]);
				if(freqArr[i] != 0 && freqArr[j] != 0 && diff != 0) {
					if(diff == 1 && !oneDiffEnc) {
						oneDiffEnc = true;
						continue;
					} else if (diff == 1 && oneDiffEnc) {
						return "NO";
					} else if(diff > 1) {
						return "NO";
					}
				}
			}
		}
		return "YES";
    }

	static int[] freq(String s) {
		int[] freq = new int[26];
		for(int i = 0; i < s.length(); i++) {
			freq[s.charAt(i)-'a']+= 1;
		}
		return freq;
	}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = isValid(s);
        System.out.println(result);
    }
}
