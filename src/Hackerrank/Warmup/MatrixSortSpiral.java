package Hackerrank.Warmup;
import java.util.*;
public class MatrixSortSpiral {
	int mat[][];
	int R, C;
	public void input(){
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the number of rows for matrix: ");
		R = sn.nextInt();
		System.out.println("Enter the number of columns for matrix: ");
		C = sn.nextInt();
		mat=new int[R][C];
		System.out.println("Enter numbers for the 2D array");
		for (int i=0;i<R;i++){
			for(int j = 0;j<C;j++){
				mat[i][j] = sn.nextInt();
			}
		}
		
		/*System.out.println("Matrix that you entered is : ");
		for (int i=0;i<R;i++){
			for(int j = 0;j<C;j++){
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}*/
	}
	
	public void MatrixToArraySort(){
		int arr[] = new int[R*C];
		int p = 0;
		for(int i = 0;i<R;i++){
			for(int j = 0;j<C;j++){
				arr[p] = mat[i][j];
				p++;
			}
			//p++;
		}
		
		Arrays.sort(arr);
		/*for (int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}*/
		System.out.println();
		getSpiral(arr,R,C);	
	}
	
	public void getSpiral(int arr[],int m, int n){
		int matSpiral[][] = new int[m][n];
		int i, k = 0, l = 0,index = 0;
		while (k < m && l < n){
	        /* First row from the remaining rows */
	        for (i = l; i < n; ++i){
	            matSpiral[k][i] = arr[index];
	            index++;
	        }
	        k++;
	        /* Last column from the remaining columns */
	        for (i = k; i < m; ++i){
	            matSpiral[i][n-1] = arr[index];
	            index++;
	        }
	        n--;
	 
	        /* Last row from the remaining rows */
	        if ( k < m){
	            for (i = n-1; i >= l; --i){	
		            matSpiral[m-1][i] = arr[index];
		            index++;
	            }
	            m--;
	        }
	 
	        /* First column from the remaining columns */
	        if (l < n){
	            for (i = m-1; i >= k; --i){
		            matSpiral[i][l] = arr[index];
		            index++;
	            }
	            l++;    
	        }        
	    }
		
		System.out.println("\nSorted spiral matrix Spiral matrix : ");
		for (int p=0;p<R;p++){
			for(int j = 0;j<C;j++){
				System.out.print(matSpiral[p][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		MatrixSortSpiral msp_obj = new MatrixSortSpiral();
		msp_obj.input();
		msp_obj.MatrixToArraySort();
	}
}
