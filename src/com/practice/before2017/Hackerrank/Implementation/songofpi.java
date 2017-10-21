package com.practice.before2017.Hackerrank.Implementation;
import java.util.Scanner;
public class songofpi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pi = "3.1415926535897932384626433833";
		pi = pi.replace(".","");
		char[] pi_arr =  pi.toCharArray();
		int T = sc.nextInt();
		sc.nextLine();
		while(T-->0){
			String inStr = sc.nextLine();
			String[] inStr_arr = inStr.split("\\s+");
			int len = inStr_arr.length;
			boolean isPi = true;
			for(int i = 0;i<len;i++){
				if(inStr_arr[i].length() == Character.getNumericValue(pi_arr[i])){ 
					continue;
				}
				else{
					isPi = false;
					break;
				}
			}
			if(isPi) System.out.println("It's a pi song.");
			else System.out.println("It's not a pi song.");
		}
	}
}
