package Hackerrank.Strings;

import java.util.Scanner;

public class BeautifulBinaryString {
	
	private String TO_REMOVE = "010"; 
	
	private int numberOfSteps(StringBuffer inp) {
		int count = 0;
		int i = 0;
		while(inp.indexOf(TO_REMOVE, i) >= 0) {
			int idx = inp.indexOf(TO_REMOVE);
			inp.setCharAt(idx + 2, '1');
			i+=2;
			count++;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BeautifulBinaryString bbs = new BeautifulBinaryString();
		int N = s.nextInt();
		String inp = s.next();
		
		System.out.println(bbs.numberOfSteps(new StringBuffer(inp)));
		
	}
}
