package com.practice.before2017.WorksApp;

import java.util.*;
import java.lang.*;
import java.io.*;


public class festiv {
	  
	//The cityMap is a map which will map a city to other cities with which it is linked.
    Map<Integer, List<Integer>> cityMap = new HashMap<Integer, List<Integer>>(); 
    //The festiveCitiesList lists all the festive cities.
    List<Integer> festiveCitiesList= new ArrayList<Integer>();
    int countFestive = 0;
    //distance stores the shortest distance between the given city and the nearest festive city.
    int distance=0;
    List<Integer> festList = new ArrayList<>();
    
    //createGraph creates a graph with interconnected cities.
    public void createGraph( int m,int n)
     {

    	//if the graph1 does not contain m and n then it adds them
       if(!cityMap.containsKey(m))
       {
            cityMap.put(m, new ArrayList<Integer>());
       }
       if(!cityMap.containsKey(n))
       {
            cityMap.put(n, new ArrayList<Integer>());
       }
       
      cityMap.get(m).add(n);
      cityMap.get(n).add(m);
   }
   
    
    //printGraph prints graph
    public void printGraph()
    {
        for (int name: cityMap.keySet()){            
            System.out.println(name+"->"+cityMap.get(name));
        } 
    }
    
    //It prints the Shortest Distance to the festive city
    public int getShortestPath(int a)
    {
    	System.out.println("Checking for : "+a);
    	//It checks whether the given city whose number is a is a festive city in itself
    	if(festiveCitiesList.contains(a)){
    		return distance=0;
    	}
    	
    	//It checks whether any of the adjacent cities of city whose number is a is a festive city
    	for(int c:cityMap.get(a)){
    		if(festiveCitiesList.contains(c)){
    			countFestive++;
    			festList.add(c);
    			return 1;   			
    		}
    	}
    	if(distance==0){
    		for(int b:cityMap.get(a)){
    			System.out.println("Traversing neigh "+b);
    			distance=getShortestPath(b);
    			System.out.println("Distance returned "+distance);
    		}
    		distance++;
    	}
    	System.out.println("Returning : "+distance);
    	return distance;
    }
 
    
    public static void main(String[] args) {
        
       festiv festiveCities= new festiv();
       festiveCities.festiveCitiesList.add(1);
       try
       {
         Scanner scanner =new Scanner(System.in);      
         int numberOfCities=0;
         int numberOfQueries=0;
         numberOfCities=scanner.nextInt();
         numberOfQueries=scanner.nextInt();
     
         for(int i=0;i<numberOfCities-1;i++)
          {
           int m=scanner.nextInt();
           int n=scanner.nextInt();
           festiveCities.createGraph( m,n);
          }
        System.out.println();
        //festiveCities.printGraph();
        
        for(int i=0;i<numberOfQueries;i++)
         {
           int m=scanner.nextInt();
           int n=scanner.nextInt();
           if(m==1)
           {
        	   festiveCities.festiveCitiesList.add(n);
           }
           else
           {
        	  int requiredDistance= festiveCities.getShortestPath(n);
        	  System.out.println(requiredDistance);
        	  System.out.println(festiveCities.countFestive);
        	  festiveCities.distance = 0;
        	  festiveCities.countFestive = 0;
           }
         }
       }
       catch(Exception exception)
       {
    	   exception.printStackTrace();
       }
     
}
}
