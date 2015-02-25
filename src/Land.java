import java.util.*;


public class Land {
	
	int land[][];
	/*
	 * Function that receives input from 
	 * user: land size, no of trees, 
	 * coordinates for trees
	 * */
	public void input(){
		System.out.println("Enter the size of land matrix");
		Scanner sn = new Scanner(System.in);
		int N = sn.nextInt();
		land = new int[N][N];
		System.out.println("Enter number of trees");
		int treeCount = sn.nextInt();
		int[][] trees = new int[treeCount][2];
		System.out.println("Enter coordinates for trees");
		for(int i=0;i<treeCount;i++){
			trees[i][0]=sn.nextInt();
			trees[i][1]=sn.nextInt();
			land[trees[i][0]][trees[i][1]] = 1;			//Assigning 1 to cells inside land where tree exists
		}
	}
	
	
	public boolean checkForTree(int x1, int y1, int x2, int y2){
		for(int i = 0;i<x2;i++){
			for(int j=0;j<y2;j++){
				if(land[x1+i][y1+j] == 1){return true;}
			}
		}
		return false;
	}
}
