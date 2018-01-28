package com.practice.after2017.hackerrank.algorithms.strings;

import java.util.Scanner;

public class SeparateTheNumbers {
	static void separateNumbers(String s) {
        // Complete this function
		StringBuilder str = new StringBuilder();
		String beginning = "";
		for(int j = 1; j<s.length()/2 + 1;j++) {
			String sub = s.substring(0, j);
			String next = (Long.parseLong(sub) + 1) + "";
//				while(s.indexOf(next) != -1) {
			while(str.length() < s.length()) {
				if(beginning == "") {
					beginning = sub;
					str.append(sub);
				}
				str.append(next);
				sub = next;
				next = (Long.parseLong(sub) + 1)+"";
			}
			if(s.equals(str.toString())){
				System.out.println("YES "+beginning);
				return;
			} else {
				beginning = "";
				str = new StringBuilder();
			}
		}
		
		System.out.println("NO");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            separateNumbers(s);
        }
        in.close();
    }
}
