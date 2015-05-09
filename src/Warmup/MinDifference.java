package Warmup;
import java.util.*;


public class MinDifference {
	public int in_arr[];
	public int N;
	public void input(){
		System.out.println("Enter the number of elements for the array: ");
		Scanner sn = new Scanner(System.in);
		N = sn.nextInt();
		in_arr = new int[N];
		System.out.println("Enter "+N+" elements for the array");
		for (int i =0;i<N;i++){
			in_arr[i] = sn.nextInt();
		}
	}
	
	public int find_minimum_gap(int arr[],int n){
		Arrays.sort(arr); 		//Quicksort method (static) defined in 'Arrays' class in java
		int min = 10000;
		for (int i = 0;i<n-1;i++){
			if(min>Math.abs(arr[i]-arr[i+1])) min = Math.abs(arr[i]-arr[i+1]); 
		}
		return min;
	}
	
	public static void main(String[] args){
		/*
		 * Calculating minimum abs difference of two numbers
		 * in an int array
		 * */
		MinDifference md_obj = new MinDifference();
		md_obj.input();
		System.out.println("Minimum difference in this array is : "+md_obj.find_minimum_gap(md_obj.in_arr, md_obj.N));
	}
}
