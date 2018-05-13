package com.practice.after2017.leetcode.algorithms.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/group-anagrams/description/
 */
public class GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> result = new ArrayList<>();
		if (strs.length == 0) {
			return result;
		}
		Map<String, List<String>> freqMap = new HashMap<>();
		for (String eachString : strs) {
			String freqSignature = freqString(eachString);
			if (freqMap.get(freqSignature) == null) {
				List<String> currentSet = new ArrayList<>();
				currentSet.add(eachString);
				freqMap.put(freqSignature, currentSet);
			} else {
				freqMap.get(freqSignature).add(eachString);
			}
		}

		for (String eachKey : freqMap.keySet()) {
			result.add(freqMap.get(eachKey));
		}
		return result;

	}

	private String freqString(String s) {
		int[] freq = new int[26];
		for (int i = 0; i < s.length(); i++) {
			freq[s.charAt(i) - 'a']++;
		}
		return Arrays.toString(freq);
	}

	public static void main(String[] args) {
		GroupAnagrams ga = new GroupAnagrams();
		List<List<String>> res = ga.groupAnagrams(new String[] { "eat" });
		for (List<String> eachList : res) {
			System.out.print("[");
			for (String each : eachList) {
				System.out.print(each + ", ");
			}
			System.out.println("]");
		}

	}
}
