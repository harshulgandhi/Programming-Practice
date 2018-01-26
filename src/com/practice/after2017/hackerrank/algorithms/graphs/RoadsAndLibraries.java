package com.practice.after2017.hackerrank.algorithms.graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class RoadsAndLibraries {
	
	public int findMinCost(int libCost, int pathCost, List<City> cities) {
		int minCost = Integer.MAX_VALUE;
		int currCost = 0;
		Set<Integer> visitedIds = new HashSet<>();
		City start = cities.get(0);
		start.hasLib=true;
		currCost += libCost;
		visitedIds.add(start.getId());
		Queue<City> toVisit = new LinkedList<>();
		toVisit.addAll(start.getNeighbours());
		while(!toVisit.isEmpty()) {
			City curr = toVisit.poll();
			if(!visitedIds.contains(curr.getId())) {
				currCost += pathCost;
				toVisit.addAll(curr.getNeighbours());
				visitedIds.add(curr.getId());
			}
		}
		return currCost;
	}
	
	public static City getCityById(int id, List<City> cities) {
		for(City each : cities) {
			if(each.getId() == id) {
				return each;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int Q = s.nextInt();
		while(Q-- > 0) {
			int noOfCities = s.nextInt();
			int noOfRoads = s.nextInt();
			int libCost = s.nextInt();
			int pathCost = s.nextInt();
			List<City> cities = new ArrayList<>();
			for(int i = 1; i <= noOfCities; i++) {
				cities.add(new City(i, false));
			}
			
			for(int i = 0; i<noOfRoads; i++) {
				City city1 = getCityById(s.nextInt(), cities);
				City city2 = getCityById(s.nextInt(), cities);
				city1.addNeighbour(city2);
				city2.addNeighbour(city1);
			}
			
			if(pathCost > libCost) {
				System.out.println(noOfCities*libCost);
				return;
			}
			Collections.sort(cities, new Comparator<City>(){
				@Override
				public int compare(City o1, City o2) {
					return Integer.compare(o2.getNeighbours().size(), o1.getNeighbours().size());
				}
			});
			
			RoadsAndLibraries ral = new RoadsAndLibraries();
			System.out.println(ral.findMinCost(libCost, pathCost, cities));
		}
	}
}

class City{
	int id;
	List<City> neighbour;
	boolean hasLib;
	
	public City(int id, boolean hasLib) {
		this.id = id;
		this.hasLib = hasLib;
	}
	
	public void addNeighbour(City city) {
		if(neighbour == null) {
			neighbour = new ArrayList<>();
		}
		neighbour.add(city);
	}
	
	public List<City> getNeighbours() {
		return neighbour;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
}
