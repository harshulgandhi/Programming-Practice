package com.practice.before2017.lazada;

public class B {
	
	public static int checkBracket(String inp) {
		int i = 0;
		int j = 0;
		for(i = 0, j = inp.length() - 1; i < j;) {
			if(inp.charAt(i) == '(') {
				if(inp.charAt(i) != inp.charAt(j)) {
					i++;
					j--;
				} else if(inp.charAt(i) == inp.charAt(j)) {
					j--;
				}
			}
			else if(inp.charAt(i) == ')') {
				i++;
			}
			
		}
		
		return i>j ? i : i+1;
	}
	
	public static void main(String[] args) {
//		System.out.println(B.checkBracket("(())"));

		System.out.println(B.checkBracket(")("));
		
	}
}
