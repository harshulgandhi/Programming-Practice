package com.practice.after2017.hackerrank.algorithms.implementation;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/bomber-man/problem
 * */
public class BombermanGame {
	static String[] bomberMan(int n, String[] grid) {
		String[] arr = new String[grid.length];
        // Complete this function
		
		return arr;
    }
	
	static void bombBlast(char[][] grid, int bombI, int bombJ) {
		int R = grid.length;
		int C = grid[0].length;
		grid[bombI][bombJ] = '.';
		if(bombI > 0) {
			grid[bombI-1][bombJ] = '.'; 
		} 
		if(bombI < R - 1) {
			grid[bombI+1][bombJ] = '.';
		}
		if(bombJ > 0) {
			grid[bombI][bombJ-1] = '.';
		}
		if(bombJ < C - 1) {
			grid[bombI][bombJ + 1] = '.';
		}
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int c = in.nextInt();
        int n = in.nextInt();
        String[] grid = new String[r];
        for(int grid_i = 0; grid_i < r; grid_i++){
            grid[grid_i] = in.next();
        }
        String[] result = bomberMan(n, grid);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    	
    	char[][] t = new char[2][3];
    	System.out.println(t.length+", "+t[0].length);
    }
}
