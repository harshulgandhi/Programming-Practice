package com.practice.before2017.TopCoder.BruteForce;

import java.util.HashSet;
import java.util.Set;

public class Xylophone {
	
	public int countKeys(int[] keys) {
		Set<Integer> notes = new HashSet<>();
		for(int i = 0; i<keys.length; i++) {
			notes.add(keys[i] % 7);
		}
		return notes.size();
	}
	
	public static void main(String[] args) {
		Xylophone x = new Xylophone();
		System.out.println(x.countKeys(new int[]{50,10,20,30,11,30,24,38,5,2,9}));
	}
}
