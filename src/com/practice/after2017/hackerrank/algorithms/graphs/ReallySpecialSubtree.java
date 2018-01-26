package com.practice.after2017.hackerrank.algorithms.graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ReallySpecialSubtree {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int nodes = s.nextInt();
		int noOfEdges = s.nextInt();
		List<Edge> edges = new ArrayList<>();
		for(int i = 0; i < noOfEdges; i++) {
			edges.add(new Edge(s.nextInt(), s.nextInt(), s.nextInt()));
		}
		
		Collections.sort(edges, new Comparator<Edge>(){
			@Override
			public int compare(Edge o1, Edge o2) {
				if(o1.weight != o2.weight) return Integer.compare(o1.weight, o2.weight);
				else return Integer.compare(o1.node1+o1.node2+o1.weight, o2.node1+o2.node2+o2.weight);
			}
		});
		
		List<Edge> resultGraph = new ArrayList<>();
		List<Integer> addedNodes = new ArrayList<>();
		for(Edge eachEdge : edges) {
			if(!(addedNodes.contains(eachEdge.node1)
					&& addedNodes.contains(eachEdge.node2))) {
				resultGraph.add(eachEdge);
				addedNodes.add(eachEdge.node1);
				addedNodes.add(eachEdge.node2);
			}
		}
		int sum = 0;
		for(Edge each: resultGraph) {
			sum += each.weight;
		}
		System.out.println(sum);
	}
}

class Edge {
	int node1;
	int node2;
	int weight;
	
	public Edge (int node1, int node2, int weight) {
		this.node1 = node1;
		this.node2 = node2;
		this.weight = weight;
	}
}


/*
4 6
1 2 5
1 3 3
4 1 6
2 4 7
3 2 4
3 4 5

5 7
1 2 5
1 3 3
4 1 6
2 4 7
3 2 4
3 4 5
4 5 3
*/
 