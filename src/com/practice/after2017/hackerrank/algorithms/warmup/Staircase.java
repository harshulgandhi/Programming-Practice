package com.practice.after2017.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class Staircase {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if( N - 1 - i > j) {
					System.out.print(" ");
				} else System.out.print("#");
			}
			System.out.println();
		}
	}
}
