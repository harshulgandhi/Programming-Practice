package Sorting;
import java.util.Arrays;
import java.util.Scanner;

public class AlmostSorted {
	
	public static boolean isSorted(int arr[]){
		for(int i = 0;i<arr.length-1;i++) {
			if(arr[i] > arr[i+1]){
				return false;
			}
		}
		return true;
	}
	
	public static int getMinIndex(int arr[], int start, int end){
		int min = 1000001;
		int minIdx = 0;
		for(int i = start;i<end;i++){
			if(arr[i] < min) {
				minIdx = i;
				min = arr[i];
			}
		}
		return minIdx;
	}
	
	public static void swapElementsInArray(int arr[], int i,int j){
		if(i == j) return;
		arr[j] = arr[j] - arr[i];
		arr[i] = arr[i] + arr[j];
		arr[j] = arr[i] - arr[j];
	}
	
	public static boolean swapMethod(int arr[]){
		int minIdx = 0;
		int swapIdx = 0;
		int len = arr.length;
		for(int i=0;i<len-1;i++){
			if(arr[i] > arr[i+1]){
				swapIdx = i;
				minIdx = getMinIndex(arr, swapIdx+1, len);
				break;
			}
		}
		swapElementsInArray(arr, swapIdx, minIdx);
		boolean isSorted = isSorted(arr);
		if(isSorted) {
			System.out.println("yes\nswap "+(swapIdx+1)+" "+(minIdx+1));
		}
		return isSorted;		
	}
	
	
	public static void reverseSubArray(int arr[], int start, int end){
		for(int i = start,j=end;i<=j;i++,j--){
			swapElementsInArray(arr, i, j);
		}
	}
	
	
	public static boolean reverseMethod(int arr[]){
		int len = arr.length;
		int i =0,j=0;
		for(i = 0;i<len-1;i++){
			if(arr[i] > arr[i+1]){
				for (j = i;;j++){
					if(arr[j] < arr[j+1] || j == arr.length-1){
						break;
					}
				}
				break;
			}
		}
		reverseSubArray(arr, i, j);
//		for (int a : arr) { System.out.print(a+" ");}
		boolean isSorted = isSorted(arr);
		if(isSorted) {
			System.out.println("yes\nreverse "+(i+1)+" "+(j+1));
		}
		return isSorted;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[] inArr = new int[N];
		for (int i=0;i<N;i++){
			inArr[i] = s.nextInt();
		}
		
		int[] inArr2 = 	Arrays.copyOf(inArr,inArr.length);
		boolean isSwapped = swapMethod(inArr2);
		
		if(!isSwapped){
			isSwapped = reverseMethod(inArr);
//			for(int a : inArr)System.out.print(a+" ");
			if(!isSwapped) System.out.println("no");
		}
	}
}
