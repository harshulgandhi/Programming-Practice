package Sorting;

import java.util.HashMap;
import java.util.Scanner;

public class CountingSort {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		HashMap<Integer, StringBuilder> map = new HashMap<Integer, StringBuilder>();
		
		for (int i=0; i<n; i++) {
			int num = s.nextInt();
			String inp = s.next();
			String str = ( i >= n/2) ? inp : "-";
			
			if (map.containsKey(num)) {
				map.get(num).append(str).append(" ");
			} else {
				map.put(num, new StringBuilder(str).append(" "));
			}
		}
		
		StringBuilder output = new StringBuilder();
		for(int i=0; i<n; i++) {
			if (map.containsKey(i)) {
				output.append(map.get(i));
			}
		}
		
		System.out.println(output);
		s.close();
	}
}
