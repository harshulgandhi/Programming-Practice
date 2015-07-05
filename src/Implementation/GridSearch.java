package Implementation;
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

	public static void checkPatternInGrid(char[][] Grid, int R, int C, char[][] Pattern, int r, int c){
		
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
			
			printMat(Grid);
			printMat(Pattern);
		}
	}
}
