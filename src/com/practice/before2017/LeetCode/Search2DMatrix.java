package com.practice.before2017.LeetCode;
import java.util.Arrays;
import java.util.Scanner;
public class Search2DMatrix {
	int N = 0, M = 0;
	
	public boolean searchMatrix(int[][] matrix, int target) {
		for (int i = 0,j = 0;i<N && j < M;i++,j++) {
			if(matrix[i][j] == target) return true;
			int[] temp = new int[M-j];
			for(int p = 0;j+p<M;p++){
				temp[p] = matrix[i][j+p];
			}
//			for(int each:temp) System.out.print(each+" ");
			if(Arrays.binarySearch(temp, target) > 0) return true;
//			System.out.println();
			int[] temp2 = new int[N-i];
			for(int p = 0;i+p<N;p++){
				temp2[p] = matrix[i+p][j];
			}
//			for (int each: temp2) System.out.print(each+" ");
			if(Arrays.binarySearch(temp2, target) > 0) return true;
			
		}
		
		return false;
    }
	
	
	public static void main(String[] args) {
	Search2DMatrix search = new Search2DMatrix();
	Scanner s = new Scanner(System.in);
	search.N = s.nextInt();
	search.M = s.nextInt();
	int[][] mat = new int[search.N][search.M];
	for (int i = 0;i<search.N;i++){
		for (int j = 0;j<search.M;j++){
			mat[i][j] = s.nextInt();
		}
	}
	
	int target = s.nextInt();
	
	System.out.println(search.searchMatrix(mat, target));
	
	
	}
}

/*
Test input:

3 4
1 4 7 11
2 5 8 19
3 6 9 22


5 5
1 4 7 11 15
2 5 8 12 19
3 6 9 16 22
10 13 14 17 24
18 21 23 26 30
5
 * */
