package com.practice.after2017.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortHashMapOnValues {
	public static void printMap(Map<Integer, String> map) {
		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}
	}

	public void sortByValues() {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "froyo");
		map.put(2, "abby");
		map.put(3, "denver");
		map.put(4, "frost");
		map.put(5, "daisy");

		List<Entry<Integer, String>> list = new ArrayList<Entry<Integer, String>>(map.entrySet());
		printMap(map);

		Collections.sort(list, new Comparator<Entry<Integer, String>>() {
			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});

		Map<Integer, String> map2 = new LinkedHashMap<>();
		list.forEach(entry -> {
			map2.put(entry.getKey(), entry.getValue());
		});
		printMap(map2);
	}

	public static void main(String[] args) {
		SortHashMapOnValues s = new SortHashMapOnValues();
		s.sortByValues();
	}
}
