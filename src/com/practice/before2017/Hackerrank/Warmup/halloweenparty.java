package com.practice.before2017.Hackerrank.Warmup;
import java.util.Scanner;
public class halloweenparty {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
			long N = (long)sc.nextInt();
			if(N%2==0) System.out.println((long)((N/2)*(N/2)));
			else System.out.println((long)((N/2)*((N/2)+1)));
		}
	}
}
