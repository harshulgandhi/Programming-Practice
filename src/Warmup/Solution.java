package Warmup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
 * Class to flip bits of input
 * integers
 * */
public class Solution{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	System.out.println("Enter number of integers to be flipped");
    	int N;
    	Scanner sn = new Scanner(System.in);
    	N = sn.nextInt();
    	for(int i = 0;i<N;i++){
    		System.out.println("Enter number to be flipped : ");
    		//int num = sn.nextInt();
    		long num = sn.nextLong();
    		System.out.println("Flipped number is : ");
    		System.out.println(flipNum(num));
    	}
    }
    
    public static long flipNum(long num){
    	
    	return (~num) & 0x00000000ffffffffL;
    	/*
    	long converter_xor = (long) (Math.pow(2,32));
    	long temp = num ^ converter_xor;
    	long converter_and = (long)(Math.pow(2,32));
    	return (temp & converter_and);*/
    	/*if(num == (temp & converter_and)){return temp;}
    	else {return (temp + (long)Math.pow(2, 32));}*/
    }
}