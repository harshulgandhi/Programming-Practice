import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/* Class to find best path between a give Origin and 
 * destination in a partially bidirected un-equally
 * weighted graph
 * Applied Djikstra's algorithm solve this particular
 * case
 * */
public class Trains {
	private Map<Character, Station> stationsGraph = null;
	private char origin, destination;
	List<Station> unvisited = new ArrayList<>();
	List<Character> path = new ArrayList<>();
	
	/**
	 * Connecting two stations with appropriate weight for the edge
	 * @param station_a: from station
	 * @param station_b: to station
	 * @param distance_a_b: travel time from station a to b 
	 * */
	public void connectStations(char station_a, char station_b, int distance_a_b){
		if(!stationsGraph.keySet().contains(station_a)){
			if(station_a == origin) stationsGraph.put(station_a, new Station(station_a,0));	//Mapping station name ('A') with its object
			else stationsGraph.put(station_a, new Station(station_a,Integer.MAX_VALUE));
			unvisited.add(stationsGraph.get(station_a));
		}
		if(!stationsGraph.keySet().contains(station_b)){
			if(station_b == origin) stationsGraph.put(station_b, new Station(station_b,0));
			else stationsGraph.put(station_b, new Station(station_b,Integer.MAX_VALUE));
			unvisited.add(stationsGraph.get(station_b));
		}
		stationsGraph.get(station_a).addNeighbourStation(stationsGraph.get(station_b), distance_a_b);	//Adding station b as neighbor to
	}																									//station a with distance as 'distance_a_b'
	
	
	
	/**
	 * Function to print the graph
	 * for verification purposes
	 * */
	private void printStationGraph(){
		for(Station eachNode:stationsGraph.values()){
			if(eachNode.getPreviousStation()!=null) System.out.print(eachNode.getName()+"["+eachNode.getPreviousStation().getName()+"] ==> ");
			else System.out.print(eachNode.getName()+" ==> ");
			for(Station eachneigh : eachNode.neighbourStations.keySet()){
				if(eachneigh.getPreviousStation()!= null) System.out.print(eachneigh.getName()+" ["+eachNode.neighbourStations.get(eachneigh)+"]["+eachneigh.getPreviousStation().getName()+"] - ");
				else System.out.print(eachneigh.getName()+" ["+eachNode.neighbourStations.get(eachneigh)+"] - ");
			}
			System.out.println();
		}
	}
	
	/**
	 * Function to print the path
	 * */
	private void printPath(){
		for(char eachStation:path){
			System.out.print(eachStation+" --> ");
		}
		System.out.print(this.destination);
	}
	
	/**
	 *Method returns station with minimum initial distance
	 *that is assigned in the beginning of the program
	 *(Djikstra's algorithm specific) 
	 **/
	private Station getMinimumInitialDistance(){
		int min = Integer.MAX_VALUE;
		Station minDistanceStation=null;
		for(Station eachstation:unvisited){
			if(eachstation.getInitialDistance()< min) minDistanceStation = eachstation;
		}
		return minDistanceStation;
		
	}

	/**
	 * Method that finds best path between 
	 * origin and destination using Djikstra's
	 * algorithm applied on a graph*/
	private void findPath(){
		while(!unvisited.isEmpty()){
			Station currStation = getMinimumInitialDistance();
			unvisited.remove(currStation);
			for(Station eachneighbour : currStation.neighbourStations.keySet()){
				int alt = currStation.getInitialDistance() + currStation.neighbourStations.get(eachneighbour);
				if(alt < eachneighbour.getInitialDistance()){
					eachneighbour.setInitialDistance(alt);
					eachneighbour.setPreviousStation(currStation);
				}
			}
		}
	}
	
	/**
	 *Method to get actual path between origin and destination
	 *from the graph 
	 */
	public char getPath(Station origin, Station destination){
		if(destination== origin){
			return origin.getName();
		}
		path.add(getPath(origin, destination.getPreviousStation()));
		
		return destination.getName();
	}
	
	
	public static void main(String[] args) {
		Trains obj = new Trains();
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		obj.stationsGraph = new HashMap<>();
		
		obj.origin = s.next().charAt(0);
		obj.destination = s.next().charAt(0);
		
		for(int i = 0; i < N ; i++){
			obj.connectStations(s.next().charAt(0), s.next().charAt(0), s.nextInt());
		}
		obj.findPath();
//		obj.printStationGraph();
		obj.getPath(obj.stationsGraph.get(obj.origin), obj.stationsGraph.get(obj.destination));
		obj.printPath();
	}
	
	/**
	 * Station inner class that hold all information about
	 * any station
	 */
	private class Station{
		private char name;
		private int initialDistance;
		Map<Station, Integer> neighbourStations = new HashMap<>();
		private Station previousStation = null;
		
		Station(char name, int initialDistance){
			this.name = name;
			this.initialDistance = initialDistance;
		}
		
		public void addNeighbourStation(Station station, int distance){
			neighbourStations.put(station, distance);
		}
		
		public void setPreviousStation(Station prev){
			previousStation = prev;
		}
		
		public Station getPreviousStation(){
			return previousStation;
		}
		
		public char getName(){
			return name;
		}
		
		public int getInitialDistance(){
			return initialDistance;
		}
		
		public void setInitialDistance(int distance){
			initialDistance = distance;
		}
		
		@Override
		public String toString(){
			return name+" ";
		}
		
		@Override
		public int hashCode(){
			return name;
		}
	}
}
