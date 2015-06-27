package Sorting;
import java.util.List;
import java.util.Scanner;

public class CountingSortIntro {
	public static void printArr(int[] arr){
		for(int a : arr){
			System.out.print(a+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] freq = new int[100];
		while(N-->0){
			freq[sc.nextInt()]++;
		}
		
		printArr(freq);
	}
}
