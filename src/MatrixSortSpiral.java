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
		
		System.out.println("Matrix that you entered is : ");
		for (int i=0;i<R;i++){
			for(int j = 0;j<C;j++){
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
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
		for (int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
