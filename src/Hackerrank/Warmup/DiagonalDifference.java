package Hackerrank.Warmup;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int mat[][] = new int[N][N];
		for(int i = 0 ; i < N ;i++){
			for(int j = 0 ; j< N ; j++) {
				mat[i][j] = s.nextInt();
			}
		}
		
		int diag1 = 0;
		int diag2 = 0;
		
		for(int i = 0, j = N-1;i<N;i++,j--) {
			diag1 += mat[i][i];
			diag2 += mat[j][i];
		}
		
		System.out.println(Math.abs(diag1 - diag2));
		
		
	}
}
