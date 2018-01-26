package com.practice.after2017.hackerrank.algorithms.implementation;

import java.util.Arrays;
import java.util.Scanner;

public class TheHurdleRace {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        Arrays.sort(height);
        int magicDrinks = height[height.length-1] > k ? height[height.length-1] - k : 0;
        System.out.println(magicDrinks);
	}
}
