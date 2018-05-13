package com.practice.after2017.leetcode.algorithms.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/next-permutation/description/
 * 
 * https://leetcode.com/problems/permutations/description/
 */

public class Permutation {
	/**
	 * generates next larger permutation. Inline comments will explain the idea
	 * behind the algorithm
	 */
	public void nextPermutation(int[] nums) {
		if (nums.length == 1)
			return;
		int i = nums.length - 2;
		// find index where increasing sequence from behind is breaking
		// example, nums = {1,2,5,3,1}, i will be 1
		for (; i >= 0; i--) {
			if (nums[i] < nums[i + 1])
				break;
		}
		// now that we have found breaking index i, we need to swap this with
		// number JUST bigger in array[i + 1 to len -1]
		// so that we get the larger permutation
		// example, in nums = {1,2,5,3,1} with i = 1, we search for number just
		// bigger than 2 in sub array {5,3,1}, which is 3.
		// then we swap nums[i] = 2 with nums[j] = 3
		if (i >= 0) {
			int j = nums.length - 1;
			while (nums[j] <= nums[i])
				j--;
			swap(nums, i, j);
		}
		// sort the array from i + 1 to end to make sure we have the next bigger
		// permutation only to input array
		Arrays.sort(nums, i + 1, nums.length);
		for (Integer each : nums) {
			System.out.print(each + " - ");
		}
	}

	/**
	 * All possible permutations of a string. A very standard explanation
	 * available here https://www.youtube.com/watch?v=KBHFyg2AcZ4
	 */
	public List<String> permutate(char[] inp, List<String> result, int start, int end) {
		if (start == end) {
			result.add(new String(inp));
		} else {
			for (int i = start; i <= end; i++) {
				swap(inp, i, start);
				permutate(inp, result, start + 1, end);
				swap(inp, i, start);
			}
		}
		return result;
	}

	/**
	 * This is for finding permutations of an in array. Logic is same as
	 * permutate method for String above
	 */
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		performPermutation(nums, result, 0, nums.length - 1);
		return result;
	}

	private void performPermutation(int[] nums, List<List<Integer>> result, int start, int end) {
		if (start == end) {
			List<Integer> numbers = new ArrayList<>();
			for (Integer each : nums)
				numbers.add(each);
			result.add(numbers);
		} else {
			for (int i = start; i <= end; i++) {
				swap(nums, i, start);
				performPermutation(nums, result, start + 1, end);
				swap(nums, i, start);
			}
		}
	}

	private void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private void swap(char[] arr, int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		Permutation sp = new Permutation();
		// List<String> result = new ArrayList<>();
		// String str = "ABC";
		// sp.permutate(str.toCharArray(), result, 0, str.length() - 1);
		// for (String each : result) {
		// System.out.println(each);
		// }
		sp.nextPermutation(new int[] { 5, 3, 1 });
		List<List<Integer>> result = sp.permute(new int[] { 1, 2, 3 });
		for (List<Integer> eachList : result) {
			for (Integer each : eachList) {
				System.out.print(each + " - ");
			}
			System.out.println();
		}
	}
}
