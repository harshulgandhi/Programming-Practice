package com.practice.after2017.algorithm.searching;

public class NumberOfIslands {

	private boolean isSafe(int[][] M, int i, int j, boolean[][] visited) {
		int R = M.length;
		int C = M[0].length;
		return i >= 0 && i < R && j >= 0 && j < C && 
				!visited[i][j] && M[i][j] == 1;
	}
	private void dfs(int[][] M, int i, int j, boolean[][] visited) {
		visited[i][j] = true;
		int[][] adj = new int[][]{{-1, -1}, {-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}};
		for(int k = 0; k<8; k++) {
			int r = i + adj[k][0];
			int c = j + adj[k][1];
			if (isSafe(M, r, c, visited)) {
				dfs(M, r, c, visited);
			}
		}
	}
	
	public int countIslands(int[][] M) {
		int count = 0;
		int r = M.length;
		int c = M[0].length;
		boolean[][] visited = new boolean[r][c];
		
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				if(M[i][j] == 1 && !visited[i][j]) {
					dfs(M, i, j, visited);
					++count;
				}
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		int[][] M = new int[][]{
			{1, 1, 0, 0, 0},
            {0, 1, 0, 0, 1},
            {1, 0, 0, 1, 1},
            {0, 0, 0, 0, 0},
            {1, 0, 1, 0, 1}
           };
                
        NumberOfIslands is = new NumberOfIslands();
        System.out.println(is.countIslands(M));
	}
}
