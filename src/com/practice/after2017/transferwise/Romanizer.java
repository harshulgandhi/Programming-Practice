package com.practice.after2017.transferwise;

import java.util.LinkedHashMap;
import java.util.Map;

public class Romanizer {

	private static Map<Integer, String> romanLiterals = new LinkedHashMap<>();

	static private void initMap() {
		romanLiterals.put(1000, "M");
		romanLiterals.put(900, "CM");
		romanLiterals.put(500, "D");
		romanLiterals.put(400, "CD");
		romanLiterals.put(100, "C");
		romanLiterals.put(90, "XC");
		romanLiterals.put(50, "L");
		romanLiterals.put(40, "XL");
		romanLiterals.put(10, "X");
		romanLiterals.put(9, "IX");
		romanLiterals.put(5, "V");
		romanLiterals.put(4, "IV");
		romanLiterals.put(1, "I");
	}

	static String[] romanizer(int[] numbers) {
		initMap();
		String[] result = new String[numbers.length];

		for (int i = 0; i < numbers.length; i++) {
			StringBuilder roman = new StringBuilder();
			int arabic = numbers[i];
			for (Integer key : romanLiterals.keySet()) {
				while (arabic >= key) {
					roman.append(romanLiterals.get(key));
					arabic -= key;
				}
			}
			result[i] = roman.toString();
		}
		return result;
	}

	public static void main(String[] args) {
		String[] res = Romanizer.romanizer(new int[] { 99 });

		for (String each : res) {
			System.out.println(each);
		}
	}
}
