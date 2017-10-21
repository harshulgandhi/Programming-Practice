package com.practice.before2017.Hackerrank.Searching;
import java.awt.Point;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CountLuck {
	
	class Node extends Point{
		int wand=0;
		Node(int x, int y){
			super(x,y);
		}
	}
	
	ArrayList<Node> visited = new ArrayList();
	ArrayList<Node> path = new ArrayList();
	char[][] inpMat=null;
	int N = 0;
	int M = 0;
	Node startPoint = null;
	int wandWaved = 0;
	boolean flag = false;
	HashMap<Node,Integer> map = new HashMap<>();
	
	
	public  void printMat(char[][] mat, int N, int M){
		
		for(char[] carr: mat){
			for (char c : carr){
				System.out.print(c);
			}
			System.out.println();
		}
	}
	
	public void dfsFindPath(Node node){
//		System.out.println("Curr node - i : "+(int)node.getX()+" j : "+(int)node.getY());
		this.visited.add((Node) node);
		int i = (int) node.getX();
		int j = (int) node.getY();
		if(i == this.N-1 && j == this.M-1) return;
		if(this.inpMat[i][j] == '*') {
			this.flag = true;
			return;
		}
		
		int count = 0;
		
		//right
		if(j+1 < this.M && (this.inpMat[i][j+1] != 'X') && !this.visited.contains(new Point(i,j+1))){
			dfsFindPath(this.new Node(i,j+1));
			if(this.flag) {
				this.path.add(this.new Node(i,j+1));
			}
			count++;
		}
		
		//down
		if(i+1 < this.N && (this.inpMat[i+1][j] != 'X') && !this.visited.contains(new Point(i+1,j))){
			dfsFindPath(this.new Node(i+1,j));
			if(this.flag) this.path.add(this.new Node(i+1,j));
			count++;
		}
		
		//left
		if(j-1 >= 0 && (this.inpMat[i][j-1] != 'X') && !this.visited.contains(new Point(i,j-1))){
			dfsFindPath(this.new Node(i,j-1));
			if(this.flag) this.path.add(this.new Node(i,j-1));
			count++;
		}
		
		//up
		if(i-1 >= 0 && (this.inpMat[i-1][j] != 'X') && !this.visited.contains(new Point(i-1,j))){
			dfsFindPath(this.new Node(i-1,j));
			if(this.flag) this.path.add(this.new Node(i-1,j));
			count++;
		}
		if(count > 1 ) {
//			System.out.println("WAND WAVED");
			this.wandWaved++;
			if(this.flag){
				node.wand = 1;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int T = s.nextInt();
		
		while(T-->0){
			CountLuck obj = new CountLuck();
			obj.N = s.nextInt();
			obj.M = s.nextInt();
			obj.inpMat = new char[obj.N][obj.M];
			for (int i = 0;i<obj.N;i++){
				obj.inpMat[i] = s.next().toCharArray();
				if(new String(obj.inpMat[i]).contains("M")){
					obj.startPoint = obj.new Node(i,new String(obj.inpMat[i]).indexOf('M'));
				}
			}
			
			obj.dfsFindPath(obj.startPoint);
			int out = 0;
			System.out.println("Correct path : \n"+obj.path);
			for (Node n:obj.path){
				out += n.wand;
			}
			System.out.println("output : "+out);
			System.out.println("\nT : "+T+" obj.wandWaved : "+obj.wandWaved);
			if(obj.wandWaved == s.nextInt()) System.out.println("Impressed");
			else System.out.println("Oops!");
		}
	}
}

/*
 * 
1
4 11
.X.X......X
.X*.X.XXX.X
..X.X.XM...
......XXXX.
T : 0 obj.wandWaved : 4
3
Oops!*/
