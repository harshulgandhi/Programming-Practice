package Hackerrank.Warmup;

import java.util.Scanner;

public class CompareTheTriplet {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = 3;
		int A[] = new int[N];
		for(int i=0;i<N;i++){
			A[i] = s.nextInt();
		}
		int B[] = new int[N];
		for(int i=0;i<N;i++){
			B[i] = s.nextInt();
		}
		int A_Score = 0;
		int B_Score = 0;
		for(int j = 0; j<N ; j++) {
			if(A[j] > B[j]){
				A_Score++;
			} else if (A[j] < B[j]) {
				B_Score++;
			} 
		}
		System.out.println(A_Score + " "+ B_Score);
		
	}
}
