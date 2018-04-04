package com.practice.after2017.leetcode.algorithms;

/**
 * https://leetcode.com/problems/house-robber
 * https://leetcode.com/problems/house-robber-ii
 */
public class HouseRobber {
	public static int rob(int[] nums) {
		if (nums.length == 0)
			return 0;
		if (nums.length == 1)
			return nums[0];
		int[] dp = new int[nums.length];
		dp[0] = nums[0];
		dp[1] = Math.max(nums[1], dp[0]);
		int max = dp[1];
		for (int i = 2; i < nums.length; i++) {
			dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
			max = Math.max(max, dp[i]);
		}

		return max;
	}

	private static int robHelperII(int[] nums, int lo, int hi) {
		int[] dp = new int[nums.length];
		dp[lo] = nums[lo];
		dp[lo + 1] = Math.max(nums[lo + 1], dp[lo]);
		int max = dp[lo + 1];
		for (int i = lo + 2; i <= hi; i++) {
			dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
			max = Math.max(max, dp[i]);
		}
		return max;
	}

	public static int robII(int[] nums) {
		if (nums.length == 0)
			return 0;
		if (nums.length == 1)
			return nums[0];
		if (nums.length == 2)
			return Math.max(nums[0], nums[1]);
		return Math.max(robHelperII(nums, 0, nums.length - 2), robHelperII(nums, 1, nums.length - 1));
	}

	public static void main(String[] args) {
		System.out.println(rob(new int[] { 42, 22, 8, 9, 23, 100 }));
		System.out.println(robII(new int[] { 42, 22, 8, 9, 23, 100 }));
	}
}
