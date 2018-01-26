package com.practice.after2017.hackerrank.algorithms.implementation;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/day-of-the-programmer/problem
 * */
public class DayOfTheProgrammer {
	static String solve(int year){
		String date = "";
		if(year == 1918) {
			date = "26.09.1918";
		} else if((year > 1918 && gregorianLeapYear(year)) || (year < 1918 && julianLeapYear(year))) {
        	date = "12.09."+year;
        } else {
        	date = "13.09."+year;
        }
        	
		return date;
    }

	private static boolean gregorianLeapYear(int year) {
		return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
	}
	
	private static boolean julianLeapYear(int year) {
		return year % 4 == 0; 
	}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}
