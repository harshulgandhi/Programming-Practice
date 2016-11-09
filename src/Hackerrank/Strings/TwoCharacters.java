package Hackerrank.Strings;

import java.util.Scanner;

public class TwoCharacters {
	
	private char hasConsecutiveDuplicate(String inp) {
//		System.out.println("\nCleaning "+inp);
		for (int i = 0; i<inp.length()-1; i++) {
			if (inp.charAt(i) == inp.charAt(i+1)) {
				return inp.charAt(i);
			}
		}
		return 'A';
	}
	
	private int findLength(String inp) {
		int len = inp.length();
		if (len == 1) return 0;
		while(hasConsecutiveDuplicate(inp) != 'A') {
			char repeating = hasConsecutiveDuplicate(inp);
			System.out.println("Found repeating "+repeating);
			inp = inp.replace(repeating, ' ');
			inp = inp.replace(" ", "");
			System.out.println("Removed repeating "+inp);
		}
//		System.out.println("After cleaning "+inp);
		int count[] = new int[26];
		for ( int i = 0; i<inp.length(); i++) {
			count[inp.charAt(i) - 'a']++;
		}
		int maxLength = 0;
		for(int each:count) System.out.print(each+" ");
		for (int i = 0; i < 25; i++) {
			for (int j = i+1; j<26; j++) {
				int temp = 0;
				if(Math.abs(count[i] - count[j]) == 1 || Math.abs(count[i] - count[j]) == 0) {
					temp = count[i] + count[j];
				}
				maxLength = temp > maxLength ? temp : maxLength;
			}
		}
		return maxLength;
	}
	
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int len = s.nextInt();
	String inp = s.next();
	TwoCharacters o = new TwoCharacters();
	System.out.println(o.findLength(inp));
	}
}
