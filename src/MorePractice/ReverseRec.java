package MorePractice;
/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ReverseRec
{	
	public static void swap(char[] c , int i, int j){
		char temp = c[i];
		c[i] = c[j];
		c[j] = temp;
	}
	
	
	public static void reverse(char[] str, int start, int end){
		if(start >end) return;
		
		reverse(str, start+1, end -1);
		swap(str, start, end );
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		String s = "reversethisstrig";
		char[] c = s.toCharArray();
		ReverseRec.reverse(c,0,s.length()-1);
		System.out.println(new String(c));
	}
}
