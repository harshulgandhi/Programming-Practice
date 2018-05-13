package com.practice.after2017.leetcode.algorithms.numbers;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/find-the-duplicate-number/description/
 */
public class FindDuplicate {

	/**
	 * this is incorrect implementation as one of the requirements is not to
	 * alter the array
	 */
	public int findDuplicate(int[] nums) {
		Arrays.sort(nums);
		for (int i = 1; i < nums.length; i++) {
			if (nums[i - 1] == nums[i]) {
				return nums[i];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		FindDuplicate fd = new FindDuplicate();
		System.out.println(fd.findDuplicate(new int[] { 100, 1, 2, 6, 5, 4, 7, 6 }));
	}
}
