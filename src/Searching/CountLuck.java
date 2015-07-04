package Searching;
import java.awt.Point;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Scanner;

public class CountLuck {
	
	ArrayList<Point> visited = new ArrayList();
	char[][] inpMat=null;
	int N = 0;
	int M = 0;
	Point startPoint = null;
	
	public  void printMat(char[][] mat, int N, int M){
		
		for(char[] carr: mat){
			for (char c : carr){
				System.out.print(c);
			}
			System.out.println();
		}
	}
	
	public void dfsFindPath(Point node){
		System.out.println("Curr node - i : "+(int)node.getX()+" j : "+(int)node.getY());
		this.visited.add(node);
		int i = (int) node.getX();
		int j = (int) node.getY();
		if(i == this.N-1 && j == this.M-1) return;
		if(this.inpMat[i][j] == '*'){
			System.out.println("FOUND");
			return;
		}
		
		//up
		if(i-1 >= 0 && (this.inpMat[i-1][j] != 'X') && !this.visited.contains(new Point(i-1,j))){
			dfsFindPath(new Point(i-1,j));
		}
		
		//right
		else if(j+1 < this.M && (this.inpMat[i][j+1] != 'X') && !this.visited.contains(new Point(i,j+1))){
			dfsFindPath(new Point(i,j+1));
		}
		
		//down
		else if(i+1 < this.N && (this.inpMat[i+1][j] != 'X') && !this.visited.contains(new Point(i+1,j))){
			dfsFindPath(new Point(i+1,j));
			System.out.println("After down point i :"+i+" j:"+j);
		}
		
		//left
		else if(j-1 >= 0 && (this.inpMat[i][j-1] != 'X') && !this.visited.contains(new Point(i,j-1))){
			dfsFindPath(new Point(i,j-1));
		}
		System.out.println(this.visited);
	}
	
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		CountLuck obj = new CountLuck();
		int T = s.nextInt();
		
		while(T-->0){
			obj.N = s.nextInt();
			obj.M = s.nextInt();
//			String[] inpRows = new String[N];
			obj.inpMat = new char[obj.N][obj.M];
			for (int i = 0;i<obj.N;i++){
//				inpRows[i] = s.next();
				obj.inpMat[i] = s.next().toCharArray();
				if(new String(obj.inpMat[i]).contains("M")){
					obj.startPoint = new Point(i,new String(obj.inpMat[i]).indexOf('M'));
				}
			}
			obj.printMat(obj.inpMat, obj.N, obj.M);
			
			obj.dfsFindPath(obj.startPoint);
		}
		
		
		
	}
	
	
	
}
