package com.practice.before2017.Hackerrank.Warmup;
import java.util.*;

class maximizexor{

public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	int max = -1;
	for (int i = num1;i<=num2;i++){
		for (int j = num1;j<=num2;j++){
			if((i^j)>max){
				max = i^j;
			}
		}
	}
	System.out.println(max);
}
}