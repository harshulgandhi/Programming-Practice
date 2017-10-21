package com.practice.before2017.CTCI.ArraysAndStrings;
import java.util.Scanner;

public class RotateMatrix{
	int[][] matrix = null;

	private void replaceMatrixElements(int i, int j){

	}

	private void rotateMatrix(){
		int N = matrix[0].length;
		int i = 0, j = 0;
		while(i<N){
			while(j<N){
				// System.out.println("i : "+i+" | j : "+j);
				int temp1 = matrix[i][j];
				matrix[i][j] = matrix[N-1-j][i];
				int temp2 = matrix[j][N-1-i];
				matrix[j][N-1-i] = temp1;
				int temp3 = matrix[N-1-i][N-1-j];
				matrix[N-1-i][N-1-j] = temp2;
				int temp4 = matrix[N-1-j][i];
				matrix[N-1-j][i] = temp3;
				j++;
			} 
			j=1;
			i++;
		}
	}



	private void printMatrix(){
		int N = matrix[0].length;
		for(int i=0;i<N;i++){
			for(int j = 0;j<N;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}	
	}

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		RotateMatrix obj = new RotateMatrix();
		obj.matrix = new int[N][N];

		for(int i = 0;i<N;i++){
			for(int j = 0;j<N;j++){
				obj.matrix[i][j] = s.nextInt();
			}
		}

		System.out.println("\nPrinting matrix!");
		obj.printMatrix();
		System.out.println("\nRotating matrix!");
		obj.rotateMatrix();
		obj.printMatrix();
	}
}

/*
Input: 
3
1 2 3
4 5 6
7 8 9

*/