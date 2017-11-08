package com.practice.after2017.amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.practice.before2017.Test;

public class CartOffer {
	
	private static final String ANYTHING = "anything";
	
	public int checkWinner(List<List<String>> codeList, List<String> cart) {
		int group = 0;
		int groupIdx = 0;
		
		for(int i = 0; i < cart.size(); i++) {
			List<String> currGroup = codeList.get(group);
			
			if(cart.get(i).equals(currGroup.get(groupIdx)) 
					|| currGroup.get(groupIdx).equals(ANYTHING)) {
				
				while(cart.get(i).equals(currGroup.get(groupIdx)) 
						|| currGroup.get(groupIdx).equals(ANYTHING)) {
					i++;
					groupIdx++;
					if(i == cart.size() - 1 || groupIdx == currGroup.size() - 1) {
						break;
					}
				}
				
				// all code lists checked
				if(group == codeList.size() - 1) {
					
				}
				
				if(group == codeList.size() - 1 && i == cart.size() - 1
						&& (cart.get(i).equals(currGroup.get(groupIdx)) 
								|| currGroup.get(groupIdx).equals(ANYTHING))) {
					return 1;
				} else if(group == codeList.size() - 1) {
					return 0;
				}
				else {
					group++;
				}
				groupIdx = 0;
			}
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
	   String A = "apple";
	   String B = "banana";
	   String O = "orange";
	   String ANY = "anything";
	   List<List<String>> codeList = new ArrayList<>();
	   codeList.add(Arrays.asList(A, A));
	   codeList.add(Arrays.asList(B, ANY, B));
	   List<String> shoppingCart = Arrays.asList(O,A,A,O,B,O,B,A);
	   System.out.println(new CartOffer().checkWinner(codeList, shoppingCart));
	}
}
