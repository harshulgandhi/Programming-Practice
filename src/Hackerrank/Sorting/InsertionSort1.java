package Hackerrank.Sorting;
import java.util.Scanner;

public class InsertionSort1 {
	
	public static void printArr(int arr[]){
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int len = N;
		int[] sortedArr = new int[N];
		while(N>0){
			sortedArr[len-N] = sc.nextInt();
			N--;
		}
		
		int toInsert = sortedArr[len-1];
		for(int j = len-2;j>=0;j--){
			if(sortedArr[j] > toInsert){
				sortedArr[j+1] = sortedArr[j];
				printArr(sortedArr);
				System.out.println();
				if(j==0) {
					sortedArr[j] = toInsert;
					printArr(sortedArr);
				}
			}
			else{
				sortedArr[j+1] = toInsert;
				printArr(sortedArr);
				break;
			}
		}
	}
}
