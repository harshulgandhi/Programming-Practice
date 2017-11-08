package com.practice.after2017.algorithm.misc;

public class MatrixProducts {
	
	int[][] dotProduct(int[][] matrixA, int[][] matrixB) {
		int[][] output = new int[matrixA.length][matrixA[0].length];
		if(matrixA.length != matrixB.length
				|| matrixA[0].length != matrixB[0].length) {
			System.out.println("Matrix are not of same size");
			return output;
		}
		for(int i = 0; i < matrixA.length; i++) {
			for(int j = 0; j < matrixA[0].length; j++) {
				output[i][j] = matrixA[i][j] * matrixB[i][j];
			}
		}
		return output;
	}
	
	int[][] crossProduct(int[][] matrixA, int[][] matrixB) {
		int[][] output = new int[matrixA.length][matrixB[0].length];
		if(matrixA[0].length != matrixB.length) {
			System.out.println("Matrix are not of compatible");
			return output;
		}
		
		for(int i = 0; i < matrixA.length; i++) {
			for(int j = 0; j < matrixB[0].length; j++) {
				for(int k = 0; k < matrixA[0].length; k++) {
					output[i][j] += matrixA[i][k] * matrixB[k][j];
				}
				
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		int[][] matrixA = new int[][]{{2,3,4},{5,6,7}};
		int[][] matrixB = new int[][]{{2,3,4},{5,6,7}};
		MatrixProducts mp = new MatrixProducts();
		int[][] output = mp.dotProduct(matrixA, matrixB);
		for(int[] each : output) {
			for(int eachNum : each) {
				System.out.print(eachNum + " ");
			}
			System.out.println();
		}
		
		matrixA = new int[][]{{2,3,4},{5,6,7}};
		matrixB = new int[][]{{2},{3},{4}};
		output = mp.crossProduct(matrixA, matrixB);
		for(int[] each : output) {
			for(int eachNum : each) {
				System.out.print(eachNum + " ");
			}
			System.out.println();
		}
	}
}
