package com.practice.after2017.algorithm.searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class UniformGraphPathFinding {
	private Node[] graph;
	public List<Node> shortestPath(Node start, Node end) {
		Map<Node, Node> parent = new HashMap<>();
		
		Queue<Node> q = new LinkedList<>();
		int[] distances = new int[graph.length];
		Arrays.fill(distances, Integer.MAX_VALUE);
		Set<Integer> visited = new HashSet<>();
		
		q.add(start);
	 	distances[start.value] = 0;
	 	parent.put(start, null);
		while(!q.isEmpty()) {
			Node curr = q.poll();
			if(curr.value == end.value) {
				break;
			}
			Set<Edge> neigh = curr.getNeigh();
			for(Edge eachEdge : neigh) {
				if(!visited.contains(eachEdge.n.value) 
						&& distances[eachEdge.n.value] > distances[curr.value] + eachEdge.weight) {
					distances[eachEdge.n.value] = distances[curr.value] + eachEdge.weight;
					parent.put(eachEdge.n, curr);
					q.add(eachEdge.n);
					visited.add(curr.value);
				}
			}
		}
		
		List<Node> path = new ArrayList<>();
		Node curr = parent.get(end);
		path.add(end);
		path.add(curr);
		while(parent.get(curr) != null) {
			curr = parent.get(curr);
			path.add(curr);
		}
		return path;
	}
	
	class Node {
		int value;
		Set<Edge> neighbours;
		
		Node(int value) {
			this.value = value;
		}
		
		public void addNeigh(Node n, int weight) {
			if(neighbours == null) {
				neighbours = new HashSet<>();
			}
			neighbours.add(new Edge(n, weight));
		}
		
		public Set<Edge> getNeigh() {
			return neighbours;
		}
	}
	
	class Edge {
		Node n;
		int weight;
		Edge(Node n, int weight) {
			this.n = n;
			this.weight = weight;
		}
	}
	
	public static void main(String[] args) {
		UniformGraphPathFinding gr = new UniformGraphPathFinding();
		Node A = gr.new Node(0);
		Node B = gr.new Node(1);
		Node C = gr.new Node(2);
		Node D = gr.new Node(3);
		Node E = gr.new Node(4);
		Node F = gr.new Node(5);
		Node G = gr.new Node(6);
		A.addNeigh(B, 2);
		A.addNeigh(C, 4);
		B.addNeigh(C, 1);
		B.addNeigh(D, 4);
		B.addNeigh(E, 20);
		C.addNeigh(E, 3);
		D.addNeigh(F, 6);
		D.addNeigh(E, 3);
		E.addNeigh(F, 2);
		
		gr.graph = new Node[]{A, B, C, D, E, F, G};
		
		List<Node> path = gr.shortestPath(D, F);
		for(Node each : path) {
			System.out.print(each.value+" <- ");
		}
		
	}
}

