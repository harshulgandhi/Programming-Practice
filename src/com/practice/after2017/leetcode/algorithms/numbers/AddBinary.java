package com.practice.after2017.leetcode.algorithms.numbers;

/**
 * https://leetcode.com/problems/add-binary/
 */
public class AddBinary {
	public String addBinary(String a, String b) {
		String result = "";
		if (a.length() == 0 || b.length() == 0) {
			return a + b;
		}
		int lenA = a.length();
		int lenB = b.length();
		int carry = 0;
		for (int i = lenA - 1, j = lenB - 1; i >= 0 || j >= 0; i--, j--) {
			int A = i >= 0 ? Integer.parseInt(a.charAt(i) + "") : 0;
			int B = j >= 0 ? Integer.parseInt(b.charAt(j) + "") : 0;
			int digit = 0;
			if (A + B + carry == 3) {
				carry = 1;
				digit = 1;
			} else if (A + B + carry == 2) {
				carry = 1;
				digit = 0;
			} else if (A + B + carry == 1) {
				carry = 0;
				digit = 1;
			} else {
				carry = 0;
				digit = 0;
			}
			result = digit + result;
		}
		if (carry == 1) {
			result = carry + result;
		}
		return result.toString();
	}

	public static void main(String[] args) {
		AddBinary ab = new AddBinary();
		System.out.println(ab.addBinary("0", "0"));
	}

}
