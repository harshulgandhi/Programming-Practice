package com.practice.after2017.hackerrank.algorithms.strings;
/**
 * https://www.hackerrank.com/challenges/two-characters/problem
 * 
 * A WORKING SOLUTION
 * */
public class TwoCharatersII {

	public static int getAlternatingLength(String input) {
		int consecutiveIdx = containsConsecutive(input);
		while(consecutiveIdx != -1) {
			input = removeChar(input, input.charAt(consecutiveIdx));
			consecutiveIdx = containsConsecutive(input);
		}
		int[] freq = getFrequencyArr(input);
		int maxLength = 0;
		for(int i = 0; i < 26; i++) {
			for(int j = i + 1; j < 26; j++) {
				if(freq[i] != 0 && freq[j] != 0 && Math.abs(freq[i] - freq[j]) <= 1) {
					if(areCharsAlternating(input, (char)('a' + i), (char)('a'+ j))) {
						maxLength = maxLength < freq[i] + freq[j] ? freq[i] + freq[j] : maxLength;
					}
				}
			}
		}
		return maxLength;
	}
	
	private static String removeChar(String input, char toRem) {
		input = input.replaceAll(""+toRem, "");
		return input;
	}
	
	private static int containsConsecutive(String input){
		for(int i = 0; i<input.length()-1; i++) {
			if(input.charAt(i) == input.charAt(i+1)) {
				return i;
			}
		}
		return -1;
	}
	
	private static boolean areCharsAlternating(String input, char a, char b) {
		char toCheck = a;
		char otherChar = b;
		int i = 0;
		for(;i< input.length();i++) {
			if(input.charAt(i) == a) {
				toCheck = b;
				otherChar = a;
				i++;
				break;
			} else if (input.charAt(i) == b) {
				toCheck = a;
				otherChar = b;
				i++;
				break;
			}
		}
		
		for(;i<input.length();i++) {
			if(input.charAt(i) == toCheck) {
				char temp = toCheck;
				toCheck = otherChar;
				otherChar = temp;
			} else if (input.charAt(i) == otherChar) {
				return false;
			}
		}
		return true;
	}
	private static int[] getFrequencyArr(String input) {
		int arr[] = new int[26];
		for(int i = 0; i < input.length(); i++) {
			arr[Math.abs(input.charAt(i) - 'a')]++;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		System.out.println(TwoCharatersII.getAlternatingLength("abaabcac"));
	}
}
