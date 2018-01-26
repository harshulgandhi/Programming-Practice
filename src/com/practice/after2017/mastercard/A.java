package com.practice.after2017.mastercard;

import java.util.HashMap;
import java.util.Map;

public class A {
	static int verifyItems(String[] origItems, float[] origPrices, String[] items, float[] prices) {
		Map<String, Float> itemsMap = new HashMap<>();
		for (int i = 0; i < origItems.length ; i++) {
			itemsMap.put(origItems[i],origPrices[i]);
	   }
	  
	   int count = 0;
	   for (int i = 0; i < items.length ; i++) {
	       count += itemsMap.getOrDefault(items[i],Float.MIN_VALUE) == prices[i] ? 0: 1;
	   }
	  
	  
	   return count;
	}
	public static void main(String[] args) {
		
	}
}
