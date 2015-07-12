package Searching;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Scanner;
public class CellInGrid {
	class Node extends Point{
		int wand=0;
		Node(int x, int y){
			super(x,y);
		}
	}
	
	int R = 0;
	int C = 0;
	int[][] inpMat = null;
	Scanner sc = null;
	Node start = null;
	int largestReion = -1;
	ArrayList<Node> visited = new ArrayList<>();
	int count = 0;
	
	public void checkAdjacent(Node pnt){
		if(this.inpMat[(int) pnt.getX()][(int) pnt.getY()] == 1){
			this.count++;
		}
		if(this.count > this.largestReion) largestReion = this.count;
		
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
		
		
	}
}
