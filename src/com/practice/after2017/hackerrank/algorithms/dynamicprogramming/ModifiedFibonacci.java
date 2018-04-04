package com.practice.after2017.hackerrank.algorithms.dynamicprogramming;

import java.math.BigInteger;
import java.util.Scanner;

public class ModifiedFibonacci {
	static BigInteger fibonacciModified(int t1, int t2, int n) {
		if (n == 1)
			return BigInteger.valueOf(t1);
		if (n == 2)
			return BigInteger.valueOf(t2);
		return (BigInteger) fibonacciModified(t1, t2, n - 2).add(fibonacciModified(t1, t2, n - 1).pow(2));
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t1 = in.nextInt();
		int t2 = in.nextInt();
		int n = in.nextInt();
		BigInteger result = fibonacciModified(t1, t2, n);
		System.out.println(result);
		in.close();
	}
}
