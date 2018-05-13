package com.practice.after2017.leetcode.algorithms.string;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 * description/
 */
public class LetterCombination {
	public static List<String> letterCombinations(String digits) {

		LinkedList<String> ans = new LinkedList<String>();
		if (digits.isEmpty())
			return ans;
		String[] mapping = new String[] { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		ans.add("");
		for (int i = 0; i < digits.length(); i++) {
			int x = Character.getNumericValue(digits.charAt(i));
			while (ans.peek().length() == i) {
				String t = ans.remove();
				for (char s : mapping[x].toCharArray())
					ans.add(t + s);
			}
		}
		return ans;
	}

	public static List<String> letterCombinationsEasier(String digits) {
		List<String> ans = new ArrayList<String>();
		if (digits.isEmpty())
			return ans;
		String[] mapping = new String[] { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		ans.add("");
		for (int i = 0; i < digits.length(); i++) {
			int num = Character.getNumericValue(digits.charAt(i));
			List<String> localRes = new ArrayList<>();
			for (String currRes : ans) {
				for (char c : mapping[num].toCharArray()) {
					localRes.add(currRes + c);
				}
			}
			ans = localRes;
		}
		return ans;
	}

	public static List<String> permutate(char[] inp, List<String> result, int start, int end) {
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

	private static void swap(char[] arr, int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		List<String> result = LetterCombination.letterCombinationsEasier("2");
		result.forEach(str -> System.out.println(str));
	}
}
