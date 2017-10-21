package com.practice.before2017.Hackerrank.Warmup;

import java.util.Scanner;

public class SmithNumber {

	public int sumOfPrimeFactors(int num){
		int sum = 0;
		for(int i = 2;i<=num;i++){
			while(num % i == 0){
				if(i%2!=0 || i == 2){
					sum += this.sumOfDigits(i);
					num /= i;
					}
			}
		}
		return sum;
	}
	
	public int sumOfDigits(int num){
		int sum = 0;
		while(num>0){
			sum += num%10;
			num /= 10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		SmithNumber sm = new SmithNumber();
		Scanner sc = new Scanner(System.in);
		int inNum  = sc.nextInt();
		if(sm.sumOfDigits(inNum) == sm.sumOfPrimeFactors(inNum)) System.out.println(1);
		else System.out.println(0);
	}
}
