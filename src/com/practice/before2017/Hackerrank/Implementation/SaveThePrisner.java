package com.practice.before2017.Hackerrank.Implementation;

import java.util.Map;
import java.util.Scanner;


public class SaveThePrisner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0) {
			long N = s.nextLong();
			long M = s.nextLong();
			long S = s.nextLong();
			long res = (M+S-1) % N;
			System.out.println(res == 0 ? N : res);
			
		}
	}
}
