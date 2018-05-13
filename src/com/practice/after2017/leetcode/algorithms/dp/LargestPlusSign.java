package com.practice.after2017.leetcode.algorithms.dp;

public class LargestPlusSign {
	public int orderOfLargestPlusSign(int N, int[][] mines) {
		int[][] grid = new int[N][N];
		updateMines(grid, mines);

		int maxPlusSize = Integer.MIN_VALUE;
		int plusSize = 0;
		int incrementFactor = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 1) {
					plusSize++;
					while (isLayerValid(grid, i, j, ++incrementFactor)) {
						plusSize++;
					}
				}
				maxPlusSize = plusSize > maxPlusSize ? plusSize : maxPlusSize;
				plusSize = 0;
				incrementFactor = 0;
			}

		}
		return maxPlusSize;
	}

	private boolean isMine(int[][] mines, int r, int c) {
		for (int i = 0; i < mines.length && mines[0].length > 0; i++) {
			if (mines[i][0] == r && mines[i][1] == c) {
				return true;
			}
		}
		return false;
	}

	private void updateMines(int[][] grid, int[][] mines) {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				grid[i][j] = isMine(mines, i, j) ? 0 : 1;
			}
		}
	}

	private boolean isLayerValid(int[][] grid, int r, int c, int layer) {
		int[] dirR = new int[] { 0, 1, 0, -1 };
		int[] dirC = new int[] { 1, 0, -1, 0 };
		boolean isValid = true;
		for (int i = 0; i < 4; i++) {
			int R = r + dirR[i] * layer;
			int C = c + dirC[i] * layer;
			if (R < 0 || R >= grid.length || C < 0 || C >= grid[0].length || grid[R][C] == 0) {
				return false;
			}
		}
		return isValid;
	}

	public static void main(String[] args) {
		LargestPlusSign lps = new LargestPlusSign();
		System.out.println(lps.orderOfLargestPlusSign(500,
				new int[][] { new int[] { 4, 5 }, new int[] { 56, 122 }, new int[] { 250, 250 } }));
	}
}
