package com.practice.after2017.algorithm.searching;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DepthFirstTraversal {
	int graphSize;
	LinkedList<Integer>[] adj;
	
	
	public DepthFirstTraversal(int n) {
		this.graphSize = n;
		adj = new LinkedList[n];
		for(int i = 0; i<n; i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	public void addEdge(int from, int to) {
		adj[from].add(to);
	}
	
	private void dfsHelper(int start, boolean[] visited) {
		visited[start] = true;
		System.out.println(start);
		List<Integer> neig = adj[start];
		for(Integer each : neig) {
			if(!visited[each]) {
				dfsHelper(each, visited);
			}
		}
		
	}
	
	public void dfs(int start) {
		boolean visited[] = new boolean[graphSize];
		dfsHelper(start, visited);
	}
	
	public static void main(String[] args) {
		DepthFirstTraversal dfs = new DepthFirstTraversal(6);
		dfs.addEdge(0, 1);
		dfs.addEdge(0, 2);
		dfs.addEdge(1, 2);
		dfs.addEdge(1, 3);
		dfs.addEdge(1, 4);
		dfs.addEdge(2, 4);
		dfs.addEdge(3, 4);
		dfs.addEdge(3, 5);
		dfs.addEdge(4, 5);
		dfs.dfs(0);
	}
}
