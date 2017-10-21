package com.practice.before2017.LeetCode;
import java.util.Scanner;

public class CountNumOne {
	
	public int countDigitOne(long n){
		int count = 0;
//		int quot = (int) Math.floor(n/100);
//		int rem = n%100;
//		n = rem;
//		for(int i = 0;i<=n;i+=10){
//			if (i == 10){
//				if(n>19) count += 10;
//				else count += (n-9);
//			}
//			else count += 1;
//		}
//		return count+(100*quot);
		for(long i =1;i<=n;i++){
			count += numOfOnes(i);
		}
		return count;
	}
	
	public int numOfOnes(long n){
		int count = 0;
		while(n>0){
			if(n%10 == 1) count +=1;
			n = n/10;
		}
		return count;
	}
	public static void main(String[] args) {
		CountNumOne obj = new CountNumOne();
		Scanner s = new Scanner(System.in);
		long N = s.nextLong();
		System.out.println(obj.countDigitOne(N));
//		System.out.println(obj.numOfOnes(N));
	}
}
