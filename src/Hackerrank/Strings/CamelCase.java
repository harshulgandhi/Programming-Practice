package Hackerrank.Strings;

import java.util.Scanner;

public class CamelCase {
	
	private int countWords(String inp) {
		int count = 0;
		if (inp.length() == 1) return 1;
		for (int i = 0; i<inp.length(); i++) {
			if(inp.charAt(i) >= 'A' && inp.charAt(i) <= 'Z') count++;
		}
		return count+1;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String inp = s.nextLine();
		CamelCase cc = new CamelCase();
		System.out.println(cc.countWords(inp));
	}
	
}
