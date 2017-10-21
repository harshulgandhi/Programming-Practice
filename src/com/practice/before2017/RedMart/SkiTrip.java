package com.practice.before2017.RedMart;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SkiTrip {
	Path p = new Path();
	List<Path> allPaths = new ArrayList<>();
	
	public void traverseMap(int[][] map, int x, int y){
		int N = map.length;
		int M = map[0].length;
		
		//up
		if(x-1>0 && map[x][y] > map[x-1][y]){
			p.path.add(map[x-1][y]);
			traverseMap(map, x-1, y);
//			p.checkLenghtAndDrop();
//			p.printPath();
			Path copy = new Path();
			copy.start = p.start;
			copy.path = p.makeCopyOfPath();
			allPaths.add(copy);
			p.path.clear();
		}
		
		//right
		if(y+1<M && map[x][y] > map[x][y+1]){
			p.path.add(map[x][y+1]);
			traverseMap(map, x, y+1);
//			p.checkLenghtAndDrop();
//			p.printPath();
			Path copy = new Path();
			copy.start = p.start;
			copy.path = p.makeCopyOfPath();
			allPaths.add(copy);
			p.path.clear();
		}

		//down
		if(x+1<N && map[x][y] > map[x+1][y]){
			p.path.add(map[x+1][y]);
			traverseMap(map, x+1, y);
//			p.checkLenghtAndDrop();
//			p.printPath();
			Path copy = new Path();
			copy.start = p.start;
			copy.path = p.makeCopyOfPath();
			allPaths.add(copy);
			p.path.clear();
		}
		
		//left
		if(y-1>0 && map[x][y] > map[x][y-1]){
			p.path.add(map[x][y-1]);
			traverseMap(map, x, y-1);
//			p.checkLenghtAndDrop();
//			p.printPath();
			Path copy = new Path();
			copy.start = p.start;
			copy.path = p.makeCopyOfPath();
			allPaths.add(copy);
			p.path.clear();
		}
		
			
	}
	
	public void printAllPaths(){
		for(Path eachPath : allPaths){
			eachPath.printPath();
		}
	}
	
	public void checkAllPathForBest(){
		System.out.println("Checking all paths");
		int longest = -1;
		int deepest = -1;

		for(Path eachPath : allPaths){
			if(eachPath.path.size() != 0){
				if(eachPath.path.size() > longest){
					longest = eachPath.path.size();
					deepest = eachPath.start - eachPath.path.get(eachPath.path.size()-1); 
				}
				else if (eachPath.path.size() == longest){
					int drop = eachPath.start - eachPath.path.get(eachPath.path.size()-1);
					if(drop > deepest){
						deepest = drop;
					}
				}
			}
		}
		System.out.println("RESULT : \nLength = "+(longest+1)+"\nDrop = "+deepest);
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		SkiTrip ski = new SkiTrip();
		int N = s.nextInt();
		int M = s.nextInt();
		int[][] map = new int[N][M];
		
		for(int i = 0;i<N;i++){
			for(int j = 0;j<M;j++){
				map[i][j] = s.nextInt();
			}
		}
		
		for(int i = 0;i<N;i++){
			for(int j = 0;j<M;j++){
				ski.p.start= map[i][j];
				ski.traverseMap(map, i, j);
			}
		}
		
//		ski.checkAllPathForBest();
//		ski.printAllPaths();
		
//		System.out.println("RESULT : \nLength = "+(ski.p.largestLength+1)+"\nDrop = "+ski.p.deepestDrop);
	}
	
	
	public class Path implements Cloneable{
		List<Integer> path = new ArrayList<>();
		
		int start;
		int largestLength = -1;
		int deepestDrop = -1;
		
		public List<Integer> makeCopyOfPath(){
			List<Integer> pathCopy = new ArrayList<>();
			for (Integer eachStep : path){
				pathCopy.add(eachStep);
			}
			return pathCopy;
		}
		
		public void printPath(){
			System.out.print(start+"-");
			for(Integer each:path){
				System.out.print(each+"-");
			}
			System.out.println();
		}
		
		public void checkLenghtAndDrop(){
			if(path != null){
				if(path.size() > largestLength){
					largestLength = path.size(); 	
					deepestDrop = start - path.get(path.size()-1);
				}
				else if(path.size() == largestLength){
					int drop = start - path.get(path.size()-1);
					if(drop > deepestDrop){
						largestLength = path.size();
						deepestDrop = drop;
					}
				}
				
			}
		}
		
		public Object clone(){  
		    try{  
		        return super.clone();  
		    }catch(Exception e){ 
		        return null; 
		    }
		}
	}
}
