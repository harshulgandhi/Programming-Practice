package com.practice.before2017.Hackerrank.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class MarsExploration {
	private int getInterruptedCharacters(String inp) {
		int countInvalid = 0;
		for(int i = 0; i<inp.length();){
			int j = i+3;
			String temp = inp.substring(i, j);
			if(temp != "SOS") {
				if(inp.charAt(i) != 'S') countInvalid++;
				if(inp.charAt(i+1) != 'O') countInvalid++;
				if(inp.charAt(i+2) != 'S') countInvalid++;
			}
			i+=3;
		}
		return countInvalid;
	}
	
public static void main(String[] args) {
	
	MarsExploration me = new MarsExploration();
	Scanner s = new Scanner(System.in);
	System.out.println(me.getInterruptedCharacters(s.nextLine()));
}
}
