package com.practice.before2017.Hackerrank.Sorting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class ClosestNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int minDiff = 20000000;
		int N = sc.nextInt();
		int[] inputArr = new int[N];
		for(int i = 0;i<N;i++){
			inputArr[i] = sc.nextInt();
			
		}
		ArrayList<Integer> output = new ArrayList<>();
		Arrays.sort(inputArr);
		for(int i = 0;i<N-1;i++){
//			System.out.println("inputArr["+i+"]: "+inputArr[i]);
//			System.out.println("inputArr["+(i+1)+"]: "+inputArr[i+1]);
//			System.out.println("inputArr[i] - inputArr[i+1] : "+(inputArr[i] - inputArr[i+1]));
			if(Math.abs(inputArr[i] - inputArr[i+1]) < minDiff){
				output.clear();
				output.add(inputArr[i]);
				output.add(inputArr[i+1]);
				minDiff=Math.abs(inputArr[i] - inputArr[i+1]);
			}
			else if(Math.abs(inputArr[i] - inputArr[i+1]) == minDiff){
				output.add(inputArr[i]);
				output.add(inputArr[i+1]);
			}
		}
		for(int a:output){
			System.out.print(a+" ");
		}
//		System.out.println(output);
	}
}
