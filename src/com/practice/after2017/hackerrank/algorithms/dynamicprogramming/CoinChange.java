package com.practice.after2017.hackerrank.algorithms.dynamicprogramming;

import java.util.Scanner;

public class CoinChange {
	static long getWays(long n, long[] c) {
		long[][] memo = new long[c.length + 1][(int) (n + 1L)];
		for (int i = 1; i <= c.length; i++) {
			for (int j = 1; j <= n; j++) {
				if (c[i - 1] == 1 && i == 1) {
					memo[i][j] = 1;
				} else if (c[i - 1] == j) {
					memo[i][j] = memo[i - 1][j] + 1;
				} else if (c[i - 1] < j) {
					memo[i][j] = memo[i][(int) (j - c[i - 1])] + memo[i - 1][j];
				} else {
					memo[i][j] = memo[i - 1][j];
				}
			}
		}
		print(memo);
		return memo[c.length][(int) n];

	}

	private static void print(long[][] mat) {
		for (long[] eachRow : mat) {
			for (long eachCell : eachRow) {
				System.out.print(eachCell + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		long[] c = new long[m];
		for (int c_i = 0; c_i < m; c_i++) {
			c[c_i] = in.nextLong();
		}
		// Print the number of ways of making change for 'n' units using coins
		// having the values given by 'c'
		long ways = getWays(n, c);
		System.out.println(ways);
	}
}
