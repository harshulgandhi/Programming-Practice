package com.practice.before2017.Hackerrank.Implementation;
import java.util.Scanner;

import javax.swing.JTable.PrintMode;

public class GridSearch {
	
	public static void printMat(char[][] mat){
		for(char[] numRow: mat){
			for (char num : numRow){
				System.out.print(num);
			}
			System.out.println();
		}
	}

	
	public static boolean comparePatternMatchFound(char[][] Grid, char[][] Pattern, int r, int c,int ig, int jg){
		for(int i = 0;i<r;i++){
			for(int j = 0;j<c;j++){
				if(Grid[i+ig][j+jg] != Pattern[i][j]){
					return false;
				}
			}
		}
		return true;
	}
	
	public static void checkPatternInGrid(char[][] Grid, int R, int C, char[][] Pattern, int r, int c){
		for(int i = 0;R-i>=r;i++){
			for(int j = 0;C-j>=c;j++){
//				System.out.println("Grid["+i+"]["+j+"] : "+Grid[i][j] +" | Pattern[0][0] : "+Pattern[0][0]);
				if(Grid[i][j] == Pattern[0][0]){
					if(comparePatternMatchFound(Grid, Pattern, r, c, i,j)){
						System.out.println("YES");
						return;
					}
				}
			}
		}
		System.out.println("NO");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
			int R = sc.nextInt();
			int C = sc.nextInt();
			char[][] Grid = new char[R][C];
			for(int i = 0;i<R;i++){
				Grid[i]=sc.next().toCharArray();
			}
			
			int r = sc.nextInt();
			int c = sc.nextInt();
			char[][] Pattern = new char[r][c];
			for(int i = 0;i<r;i++){
				Pattern[i]=sc.next().toCharArray();
			}
			
//			printMat(Grid);
//			printMat(Pattern);
			checkPatternInGrid(Grid, R, C, Pattern, r, c);
		}
	}
}
