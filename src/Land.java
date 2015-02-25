import java.util.*;


public class Land {
	public void input(){
		System.out.println("Enter the size of land matrix");
		Scanner sn = new Scanner(System.in);
		int N = sn.nextInt();
		int land[][] = new int[N][N];
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
}
