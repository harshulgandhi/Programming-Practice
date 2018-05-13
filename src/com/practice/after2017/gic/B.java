package com.practice.after2017.gic;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class B {
	public static void main(String[] args) {
		Map<String, Integer> map1 = new HashMap<>();
		Map<String, Integer> map2 = new HashMap<>();
		map1.put("Apple", 100);
		map1.put("Banana", 50);
		map2.put("Apple", 40);
		map2.put("Orang", 150);
		Map<String, Integer> map = Stream.concat(map1.entrySet().stream(), map2.entrySet().stream())
				.collect(Collectors.groupingBy(Map.Entry::getKey, Collectors.summingInt(Map.Entry::getValue)));
		for (Entry<String, Integer> e : map.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}

	}
}
