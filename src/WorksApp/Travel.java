package WorksApp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class Travel {
	private HashMap<Integer, List<Integer>> graph = new HashMap<>();
	private List<Integer> festive = new ArrayList<>();
	private List<Integer> visited = new ArrayList<>();
	private int distance = 0;
	private boolean found = false;
	
	private void insertBidirectionalEdge(int a, int b){
		if(!graph.keySet().contains(a)){ graph.put(a,new ArrayList<>());}
		if(!graph.keySet().contains(b)){ graph.put(b,new ArrayList<>());}
		if(!graph.get(a).contains(b)) graph.get(a).add(b);
		if(!graph.get(b).contains(a)) graph.get(b).add(a);
	}
	
	private void printGraph(){
		for(Integer eachkey:graph.keySet()){
			System.out.print(eachkey+" ==> ");
			for (Integer eachnode: graph.get(eachkey)){
				System.out.print(eachnode+" - ");
			}
			System.out.println();
		}
	
	}
	
	private int nearestFestiveCityDistance(int t_city){
		System.out.println("Calling for "+t_city);
		visited.add(t_city);
		if(festive.contains(t_city)) {
//			System.out.println("found festive city");
			found = true;
			return distance++;
		}
		for(Integer key:graph.keySet()){
			if(graph.get(key).contains(t_city) && !visited.contains(key)){
//				distance+=1;
				nearestFestiveCityDistance(key);
				System.out.println("Coming out of : "+key+" distance : "+distance);
			}//else if(visited.contains(key)) distance -= 1; 
			if(found) {
				System.out.println("breaking");
				break;
			}
		}
		/*if(festive.contains(t_city)){
			System.out.println("found festive city");
			found = true;
			return distance;
		}
		else{
			for(Integer eachnode : graph.get(t_city)){
				if(eachnode != t_city){
					nearestFestiveCityDistance(eachnode);
					distance += 1;
				}
				if (found) break;
			}
		}*/
		if(found) return distance++;
		else return distance;
	}
	
	private void resetAttributes(){
		distance = 0;
		visited.clear();
		found = false;
		
	}
	public static void main(String[] args) {
		Travel obj = new Travel();
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();
		
		for(int i = 0;i<N-1;i++){
			obj.insertBidirectionalEdge(s.nextInt(), s.nextInt());
		}
//		obj.printGraph();
		obj.festive.add(2);
		for(int j = 0;j<M;j++){
			int q = s.nextInt(); 
			if(q == 1){
				obj.festive.add(s.nextInt());
			}
			else{
				System.out.println(obj.nearestFestiveCityDistance(s.nextInt()));
			}
			obj.resetAttributes();
		}
	}
}
/*
5 2
1 2
1 3
3 4
3 5
2 5
2 3

5 5
1 2
1 3
3 4
3 5
2 5
2 3
1 4
2 5
2 4
 * */
