package com.practice.before2017.WorksApp;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Travel {
	private City[] graph = null;
	
	
	private void connectCities(int city_a, int city_b){
		if(graph[city_a] == null) graph[city_a] = new City(city_a);
		if(graph[city_b] == null) graph[city_b] = new City(city_b);
		graph[city_a].addNeighbour(graph[city_b]);
		graph[city_b].addNeighbour(graph[city_a]);
	}
	
	/*
	 * Function to print the graph
	 * for verification purposes
	 * */
	private void printGraph(){
		for(City eachNode:graph){
			System.out.print(eachNode.number+"("+eachNode.isFestive+") ==> ");
			for(City each:eachNode.neighbours){
				System.out.print(each+" - ");
			}
			System.out.println();
		}
	}
	
	private int nearestFestiveCityDistance(City goingTo, City comingFrom){
		int min = Integer.MAX_VALUE-1;
		if(goingTo.isFestive) {
			return 0;
		}
		for(City neighbour : goingTo.neighbours){
			if(neighbour != comingFrom){
				int distance = nearestFestiveCityDistance(neighbour, goingTo);
				if(distance < min) min = distance;
			} 
		}
		return min + 1;
	}
	
	
	public static void main(String[] args) {
		Travel obj = new Travel();
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();
		obj.graph = new City[N+1];
		for(int i = 0;i<N-1;i++){
			obj.connectCities(s.nextInt(), s.nextInt());
		}
//		obj.printGraph();
		obj.graph[1].isFestive = true;
		
		for(int j = 0;j<M;j++){
			int q = s.nextInt(); 
			if(q == 1){
				int city = s.nextInt();
				obj.graph[city].isFestive = true;
			}
			else{
				System.out.println(obj.nearestFestiveCityDistance(obj.graph[s.nextInt()], null));
			}
		}
	}
	
	private class City{
		int number = 0;
		Set<City> neighbours = new HashSet<>();
		boolean isFestive  = false;
		
		City(int number){
			this.number = number;
		}
		
		public void addNeighbour(City city){
			neighbours.add(city);
		}
		
		@Override
		public String toString(){
			return number+" ";
		}
		
		@Override
		public int hashCode(){
			return number;
		}
	}
}

