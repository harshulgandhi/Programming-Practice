package Hackerrank.Implementation;

import java.util.Arrays;
import java.util.Scanner;

public class FlatlandSpaceStations {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		if ( n == m ) {
			System.out.println(0);
			return;
		}
		int cities[] = new int[n];
		Arrays.fill(cities, 1);
		for (int i = 0; i < m; i++) {
			cities[s.nextInt()] = 99;
		}
		int maxDistance = 0;
		
		for ( int i = 0; i < n; i++) {
			if(cities[i] == 99) continue;
			int leftDistance = 999999;
			if(i > 0) {
				leftDistance= 0;
				for(int j = i-1; j>=0; j--) {
					leftDistance++;
					if(cities[j] == 99) break;
				}
//				System.out.println("Left distance for city "+i+" is "+leftDistance);
			}
			int rightDistance = 999999;
			if(i < n-1) {
				rightDistance = 0;
				for(int j = i+1; j<n; j++) {
					rightDistance++;
					if(cities[j] == 99) break;
				}
//				System.out.println("Right distance for city "+i+" is "+rightDistance);
			}
			int localMinDistance = leftDistance >= rightDistance ? rightDistance : leftDistance;
//			System.out.println("Local min distance from city "+i+" is "+localMinDistance);
			maxDistance = localMinDistance > maxDistance ? localMinDistance : maxDistance; 
		}
		
		System.out.println(maxDistance);
		
	}
}
