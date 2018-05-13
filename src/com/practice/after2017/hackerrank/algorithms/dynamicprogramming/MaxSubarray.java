package com.practice.after2017.hackerrank.algorithms.dynamicprogramming;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/maxsubarray/problem
 */
public class MaxSubarray {
	// Complete the maxSubarray function below.
	static int[] maxSubarray(int[] arr) {
		int[] res = new int[2];
		res[0] = maxSubarraySum(arr);
		res[1] = maxSubSeqSum(arr);
		return res;
	}

	static int maxSubarraySum(int[] arr) {
		int maxEndingHere = arr[0];
		int maxSoFar = arr[0];

		for (int i = 1; i < arr.length; i++) {
			maxEndingHere += arr[i];
			if (maxEndingHere < arr[i]) {
				maxEndingHere = arr[i];
			}
			if (maxSoFar < maxEndingHere) {
				maxSoFar = maxEndingHere;
			}
		}

		return maxSoFar;
	}

	static int maxSubSeqSum(int[] arr) {
		Arrays.sort(arr);

		int maxEndingHere = arr[arr.length - 1];
		int maxSoFar = arr[arr.length - 1];

		for (int i = arr.length - 2; i >= 0; i--) {
			maxEndingHere += arr[i];
			if (maxEndingHere < arr[i]) {
				maxEndingHere = arr[i];
			}
			if (maxSoFar < maxEndingHere) {
				maxSoFar = maxEndingHere;
			}
		}

		return maxSoFar;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			int n = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			int[] arr = new int[n];

			String[] arrItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int i = 0; i < n; i++) {
				int arrItem = Integer.parseInt(arrItems[i]);
				arr[i] = arrItem;
			}

			int[] result = maxSubarray(arr);

			for (int i = 0; i < result.length; i++) {
				System.out.print(result[i]);
				if (i != result.length - 1) {
					System.out.print(" ");
				}
			}
			System.out.println();

		}

		scanner.close();
	}
}
