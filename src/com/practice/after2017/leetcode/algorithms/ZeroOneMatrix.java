package com.practice.after2017.leetcode.algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZeroOneMatrix {
	public static int[][] updateMatrix(int[][] matrix) {
		int[][] result = new int[matrix.length][matrix[0].length];
		
		for(int i = 0; i<matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++){
				if(matrix[i][j] != 0) {
					int dist = findDistance(matrix, i, j);
					result[i][j] = dist;
				}
			}
		}
		
		return result;
	}
	
	private static  int findDistance(int[][] matrix, int i, int j) {
		int minDist = Integer.MAX_VALUE;
		int dist = 0;
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[]{i, j});
		while(!q.isEmpty()) {
			int[] cell = q.poll();
			if(matrix[i][j] != 0) dist++;
			List<int[]> neighbours = getNeighbours(matrix, cell[0], cell[1]);
			for(int[] each : neighbours) {
				if(matrix[each[0]][each[1]] != 0) {
					dist++;
					q.add(each);
				} else {
					minDist = Math.min(minDist, dist);
					dist = 0;
					break;
				}
			}
//			if(matrix[cell[0]][cell[1]] != 0) {
//				dist++;
//				q.addAll(getNeighbours(matrix, cell[0], cell[1]));
//			} else {
//				minDist = Math.min(minDist, dist);
//				dist = 0;
//			}
			
		}
		return minDist;
	}
	
	private static List<int[]> getNeighbours(int[][] matrix, int i, int j) {
		List<int[]> neigh = new ArrayList<>();
		if(i > 0) {
			neigh.add(new int[]{i-1, j});
		}
		if(j < matrix[0].length-1) {
			neigh.add(new int[]{i, j+1});
		}
		if(i < matrix[0].length-1) {
			neigh.add(new int[]{i+1, j});
		}
		if(j > 0) {
			neigh.add(new int[]{i, j-1});
		}
		return neigh;
	}
	
	public static void main(String[] args) {
		int[][] matrix = new int[][]{{0,0,0},{0,1,0},{1,1,1}};
		int[][] mat = updateMatrix(matrix);
		for(int[] ar : mat) { 
			for(Integer each : ar) {
				System.out.print(each + " ");
			}
			System.out.println();
		}
	}
}
