import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Trains {
	private Station[] graphStation = null;
	char origin, destination;
	
	private void connectStations(char city_a, char station_b, int distance_a_b){
		if((graphStation[(int)city_a - (int)'A']) == null) graphStation[(int)city_a - (int)'A'] = new Station(city_a);
		if((graphStation[(int)station_b - (int)'A']) == null) graphStation[(int)station_b - (int)'A'] = new Station(station_b);
		graphStation[(int)city_a - (int)'A'].addNeighbourStation(graphStation[(int)station_b - (int)'A'], distance_a_b);
	}
	
	/*
	 * Function to print the graph
	 * for verification purposes
	 * */
	private void printStationGraph(){
		for(Station eachNode:graphStation){
			System.out.print(eachNode.name+" ==> ");
			for(Station eachneigh:eachNode.neighbourStations.keySet()){
				System.out.print(eachneigh.name+" ["+eachNode.neighbourStations.get(eachneigh)+"] - ");
			}
			System.out.println();
		}
	}
	
	private int nearestTrainStationDistance(Station goingTo, Station comingFrom){
		int min = Integer.MAX_VALUE-1;
		System.out.println(" goingTo.name : "+goingTo.name);
		if(goingTo.name == destination) {
			return comingFrom.neighbourStations.get(goingTo);		//return distance between coming from station and going to station
		}
		for(Station neighbour : goingTo.neighbourStations.keySet()){
			if(neighbour != comingFrom){
				int distance = nearestTrainStationDistance(neighbour, goingTo);
				if(distance < min) min = distance;
			} 
		}
		return min + 1;
	}
	
	
	
	public static void main(String[] args) {
		Trains obj = new Trains();
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();
		obj.graphStation = new Station[5]; //Hard coded to 5 - A, B,C,D,E
		
		for(int i = 0; i < N-1 ; i++){
			obj.connectStations(s.next().charAt(0), s.next().charAt(0), s.nextInt());
		}
		obj.printStationGraph();
		obj.origin = s.next().charAt(0);
		obj.destination = s.next().charAt(0);
		System.out.println(obj.nearestTrainStationDistance(obj.graphStation[(int)obj.origin-(int)'A'], null));
	}
	
	private class Station{
		int number = 0;
		char name;
		Map<Station, Integer> neighbourStations = new HashMap<>();
		
		Station(char name){
			this.name = name;
		}
		
		public void addNeighbourStation(Station station, int distance){
			neighbourStations.put(station, distance);
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

/*
10 5
A B 3
B A 3
A D 6
B C 7
D B 5
C D 8
D C 9
D E 9
E D 9
C E 3
A C
 * 
 * */
