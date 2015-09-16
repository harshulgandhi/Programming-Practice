package RedMart;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestSkiing {

	private int m;
	private int n;
	private Node [][] elevationMatrix;
	
	private class Node {
		int value;
		List<Node> longestPaths = new ArrayList<>();
		int longestPathLength = -1;
		int longestPathDepth = -1;
		boolean visited = false;
	}
	
	public static void main(String[] args) {
		LongestSkiing obj = new LongestSkiing();
		Scanner s = new Scanner(System.in);
		
		obj.m = s.nextInt();
		obj.n = s.nextInt();
		
		obj.elevationMatrix = new Node[obj.m][obj.n];
		
		for (int i=0; i<obj.m; i++) {
			for (int j=0; j<obj.n; j++) {
				obj.elevationMatrix[i][j] = obj.new Node();
				obj.elevationMatrix[i][j].value = s.nextInt();
			}
		}
		s.close();
		obj.calculateLongestPath();
	}

	public void calculateLongestPath() {
		int maxPathLength = -1;
		int maxDepth = -1;
		int maxI = -1, maxJ = -1;
		
		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				skii(i,j);
				int length = elevationMatrix[i][j].longestPathLength;
				int depth = elevationMatrix[i][j].longestPathDepth;
				if (maxPathLength < length) {
					maxPathLength = length;
					maxDepth = depth;
					maxI = i;
					maxJ = j;
				} else if (maxPathLength == length) {
					if (maxDepth < depth) {
						maxDepth = depth;
						maxI = i;
						maxJ = j;
					}
				}
			}
		}
		System.out.println("Max Length = " + maxPathLength + " | Max Depth = " + maxDepth);
		
	}
	
	private void skii(int i, int j) {
		if (elevationMatrix[i][j].visited) {
			return;
		}
		
		List<Node> paths = new ArrayList<>();
		int maxDist = -1;
		elevationMatrix[i][j].visited = true;
		
		//up
		if ((i>0) && (elevationMatrix[i][j].value > elevationMatrix[i-1][j].value) ) {
			skii(i-1, j);
			paths.add(elevationMatrix[i-1][j]);
			if (elevationMatrix[i-1][j].longestPathLength > maxDist) {
				maxDist = elevationMatrix[i-1][j].longestPathLength;
			}
		}
		
		//down
		if ((i<m-1) && (elevationMatrix[i][j].value > elevationMatrix[i+1][j].value) ) {
			skii(i+1, j);
			paths.add(elevationMatrix[i+1][j]);
			if (elevationMatrix[i+1][j].longestPathLength > maxDist) {
				maxDist = elevationMatrix[i+1][j].longestPathLength;
			}
		}
		
		//left
		if ((j>0) && (elevationMatrix[i][j].value >elevationMatrix[i][j-1].value) ) {
			skii(i, j-1);
			paths.add(elevationMatrix[i][j-1]);
			if (elevationMatrix[i][j-1].longestPathLength > maxDist) {
				maxDist = elevationMatrix[i][j-1].longestPathLength;
			}
		}
		
		//right
		if ((j<n-1) && (elevationMatrix[i][j].value > elevationMatrix[i][j+1].value) ) {
			skii(i, j+1);
			paths.add(elevationMatrix[i][j+1]);
			if (elevationMatrix[i][j+1].longestPathLength > maxDist) {
				maxDist = elevationMatrix[i][j+1].longestPathLength;
			}
		}
		
		if (maxDist == -1) {
			elevationMatrix[i][j].longestPathLength = 1;
			elevationMatrix[i][j].longestPathDepth = 0;
			elevationMatrix[i][j].longestPaths = null;
		} else {
			for (Node path : paths) {
				if (path.longestPathLength == maxDist) {
					elevationMatrix[i][j].longestPathLength = path.longestPathLength + 1;
					elevationMatrix[i][j].longestPaths.add(path);
				}
			}
			Node deepestPath = elevationMatrix[i][j].longestPaths.get(0);
			
			
			for (Node path : elevationMatrix[i][j].longestPaths) {
				int deepestLength = elevationMatrix[i][j].value - deepestPath.value + deepestPath.longestPathDepth;
				int pathLength = elevationMatrix[i][j].value - path.value + path.longestPathDepth;
				if (pathLength > deepestLength) {
					deepestPath = path;
				}
			}
			elevationMatrix[i][j].longestPathDepth = elevationMatrix[i][j].value - deepestPath.value + deepestPath.longestPathDepth;
		}
	}

}