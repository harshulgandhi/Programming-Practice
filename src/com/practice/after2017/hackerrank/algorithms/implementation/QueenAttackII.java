package com.practice.after2017.hackerrank.algorithms.implementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class QueenAttackII {
	
	public static int possibleAttackPoints(Tupple queen, Map<Integer, List<Integer>> obstacles, int N) { 
		int attackPoints = 0;
		int queenRow = queen.getRow();
		int queenCol = queen.getCol();
		
		// attack top (col constant) 
		for(int row = queenRow+1; row <= N; row++) {
			if(obstacles.get(row) != null 
					&& obstacles.get(row).contains(queenCol)) {
				break;
			}
			attackPoints++;
		}
		
		// attack bottom (col constant) 
		for(int row = queenRow-1; row >= 1; row--) {
			if(obstacles.get(row) != null 
					&& obstacles.get(row).contains(queenCol)) {
				break;
			}
			attackPoints++;
		}
		
		// attack left (row constant) 
		for(int col = queenCol-1; col >= 1; col--) {
			if(obstacles.get(queenRow) != null 
					&& obstacles.get(queenRow).contains(col)) {
				break;
			}
			attackPoints++;
		}
		
		// attack right (row constant) 
		for(int col = queenCol+1; col <= N; col++) {
			if(obstacles.get(queenRow) != null 
					&& obstacles.get(queenRow).contains(col)) {
				break;
			}
			attackPoints++;
		}
		
		// attack top left
		for(int row = queenRow+1, col = queenCol - 1
				; col >= 1 && row <= N
				; col--, row++) {
			if(obstacles.get(row) != null 
					&& obstacles.get(row).contains(col)) {
				break;
			}
			attackPoints++;
		}
		
		// attack top right
		for(int row = queenRow+1, col = queenCol + 1
				; col <= N && row <= N
				; col++, row++) {
			if(obstacles.get(row) != null 
					&& obstacles.get(row).contains(col)) {
				break;
			}
			attackPoints++;
		}
		
		// attack bottom right
		for(int row = queenRow-1, col = queenCol + 1
				; col <= N && row >= 1
				; col++, row--) {
			if(obstacles.get(row) != null 
					&& obstacles.get(row).contains(col)) {
				break;
			}
			attackPoints++;
		}
		
		// attack bottom left
		for(int row = queenRow-1, col = queenCol - 1
				; col >= 1 && row >= 1
				; col--, row--) {
			if(obstacles.get(row) != null 
					&& obstacles.get(row).contains(col)) {
				break;
			}
			attackPoints++;
		}
		
		return attackPoints;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int K = s.nextInt();
		Tupple queen = new Tupple(s.nextInt(), s.nextInt());
		Map<Integer, List<Integer>> obstacles = new HashMap<>();
		for(int i = 0; i < K; i++) {
			int row = s.nextInt();
			if(obstacles.get(row) == null) {
				List<Integer> col = new ArrayList<>();
				col.add(s.nextInt());
				obstacles.put(row, col);
			} else {
				List<Integer> col = obstacles.get(row);
				col.add(s.nextInt());
				obstacles.put(row, col);
			}
		}
		System.out.println(possibleAttackPoints(queen, obstacles, N));
	}
}

class Tupple {
	int row;
	int col;
	public Tupple(int row, int col) {
		this.row = row;
		this.col = col;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public void setCol(int col) {
		this.col = col;
	}
	public int getRow() {
		return row;
	}
	public int getCol() {
		return col;
	}

}