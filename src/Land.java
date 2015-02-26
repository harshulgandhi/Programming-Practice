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
			land[trees[i][0]-1][trees[i][1]-1] = 1;			//Assigning 1 to cells inside land where tree exists
		}
		
		printInput(N);
		System.out.println(process(N));
	}
	
	
	public boolean checkForTree(int x1, int y1, int x2, int y2){
		for(int i = 0;i<x2;i++){
			for(int j=0;j<y2;j++){
				if(land[x1+i][y1+j] == 1){return true;}
			}
		}
		return false;
	}
	

	/*
	 * Traversing the land to find largest square without tree 
	 * */
	public int process(int N){
		for(int i = N-1;i>1;i--){
			System.out.println("i = "+i);
			int h=0,v=0;
			int x1=0,y1=0,x2=i,y2=i;
			while(x2+v<N){
				x1=x1+v;
				x2=x2+v;
				while(y2+h<N){
					System.out.println("Looking at square : "+x1+"-"+y1+"-"+x2+"-"+y2);
					if(!checkForTree(x1,y1+h,x2,y2+h)){
						System.out.println("Land without tree found, size is: ");
						return y2+h-y1;
					}
					h++;
				}
				v++;				
			}
		}
		
		return 0;
	}
	
	
	/*
	 * To check if input is correct*/
	public void printInput(int N){
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				System.out.print(land[i][j]+" ");
			}
			System.out.print("\n");
		}
		
	}
}
