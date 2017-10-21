package com.practice.before2017.MorePractice;

class InsertionSort
{	
	public static void swap(int[] arr, int i , int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void sort(int[] arr){
		for(int i = 1; i< arr.length; i++){
			int j = i;
			while(j > 0 && arr[j-1] > arr[j] ){
				swap(arr,j-1,j);
				j--;
			}
		}
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] arr  = {9,8,7,6,5,1,2,3};
		InsertionSort.sort(arr);
		for(int num : arr){
			System.out.print(num+" ");
		}
	}
}
