package com.practice.before2017.TopCoder.BruteForce;

public class Cross {
	
	
	public boolean isCrossCenter(String[] input, int i, int j) {
		if(input[i].charAt(j-1) == '#' && input[i-1].charAt(j) == '#' && input[i].charAt(j+1) == '#' && input[i+1].charAt(j) == '#') return true;
		return false;
	}
	public String exist(String[] input) {
		
		for(int i = 1; i<input.length - 1; i++) {
			for(int j = 1; j<input[i].length() - 1; j++) {
				if(input[i].charAt(j) == '#') {
					if(isCrossCenter(input, i, j)) {
						return "Exist";
					}
				}
			}
		}
		
		return "Does not exist";
	}
	
	public static void main(String[] args) {
		Cross c = new Cross();
		System.out.println(c.exist(new String[]{"######",
 "######",
 "######",
 "######",
 "######",
 "######",
 "######"}));
	}
}
