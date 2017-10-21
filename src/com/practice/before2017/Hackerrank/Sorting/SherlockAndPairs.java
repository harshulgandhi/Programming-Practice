package com.practice.before2017.Hackerrank.Sorting;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class SherlockAndPairs {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		while(T-->0){
			int N = s.nextInt();
			int[] inArr = new int[N];
			HashMap<Integer,Long> map = new HashMap<>();
			for (int i = 0;i<N;i++){
				inArr[i] = s.nextInt();
				if(map.get(inArr[i]) == null) map.put(inArr[i],(long)1);
				else map.put(inArr[i], map.get(inArr[i])+1);
			}
			long count = 0;
			for(Integer k : map.keySet()){
				if(map.get(k) > 1){
					count += ((map.get(k)*(map.get(k)-1)));
				}
			}
			
			
//			Arrays.sort(inArr);
//			for(int a : inArr) System.out.print(a+" ");
//			System.out.println();
//			for(int i = 0;i<N-1;i++){
//				if(inArr[i] == inArr[i+1]){
//					count+=1;
//				}
//			}
			
			System.out.println(count);
		}
	}
}
