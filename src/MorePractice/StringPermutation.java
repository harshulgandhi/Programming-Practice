package MorePractice;
/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class StringPermutation
{	
	static List<String> permList = new ArrayList<String>();
	public static void swap(char[] c , int i, int j){
		char temp = c[i];
		c[i] = c[j];
		c[j] = temp;
	}
	
	public static void permutate(char[] c, int start, int end){
		if(start == end-1){
			permList.add(new String(c));
			return;
		}
		for(int i = start;i<end;i++){
			swap(c, start, i);
			permutate(c, start+1, end);
			swap(c, start, i);
		}
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		String s = "ABC";
		char[] c = s.toCharArray();
		StringPermutation.permutate(c, 0, c.length );
		for(String perm : StringPermutation.permList){
			System.out.println(perm);
		}
	}
}
