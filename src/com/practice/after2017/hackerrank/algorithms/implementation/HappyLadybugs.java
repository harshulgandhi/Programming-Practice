package com.practice.after2017.hackerrank.algorithms.implementation;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/happy-ladybugs/problem
 * */
public class HappyLadybugs {
	
	public static void checkHappiness(String board) {
		int[] freq = freqArray(board);
		boolean allZero = true;
		for(int i = 0; i<26; i++) {
			if(freq[i] != 0) {
				allZero = false;
			}
			if(freq[i] == 1) {
				System.out.println("NO");
				return;
			}
		}
		if(allZero) {
			System.out.println("YES");
			return;
		}
		
		if(!board.contains("_")) {
			for(int i = 1; i<board.length()-1; i++) {
				char curr = board.charAt(i);
				if(board.charAt(i-1) != curr && board.charAt(i+1) != curr) {
					System.out.println("NO");
					return;
				}
			}
		}
		System.out.println("YES");
		
	}
	
	private static int[] freqArray(String board) {
		int[] freq = new int[26];
		for(Character each : board.toCharArray()) {
			if(each != '_'){
				freq[each - 'A'] += 1;
			}
		}
		
		return freq;
	}
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Q = in.nextInt();
        for(int a0 = 0; a0 < Q; a0++){
            int n = in.nextInt();
            String b = in.next();
            checkHappiness(b);
        }
    }
}
