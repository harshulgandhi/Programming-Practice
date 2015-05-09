package Warmup;
/*Program to reverse
 * a number taken as
 * input from user
 * */

import java.util.*;
import java.math.*;
public class ReverseNumber {
public static void main(String []args){

	Scanner in = new Scanner(System.in);
	System.out.println("Enter a number to reversed:\n");
	int num;
	num = in.nextInt();
	int num_length;
	num_length = String.valueOf(num).length();
	int num_reverse = 0;
	
	for (int i = num_length;i>0;i--){
		int temp = num/(int)Math.pow(10, i-1);
		num = num%(int)Math.pow(10, i-1);
		num_reverse= num_reverse + temp*((int)Math.pow(10, num_length-i));
	}
	
	System.out.println("Reversed number is \n"+num_reverse);
	
	
}
}
