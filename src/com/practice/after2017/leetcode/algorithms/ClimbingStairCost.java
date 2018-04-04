package com.practice.after2017.leetcode.algorithms;

public class ClimbingStairCost {
	public int minCostClimbingStairs(int[] cost) {
		int[] minCost = new int[cost.length + 1];
		minCost[0] = 0;
		minCost[1] = cost[0];
		for (int i = 2; i < minCost.length; i++) {
			int currMinCost = Math.min(minCost[i - 1] + cost[i - 1], minCost[i - 2] + cost[i - 2]);
			minCost[i] = currMinCost;
		}
		int minCost1 = minCost[minCost.length - 1];
		minCost = new int[cost.length + 1];

		minCost[1] = 0;
		minCost[2] = cost[1];
		for (int i = 3; i < minCost.length; i++) {
			int currMinCost = Math.min(minCost[i - 1] + cost[i - 1], minCost[i - 2] + cost[i - 2]);
			minCost[i] = currMinCost;
		}
		int minCost2 = minCost[minCost.length - 1];
		return Math.min(minCost1, minCost2);
	}

	public static void main(String[] args) {
		ClimbingStairCost csc = new ClimbingStairCost();
		System.out.println(csc.minCostClimbingStairs(new int[] { 100, 1, 1, 1, 100, 1, 1, 100, 1 }));

		// 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 }));

		// 10, 15, 20 }));
	}
}
