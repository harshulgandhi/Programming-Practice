package Hackerrank.Warmup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class ConvertPalindrome {

	public static int makePalindrome(String quer){
		int len = quer.length();
		int steps = 0;
		int count = 0;
		for(int fr = 0,re=len-1;fr!=re;fr++,re--){
			System.out.println("fr = "+fr+"; re = "+re);
			int diff = (quer.charAt(fr) - quer.charAt(re));
			if(diff == 0)
			{
				if(fr+1==re){ break;}
				else continue;
			}
			else if (diff<0 || diff>0){	steps += Math.abs(diff); }
			if(fr+1==re) break;  
		}
		return steps;
	}
	public static void main(String[] args){
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		String[] queries = new String[num];
		for (int i = 0; i < num; i++){
			queries[i] = sc.next();
		}
		for (int i = 0; i < num; i++){
			System.out.println(makePalindrome(queries[i]));
		}
	}
}
