package com.practice.after2017.hackerrank.algorithms.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/beautiful-triplets/problem
 * */
public class BeautifulTriplets {
	static int beautifulTriplets(int d, int[] arr) {
		int count = 0;
        // Complete this function
		List<Integer> numbers = new ArrayList<Integer>();  
		for(Integer num : arr) {
			numbers.add(num);
		}
		 
		for(Integer num : numbers) {
			if(numbers.contains(num + d) && numbers.contains(num + 2*d)) {
				count++;
			}
		}
		return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = beautifulTriplets(d, arr);
        System.out.println(result);
        in.close();
    }
}
