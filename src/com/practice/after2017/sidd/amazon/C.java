package com.practice.after2017.sidd.amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

class C {
   public static void main(String[] args) {
       int totalCrates = 6;
       List<List<Integer>> allLocations = new ArrayList<>();
       allLocations.add(Arrays.asList(3,6));
       allLocations.add(Arrays.asList(2,4));
       allLocations.add(Arrays.asList(5,3));
       allLocations.add(Arrays.asList(2,7));
       allLocations.add(Arrays.asList(2,4));
       allLocations.add(Arrays.asList(0,0));
       int truckCapacity = 6;
       List<List<Integer>> output = new C().closestLocations(totalCrates, allLocations, truckCapacity);
       for (int i = 0; i < output.size(); i++) {
           System.out.println(output.get(i));
       }
   }

   List<List<Integer>> closestLocations(int totalCrates, List<List<Integer>> allLocations, int truckCapacity) {
       PriorityQueue<Distance> minDistance = new PriorityQueue<>();
       for (int i = 0; i < allLocations.size(); i++) {
           List<Integer> item = allLocations.get(i);
           int x = item.get(0);
           int y = item.get(1);
           double distance = Math.sqrt(x * x + y * y);
           Distance distObj = new Distance(distance, x, y);
           minDistance.add(distObj);
       }

       List<List<Integer>> output = new ArrayList<>();
       for (int i = 0; i < truckCapacity; i++) {
           Distance distObj = minDistance.poll();
           List<Integer> list = Arrays.asList(distObj.x, distObj.y);
           output.add(list);
       }
       return output;
   }

   class Distance implements Comparable<Distance> {
       double dist;
       int x;
       int y;

       public Distance(double dist, int x, int y) {
           this.dist = dist;
           this.x = x;
           this.y = y;
       }

       @Override
       public int compareTo(Distance o) {
           return Double.compare(this.dist, o.dist);
       }
   }
}

