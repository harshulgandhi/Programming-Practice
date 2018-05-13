package com.practice.after2017.leetcode.algorithms.dp;

/**
 * https://leetcode.com/problems/minimum-path-sum/description/
 * https://www.geeksforgeeks.org/dynamic-programming-set-6-min-cost-path/
 * */
public class MinimumPathSum {
	public static int minPathSum(int[][] grid) {
		int minCost = 0;
		int[][] cost = new int[grid.length][grid[0].length];
		
		for (int i = 0; i<grid.length; i++) {
			for(int j = 0; j < grid[0].length; j++) {
				if(i == 0 && j == 0) {
					cost[i][j] = grid[i][j];
					continue;
				}
				if(i == 0) {
					cost[0][j] = grid[0][j] + cost[0][j-1];
				} else if (j == 0) {
					cost[i][0] = grid[i][0] + cost[i-1][0];
				} else {
					cost[i][j] = Math.min(cost[i-1][j], cost[i][j-1]) + grid[i][j];
 				}
				
			}
		}
		return cost[grid.length-1][grid[0].length-1];
    }
	
	public static void main(String[] args) {
		int[][] grid = new int[][]{{1,3,1},{1,5,1},{4,2,1}};
		System.out.println(minPathSum(grid));
	}
}
