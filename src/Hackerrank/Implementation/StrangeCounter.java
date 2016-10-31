package Hackerrank.Implementation;

import java.util.Scanner;

public class StrangeCounter {
	
	private long fintValue(long t) {
		long cycle = (long) Math.ceil((Math.log(t/3d + 1) / Math.log(2)));
		long value = (long) (3*(Math.pow(2, cycle) - 1) - t + 1);
		return value;	
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long t = s.nextLong();
		StrangeCounter o = new StrangeCounter();
		System.out.println(o.fintValue(t));
		
	}
}
