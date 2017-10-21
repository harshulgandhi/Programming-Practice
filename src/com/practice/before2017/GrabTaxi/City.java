package com.practice.before2017.GrabTaxi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class City {
	
	private int capital;
	private Set<Integer>[] adjacencyMatrix = null;
	
	public int[] solution(int[] t) {
		int m = t.length;
		int[] level = new int[m-1];
		boolean[] visited = new boolean[m];
		
		constructAdjacencyMatrix(t);
		
		Queue<Integer> toVisit = new LinkedList<Integer>();
		toVisit.add(capital);
		int currentLevel = 0;
		
		//Traversing in BFS style to all cities
		while (!toVisit.isEmpty()) {
			List<Integer> nextLevel = new ArrayList<>();
			while(!toVisit.isEmpty()) {
				Integer node = toVisit.poll();
				if (!visited[node]) {
					visited[node] = true;
					if (currentLevel != 0) {
						level[currentLevel-1]++;
					}
					nextLevel.addAll(getNeighbours(node));
				}
			}
			currentLevel++;
			toVisit.addAll(nextLevel);
		}
		return level;
	}

	private Set<Integer> getNeighbours(int node) {
		return adjacencyMatrix[node];
	}
	
	private void constructAdjacencyMatrix(int[] tree) {
		int m = tree.length;
		adjacencyMatrix = new Set[m];
		
		for(int node=0; node<m; node++) {
			int neighbour = tree[node];
			if (node != neighbour) {
				addEdge(node, neighbour);
			} else {
				capital = node;
			}
		}
	}

	private void addEdge(int node, int neighbour) {
		if (adjacencyMatrix[node] == null) {
			adjacencyMatrix[node] = new HashSet<Integer>();
		}
		if (adjacencyMatrix[neighbour] == null) {
			adjacencyMatrix[neighbour] = new HashSet<Integer>();
		}
		adjacencyMatrix[node].add(neighbour);
		adjacencyMatrix[neighbour].add(node);
	}
	
	public static void main(String[] args) {
		City city = new City();
//		int[] t = new int[] {9,1,4,9,0,4,8,9,0,1};
//		int[] t = new int[] {1,2,3,4,5,5};
		int[] t = new int[] {9,1,4,2,5,7,3,8,6,0};
		int[] output = city.solution(t);
		System.out.println(output);
	}
	
}
