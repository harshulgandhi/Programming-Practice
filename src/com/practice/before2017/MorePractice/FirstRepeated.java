package com.practice.before2017.MorePractice;

import java.util.Map;
import java.util.LinkedHashMap;

public class FirstRepeated{

	public Map getFreqMap(String inp){
		Map<Character, Integer> freq = new LinkedHashMap<Character, Integer>();
		for(char c : inp.toCharArray()){
			if(freq.keySet().contains(c)) freq.put(c, freq.get(c)+1);
			else freq.put(c, 1);
		}
		return freq;
	}

	public char getRepeatedChar(Map<Character, Integer> freq){
		for(Character c : freq.keySet()){
			if (freq.get(c) == 1) return c;
		}
		return 'x';
	}

	public static void main(String[] args){
		FirstRepeated obj = new FirstRepeated();
		Map freq = obj.getFreqMap("HeloWorld");
		System.out.println("First Non Repeated is "+obj.getRepeatedChar(freq));
	}
}