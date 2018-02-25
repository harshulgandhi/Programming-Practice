package com.practice.after2017.leetcode.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AccountsMerge {
	private List<String> merge(List<String> list1, List<String> list2) {
		List<String> result = new ArrayList<>();
		Set<String> set = new HashSet<>();
		for(int i = 1; i < list1.size(); i++) {
			set.add(list1.get(i));
		}
		for(int i = 1; i < list2.size(); i++) {
			set.add(list2.get(i));
		}
		List<String> list = new ArrayList<>();
		list.addAll(set);
		result.add(list1.get(0));
		result.addAll(list);
		return result;
	}
	public List<List<String>> accountsMerge(List<List<String>> accounts) {
		List<List<String>> result = new ArrayList<>();
		
		for(int i = 0; i < accounts.size(); i++) {
			for(int j = 0; j < accounts.size(); j++) {
				if(i != j) {
					for(int k = 1; k < accounts.get(i).size(); k++) {
						if(accounts.get(j).contains(accounts.get(i).get(k))) {
							List<String> merged = merge(accounts.get(j), accounts.get(i));
							result.add(merged);
						}
					}
				}
			}
			result.add(accounts.get(i));
		}
		
		return result;
    }
	
	public static void main(String[] args) {
		AccountsMerge am = new AccountsMerge();
		List<List<String>> accounts = new ArrayList<>();
		List<String> l1 = Arrays.asList("John", "johnsmith@mail.com", "john00@mail.com");
		List<String> l2 = Arrays.asList("John", "johnnybravo@mail.com");
		List<String> l3 = Arrays.asList("John", "johnsmith@mail.com", "john_newyork@mail.com");
		List<String> l4 = Arrays.asList("Mary", "mary@mail.com");
		accounts.add(l1);
		accounts.add(l2);
		accounts.add(l3);
		accounts.add(l4);
		List<List<String>> result = am.accountsMerge(accounts);
		for(List<String> eachList : result) {
			for(String each : eachList) {
				System.out.print(each + ", ");
			}
			System.out.println();
		}
 	}
}
