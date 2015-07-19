package Hackerrank.Warmup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ReverseGame {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int numTest = sc.nextInt();
		
		int testCases[][] = new int[numTest][2];
		for(int i = 0; i<numTest;i++){
			testCases[i][0] = sc.nextInt();
			testCases[i][1] = sc.nextInt();
		}
		
		for(int i = 0; i<numTest;i++){
			int mid = 0;
			int num = testCases[i][1];
			int N = testCases[i][0];
			if(num>= N/2){
				int set = N-num-1;
				System.out.println(set*2);
			}
			else if(num<N/2){
				System.out.println(num*2+1);
			}
		}
		
	}
	
}
