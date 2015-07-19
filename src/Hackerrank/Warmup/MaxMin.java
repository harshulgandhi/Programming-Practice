package Hackerrank.Warmup;
import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int k = sc.nextInt();
		int[] inArr = new int[N];
		for(int i = 0;i<N;i++){
			inArr[i]=sc.nextInt();
		}
		Arrays.sort(inArr);
		int min = (int) (Math.pow(2,32) -1);
		for(int i = 0;i<N-(k-1);i++){
			if(min>(inArr[i+k-1]-inArr[i])){
				min = (inArr[i+k-1]-inArr[i]);
			}
		}
		
		System.out.println(min);
	}
}
