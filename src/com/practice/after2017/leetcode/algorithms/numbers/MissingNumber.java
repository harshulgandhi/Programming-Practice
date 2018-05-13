package com.practice.after2017.leetcode.algorithms.numbers;

/**
 * https://leetcode.com/problems/missing-number/description/
 */
public class MissingNumber {
	public int missingNumber(int[] nums) {
		int len = nums.length;
		int sum = 0;
		for (int i = 0; i < len; i++) {
			sum += nums[i];
		}
		return (((len + 1) * len) / 2) - sum;
	}

	public static void main(String[] args) {
		MissingNumber mn = new MissingNumber();
		System.out.println(mn.missingNumber(new int[] { 9, 6, 4, 2, 3, 5, 7, 0, 1 }));
	}
}
