package Hackerrank.Sorting;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class PartitionQuickSort {
	public static void printArr(List<Integer> arr){
		for(int i = 0;i<arr.size();i++){
			System.out.print(arr.get(i)+" ");
		}
		System.out.println();
	}
	
	static void partition(int[] ar){
		int pivot = ar[0];
		List<Integer> left = new ArrayList<Integer>();
		List<Integer> right = new ArrayList<Integer>();
		for (int i = 0;i<ar.length;i++){
			if(ar[i] < pivot) left.add(ar[i]);
			else if (ar[i] > pivot) right.add(ar[i]);
		}
		List<Integer> output = new ArrayList<Integer>();;
		output.addAll(left);
		output.add(pivot);
		output.addAll(right);
		printArr(output);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] inputArr = new int[N];
		for(int i = 0;i<N;i++){
			inputArr[i] = sc.nextInt();
		}
		
		partition(inputArr);
	}
}
