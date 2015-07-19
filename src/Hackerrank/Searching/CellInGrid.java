package Hackerrank.Searching;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Scanner;
public class CellInGrid {
	class Node extends Point{
		Node(int x, int y){
			super(x,y);
		}
	}
	
	int R = 0;
	int C = 0;
	int[][] inpMat = null;
	Scanner sc = null;
	Node start = null;
	ArrayList<Node> visited = new ArrayList<>();
	int count = 1;
	int largestRegion = -1;
	
	public void checkAdjacent(Node pnt){
		if(this.inpMat[(int) pnt.getX()][(int) pnt.getY()] == 1){
			this.count++;
		}
		if(this.count > this.largestRegion) largestRegion = this.count;
		
	}
	
	public void dfsRegion(Node node){
		this.visited.add(node);
		int i  = (int)node.getX();
		int j = (int)node.getY();
//		if(this.inpMat[i][j] == 1){
			if((i+1 < R) && this.inpMat[i+1][j] == 1 && !(this.visited.contains(new Node(i+1,j)))){
				dfsRegion(new Node(i+1,j));
				count++;
			}
			
			if((i+1 < R && j-1 >= 0 ) && this.inpMat[i+1][j-1] == 1 && !(this.visited.contains(new Node(i+1,j-1)))){
				dfsRegion(new Node(i+1,j-1));
				count++;
			}
			
			if((i+1 < R && j+1 < C ) && this.inpMat[i+1][j+1] == 1 && !(this.visited.contains(new Node(i+1,j+1)))){
				dfsRegion(new Node(i+1,j+1));
				count++;
			}
			
			if((j+1 < C ) && this.inpMat[i][j+1] == 1 && !(this.visited.contains(new Node(i,j+1)))){
				dfsRegion(new Node(i,j+1));
				count++;
			}
			
			if((j-1 >=0 ) && this.inpMat[i][j-1] == 1 && !(this.visited.contains(new Node(i,j-1)))){
				dfsRegion(new Node(i,j-1));
				count++;
			}
			
			if((i-1 >=0 ) && this.inpMat[i-1][j] == 1 && !(this.visited.contains(new Node(i-1,j)))){
				dfsRegion(new Node(i-1,j));
				count++;
			}
			
			if((i-1 >=0  && j-1 >=0 ) && this.inpMat[i-1][j-1] == 1 && !(this.visited.contains(new Node(i-1,j-1)))){
				dfsRegion(new Node(i-1,j-1));
				count++;
			}
			
			if((i-1 >=0  && j+1 <C ) && this.inpMat[i-1][j+1] == 1 && !(this.visited.contains(new Node(i-1,j+1)))){
				dfsRegion(new Node(i-1,j+1));
				count++;
			}
//		}
		return;
	
	}
	public static void main(String[] args) {
		CellInGrid obj = new CellInGrid();
		obj.sc = new Scanner(System.in);
		obj.R = obj.sc.nextInt();
		obj.C = obj.sc.nextInt();
		obj.inpMat = new int[obj.R][obj.C];
		for (int i = 0;i<obj.R;i++){
			for(int j =0;j<obj.C;j++){
				obj.inpMat[i][j] = obj.sc.nextInt();
			}
		}
		
		obj.start = obj.new Node(0,0);
		
		for (int i = 0;i<obj.R;i++){
			for(int j =0;j<obj.C;j++){
				if(obj.inpMat[i][j] == 1){
				obj.dfsRegion(obj.new Node(i,j));
//				System.out.println("count returned is "+obj.count);
				if(obj.count>obj.largestRegion){
					obj.largestRegion = obj.count;
					obj.count = 0;
				}
				}
			}
		}
		System.out.println(obj.largestRegion);
	}
}
 