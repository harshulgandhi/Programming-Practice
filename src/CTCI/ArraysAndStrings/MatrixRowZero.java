package CTCI.ArraysAndStrings;
import java.util.Scanner;

public class MatrixRowZero{

	private boolean[] rowZero;
	private boolean[] colZero;

	MatrixRowZero(int R, int C){
		rowZero = new boolean[R];
		colZero = new boolean[C];
	}

	private int[][] changeRowToZero(int[][] matrix, int idx){
		for(int i = 0;i<matrix.length;i++){
			matrix[idx][i] = 0;
		}
		return matrix;
	}	

	private int[][] changeColumnToZero(int[][] matrix, int idx){
		for(int i = 0;i<matrix[0].length;i++){
			matrix[i][idx] = 0;
		}
		return matrix;
	}	

	private void checkMatrix(int[][] matrix){
		for(int i = 0;i<matrix.length;i++){
			for(int j = 0;j<matrix[0].length;j++){
				if(matrix[i][j] == 0){
					rowZero[i] = true;
					colZero[j] = true;
				}
			}
		}
	}

	private void transformMatrix(int[][] matrix, int C, int R){
		for(int i=0;i<R;i++){
			if(rowZero[i]) matrix = changeRowToZero(matrix, i);
		}
		for(int i=0;i<C;i++){
			if(colZero[i]) matrix = changeColumnToZero(matrix, i);
		}
	}

	private void printMatrix(int[][] matrix){
		for(int[] eachRow : matrix){
			for(int eachVal : eachRow){
				System.out.print(eachVal + " ");
			}
			System.out.println();
		}
	}


	public static void main(String[] args){

		Scanner s = new Scanner(System.in);
		int C = s.nextInt();
		int R = s.nextInt();
		MatrixRowZero obj = new MatrixRowZero(R, C);
		int[][] matrix = new int[R][C];
		for(int i = 0;i<R;i++){
			for(int j = 0;j<C;j++){
				matrix[i][j] = s.nextInt();
			}
		}

		obj.checkMatrix(matrix);
		obj.transformMatrix(matrix, R, C);
		obj.printMatrix(matrix);

	}
}