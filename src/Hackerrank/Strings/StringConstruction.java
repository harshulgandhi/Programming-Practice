package Hackerrank.Strings;

import java.util.Scanner;


public class StringConstruction {
	
	private int getCostOfCopying(String inp) {
		int cost = 0;
		int frequency[] = new int[26];
		for(int i = 0; i<inp.length(); i++) {
			frequency[inp.charAt(i) - 'a']++;
			if(frequency[inp.charAt(i) - 'a'] == 1) cost++;
		}
		return cost;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		StringConstruction sc = new StringConstruction();
		while(N-- > 0) {
			String inp = s.next();
			System.out.println(sc.getCostOfCopying(inp));
		}
 	}
	
}
