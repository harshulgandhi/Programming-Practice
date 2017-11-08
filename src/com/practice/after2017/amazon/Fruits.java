package com.practice.after2017.amazon;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fruits {

private static final String ANTHING = "ANYTHING";

	public int solve(List<List<String>> codeList, List<String> shoppingCart) {
		int i=0;
		int size = shoppingCart.size();
		for (List<String> code : codeList) {
			while (i<size && !match(code, shoppingCart, i)) {
				i++;
			}
			if (i>=size) {
				return 0;
			}
			i = i + code.size();
		}
		return 1;
	}
	
	private boolean match(List<String> code, List<String> shoppingCart, int i) {
		int j =0;
			for (j=0; j<code.size() && i<shoppingCart.size(); j++,i++) {
				if (ANTHING.equals(code.get(j)) || code.get(j).equals(shoppingCart.get(i))) {
					continue;
				} else {
					break;
				}
			}
		return j==code.size();
	}
	
	public static void main(String[] args) {
		Fruits f = new Fruits();
		
		List<List<String>> codeList = new ArrayList<List<String>>();
		codeList.add(Arrays.asList(ANTHING));
		codeList.add(Arrays.asList("b", ANTHING, "b"));
		
		List<String> shoppingCart = Arrays.asList("a","a","a","a","a","a","b","x","b");
		
		System.out.println(f.solve(codeList, shoppingCart));
	}
}