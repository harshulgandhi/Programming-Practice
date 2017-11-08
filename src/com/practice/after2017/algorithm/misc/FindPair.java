package com.practice.after2017.algorithm.misc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Find pairs of numbers in an array with 
 * sum as K
 */
public class FindPair {
	
	public Map<Integer, Integer> freqMap(int[] arr) {
		Map<Integer, Integer> freq = new HashMap<>();
		for(int eachNum : arr) {
			if(!freq.containsKey(eachNum)) {
				freq.put(eachNum, 1);
				continue;
			} 
			freq.put(eachNum, freq.get(eachNum) + 1);
		}
		return freq;
	}
	
	public void findPair(int[] numbers, int K) {
		Map<Integer, Integer> freq = freqMap(numbers);
		int pairCount = 0;
		for(int eachNumber : numbers) {
			int checkNum = K - eachNumber;
			if(freq.get(checkNum) != null) {
				pairCount += freq.get(checkNum);
				int i = 0;
				while(i < freq.get(checkNum)) {
					System.out.println("("+eachNumber+","+checkNum+")");
					i++;
				}
			}
		}
		System.out.println(pairCount/2);
	}
	
	public static void main(String[] args) {
		FindPair fp = new FindPair();
		fp.findPair(new int[]{3, 4, 2,-2, 5,0,1,7}, 5);
	}
	
}
