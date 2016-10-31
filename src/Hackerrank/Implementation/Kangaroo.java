package Hackerrank.Implementation;

import java.util.Scanner;

public class Kangaroo {
	
	private String doTheyMeet(float x_1, int v_1, int x_2, int v_2) {
		float whereTheyMeet = ((x_1 - x_2) / (v_2 - v_1)) + 1 ;
		if ( whereTheyMeet > 0 && (whereTheyMeet) % 1 == 0 ) {
			return "YES";
		} else {
			return "NO";
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Kangaroo o = new Kangaroo();
		System.out.println(o.doTheyMeet(s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt()));
	}
}
