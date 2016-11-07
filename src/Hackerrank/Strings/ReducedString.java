package Hackerrank.Strings;

import java.util.Scanner;

public class ReducedString {
	
	private String reduceString(String inp) {
//		StringBuffer result = new StringBuffer();
		StringBuffer result = new StringBuffer(inp);
		do {
			inp = result.toString();
			for (int i = 0; i<result.length()-1; i++) {
				if (result.charAt(i) == result.charAt(i+1)) {
					result.deleteCharAt(i);
					result.deleteCharAt(i);
					i--;
				}
			}	
		}while(!result.toString().equals(inp));
		
		return result.toString();
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String inp = s.nextLine();
		ReducedString rs = new ReducedString();
		String result = rs.reduceString(inp);
		System.out.println(result.equals("") ? "Empty String" : result);
		
	}
}
