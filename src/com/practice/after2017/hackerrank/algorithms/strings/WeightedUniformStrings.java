package com.practice.after2017.hackerrank.algorithms.strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * https://www.hackerrank.com/challenges/weighted-uniform-string/problem
 * */
public class WeightedUniformStrings {
	
	public static void assessQueries(String input, List<Integer> q){
		Set<Integer> weights = new HashSet<>();
		for(int i = 0; i < input.length(); i++) {
			int count = 1;
			weights.add(wt(input.charAt(i)));
			while((i+1) < input.length() && input.charAt(i) == input.charAt(i+1)) {
				i++;
				count++;
				weights.add(wt(input.charAt(i)) * count);
			}
			count = 0;
		}
		for(Integer each:q) {
			System.out.println(weights.contains(each) ? "Yes" : "No");
		}
	}
	
	
	private static int wt(char c) {
		return c - 'a' + 1;
	}
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n = in.nextInt();
        List<Integer> q = new ArrayList<>();
        for(int a0 = 0; a0 < n; a0++){
            q.add(in.nextInt());
            // your code goes here
        }
        WeightedUniformStrings.assessQueries(s, q);
        
    }
}
