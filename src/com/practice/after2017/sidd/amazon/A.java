package com.practice.after2017.sidd.amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;


public class A {

	
	private double pointsDistance(int x2, int y2){
		return Math.hypot(0-x2, 0-y2);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);		
		A a = new A();
		List<List<Integer>> allLocations = new ArrayList<>();
	       allLocations.add(Arrays.asList(3,6));
	       allLocations.add(Arrays.asList(2,4));
	       allLocations.add(Arrays.asList(5,3));
	       allLocations.add(Arrays.asList(2,7));
	       allLocations.add(Arrays.asList(1,8));
	       allLocations.add(Arrays.asList(7,9));
	       
		List<List<Integer>> clossestLocations = a.closestLocations(6, allLocations, 3);
		System.out.println(clossestLocations);
		
	}
	
	List<List<Integer>> closestLocations(int totalCrates, List<List<Integer>> allLocations, int truckCapacity){
		PriorityQueue<Distance> queue = new PriorityQueue<Distance>();
		   for (int i = 0; i < allLocations.size(); i++) {
			   List<Integer> currLocation = allLocations.get(i);
			   queue.add(new Distance(pointsDistance(currLocation.get(0), currLocation.get(1)), currLocation.get(0), currLocation.get(1)));
		   }
		   
		   List<List<Integer>> clossestLocations = new ArrayList<>();
		   for(int i = 0; i< truckCapacity;i++){
			   Distance d = queue.poll();
			   clossestLocations.add(Arrays.asList(d.x, d.y));
		   }
		   return  clossestLocations;
		}

		class Distance implements Comparable<Distance>{
		   double dist;
		   int x;
		   int y;
			public Distance(double pointsDistance, Integer x, Integer y) {
				this.dist = pointsDistance;
				this.x = x;
				this.y = y;
			}
			@Override
		    public int compareTo(Distance o) {
		        return Double.compare(dist, o.dist);
		    }
		}

}
