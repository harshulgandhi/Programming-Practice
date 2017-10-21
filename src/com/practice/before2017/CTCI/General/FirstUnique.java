package com.practice.before2017.CTCI.General;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUnique{

	Map<Character, Integer> map = null;

	public char getFirstUnique(String input){
		map = new LinkedHashMap<Character, Integer>();
		char[] charArr = input.toCharArray();
		for(char eachChar : charArr){
			if(map.keySet().contains(eachChar)){
				map.put(eachChar, map.get(eachChar)+1);
			}else map.put(eachChar, 1);
		}
		for(Character key : map.keySet()){
			System.out.println("key : "+key+" value : " + map.get(key));
		}

		for(Character key : map.keySet()){
			if(map.get(key) == 1) return key;
		}
		return 'a';
	}

	public static void main(String[] args){
		FirstUnique obj = new FirstUnique();
		System.out.println(obj.getFirstUnique("Morning"));

	}
}