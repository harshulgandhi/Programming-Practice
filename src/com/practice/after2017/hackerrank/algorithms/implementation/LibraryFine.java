package com.practice.after2017.hackerrank.algorithms.implementation;

import java.util.Scanner;
/**
 * https://www.hackerrank.com/challenges/library-fine/problem
 * */
public class LibraryFine {
	static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
		if (y1 != y2) {
			if(y1>y2) {
				return 10000;
			} else { 
				return 0;
			}
		} else if (m1 != m2) {
			if(m1 > m2) {
				return 500 * (m1-m2);
			} else {
				return 0;
			}
		} else if (d1 != d2) {
			if(d1 > d2) {
				return 15 * (d1 - d2);
			} else {
				return 0;
			}
		} else return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d1 = in.nextInt();
        int m1 = in.nextInt();
        int y1 = in.nextInt();
        int d2 = in.nextInt();
        int m2 = in.nextInt();
        int y2 = in.nextInt();
        int result = libraryFine(d1, m1, y1, d2, m2, y2);
        System.out.println(result);
        in.close();
    }
}
